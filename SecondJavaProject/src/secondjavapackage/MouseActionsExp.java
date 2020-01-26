package secondjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsExp {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.get("http://ebay.com");

		// Thread.sleep(10000);
		// WebElement myEbayLink 
		= driver.findElement(By.xpath(".//*[text()=' My
		// eBay']"));

		WebElement ele1 = driver.findElement(By.id("gh-btn"));
		WebElement ele2 = driver.findElement
				(By.id("gf-norton"));

		Actions act = new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();

//		act.moveToElement(myEbayLink).perform();
//
//		Thread.sleep(1000);
//		driver.findElement
		(By.xpath("(.//*[@role='navigation'])[2]/li[9]/a")).
		click();

// act.contextClick(ele).perform();

//		act.click(ele).perform();

	}

}
