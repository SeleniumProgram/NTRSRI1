package secondjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.get("http://maa.patasala.co/");
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("maa@maa.in");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"signInBtn\"]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@class='settings']/a")).click();
		Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/div/div/button[4]")).click();
	}
	
	

}
