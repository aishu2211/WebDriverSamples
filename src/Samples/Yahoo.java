package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		
		String browser = "Mozilla"; // properties
		WebDriver driver = null;
		
		if(browser.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if(browser.equals("IE")){
		// exe path
		}
		

		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//input[@id='p_13838465-p']")).sendKeys("hello");
		// implicit and explicit
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//*[@id='p_13838465-results']/li[3]/a")).getText();
		System.out.println(text);
		
	}

}
