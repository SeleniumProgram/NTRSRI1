package secondjavapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailExample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement ele1 = driver.findElement(By.id("identifierId"));
		ele1.sendKeys("kalyan");

		WebElement ele2 = driver.findElement(By.xpath(".//*[text()='Next']"));
		ele2.click();

		WebElement ele3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		ele3.sendKeys("abcd");
	}

}
