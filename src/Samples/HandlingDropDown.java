package Samples;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropDown {

	
	public static void main(String[] args) {

		// select , find total , print ,selected
		WebDriver driver = new FirefoxDriver();
		driver.get("http://timesofindia.com");
		WebElement droplist = driver.findElement(By.xpath("//select[@class='other-select']"));
		droplist.sendKeys("Chennai");
		List<WebElement> allOptions = droplist.findElements(By.tagName("option"));
		System.out.println("Total options in list -> "+ allOptions.size());
		
		for(int i=0;i<allOptions.size();i++){
			System.out.println(allOptions.get(i).getText()+" ---- "+ allOptions.get(i).getAttribute("selected"));
		}
		
	}

}
