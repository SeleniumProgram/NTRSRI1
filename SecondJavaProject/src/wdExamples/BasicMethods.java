package wdExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	
	public static void main(String[] args) {
		//this line will open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		driver.get("http://flipkart.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		

	}

}
