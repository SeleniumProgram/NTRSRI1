package secondjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDExample {

	public static void main(String[] args) {
		 	WebElement dropdown = driver.findElement
		 			(By.id("gh-cat"));

		Select sel = new Select(dropdown);
//		WebElement ele = sel.getFirstSelectedOption();
//		String defaultvalue = ele.getText();
//		if (defaultvalue.equals("All Categories")) {
//			System.out.println("Default value matched");
//		} else {
//			System.out.println("Default value not matched");
//		}

		List<WebElement> items = sel.getOptions();
		
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		
		
		
//		for (int i = 0; i < items.size(); i++) {
//			String text = items.get(i).getText();
//			System.out.println(text);
//		}

		// sel.selectByValue("11233");

		// sel.selectByVisibleText("Crafts");
		// sel.selectByIndex(4);

	}

}
