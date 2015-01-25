package Samples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExtractAll_Links {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://bbc.com");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("Total links -> "+ allLinks.size());
	
	// 35th link
	WebElement link35 = allLinks.get(34);
	//System.out.println(link35);
	//System.out.println(link35.getText());
	
	for(int i=0;i<allLinks.size();i++){
		System.out.println(allLinks.get(i).getText()+" ---- "+allLinks.get(i).isDisplayed());
	}
	// screenshot
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("D:\\Application\\Aishwarya_Selenium\\General\\ExtractAllLinksbbc.jpg"));

	// hidden , no text
	
	}

}
