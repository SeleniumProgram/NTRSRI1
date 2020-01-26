package secondjavapackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHExample {

	public void closewindow(WebDriver driver, 
			String titleToClose) {
		Set<String> ids = driver.getWindowHandles();

		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.equals(titleToClose)) {
				driver.close();
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		WHExample obj = new WHExample();
		obj.closewindow(driver, "Croma");
		obj.closewindow(driver, "Tech Mahindra");

		// 4 windows will be opened

	}

}
