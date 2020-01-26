package interfaceExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerification {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://google.com");

		WebElement ele = driver.findElement(By.linkText("Gmail"));
		boolean availability = ele.isDisplayed();
		if (availability == true) {
			System.out.println("Link available");
		} else {
			System.out.println("Link not available");
		}
		

	}

}
