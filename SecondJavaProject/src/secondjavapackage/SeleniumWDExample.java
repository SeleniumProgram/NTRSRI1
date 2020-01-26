package secondjavapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SeleniumWDExample {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.close();
		driver.quit();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
		
		
	}

}
