package secondjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		Thread.sleep(15000);
		driver.findElement(By.className("LM6RPg")).sendKeys("Sling Bags");
		driver.findElement(By.className("vh79eN")).click();
		
	}

}
