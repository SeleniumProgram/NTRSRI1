package secondjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmExample {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://paytm.com");
		Thread.sleep(5000);
		WebElement login=driver.findElement
				(By.className("_3ac-"));
		login.click();
		Thread.sleep(8000);
		
		List<WebElement> frames=
				driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//driver.switchTo().frame(0);
		
		WebElement link=driver.findElement(By.xpath
(".//*[text()='Login/Signup with mobile number and password']"));
		link.click();
		
		
	}

}
