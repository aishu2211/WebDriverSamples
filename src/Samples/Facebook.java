package Samples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Facebook {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		List<WebElement> fields = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(fields.size());
		
		fields.get(0).sendKeys("one");
		fields.get(1).sendKeys("two");
		fields.get(2).sendKeys("three");
		fields.get(3).sendKeys("four");
		fields.get(4).sendKeys("five");
		fields.get(5).sendKeys("six");
		fields.get(6).sendKeys("seven");
		fields.get(7).sendKeys("eight");
	
	}

}
