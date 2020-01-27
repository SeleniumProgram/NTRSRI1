package secondjavapackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadingAndStaleException {

	WebDriver driver;

	// OpenBrowser
	public WebDriver openBrowser(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}
	// entering the text

	public void enterText(WebDriver driver, String searchValue) {
		WebElement srchBox = driver.findElement(By.id("twotabsearchtextbox"));
		srchBox.sendKeys(searchValue);
	}

	// clickButton
	public void clickButton(WebDriver driver) {
		WebElement srchBtn = driver.findElement(By.className("nav-input"));
		srchBtn.click();
	}

	// close browser
	public void closeChrome(WebDriver driver) {
		driver.quit();
	}

	public static void main(String[] args) throws Exception {

		ExcelReadingAndStaleException obj = new ExcelReadingAndStaleException();

		XSSFWorkbook wb = new XSSFWorkbook("TestData.xlsx");

		XSSFSheet sh = wb.getSheet("Data");

		int rowCount = sh.getPhysicalNumberOfRows();

		WebDriver driver = obj.openBrowser("http://amazon.in");
		for (int i = 1; i < rowCount; i++) {
			int colCount = sh.getRow(1).getPhysicalNumberOfCells();

			for (int j = 0; j < colCount; j++) {
				String searchValue = sh.getRow(i).getCell(j).getStringCellValue();

				// System.out.println(searchValue);

				obj.enterText(driver, searchValue);
				obj.clickButton(driver);

				// srchBox is identified in the old page so we need to
				// reidentify the object otherwise we will get "stalelementrefferrenceException"
				Thread.sleep(5000);
				WebElement srchBox1 = driver.findElement(By.id("twotabsearchtextbox"));
				srchBox1.clear();

			}

		}

		obj.closeChrome(driver);
	}

}
