package secondjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

               public class ObjectIdentification {
	          public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");;
		driver.findElement(By.className("nav-input")).click();
		
	}

}
