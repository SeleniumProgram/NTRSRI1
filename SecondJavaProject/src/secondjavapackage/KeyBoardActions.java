package secondjavapackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) 
			throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://amazon.in");
		Thread.sleep(10000);

		Actions act = new Actions(driver);
		act
		.keyDown(Keys.CONTROL)
		.sendKeys(Keys.F5)
		.keyUp(Keys.CONTROL)
		.perform();

	}

}
