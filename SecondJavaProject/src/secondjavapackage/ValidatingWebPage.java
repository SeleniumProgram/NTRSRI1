package secondjavapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingWebPage {

	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		Methods obj=new Methods();
		obj.verifyTitle(driver, "Google");

	}

}
