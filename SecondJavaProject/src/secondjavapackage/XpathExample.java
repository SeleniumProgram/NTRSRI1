package secondjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/"
				+ "search?q=mobiles&otracker=search&otracker1"
				+ "=search&marketplace=FLIPKART&as-show=on&as=off");

		WebElement ele = driver.findElement
				(By.xpath("(.//*[@class='_3wU53n'])[10]"));
		ele.click();
//
//		List<WebElement> mobileNames = 
		driver.findElements(By.className("_3wU53n"));
//
//		List<WebElement> prices = 
		driver.findElements(By.xpath(".//*[@class='_1vC4OE _2rQ-NK']"));
//
//		for (int i = 0; i < mobileNames.size(); i++) {
//			String name = mobileNames.get(i).getText();
//			System.out.println(name);
//			String price = prices.get(i).getText();
//			System.out.println(price);
//
//		}

	}

}
