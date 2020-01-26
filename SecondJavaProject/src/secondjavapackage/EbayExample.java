package secondjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		WebElement ebaySrchBox = driver.findElement(By.id("gh-acdjsgkdjfgjsdflglsdfjglsjdf"));
		ebaySrchBox.sendKeys("Bags");

		WebElement ebaySrchBtn = driver.findElement(By.id("gh-btn"));
		ebaySrchBtn.click();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Mobiles | eBay";

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page opened");
		} else {
			System.out.println("Page not opened");
		}

	}

}
