package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TextFields_Buttons {

	
	public static void main(String[] args) {
		// write, read, clear
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
				
		
		
		driver.manage().window().maximize();
		driver.get("http://www.golfclubs.com/");
		String x = driver.findElement(By.xpath("//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).getAttribute("value");
		System.out.println(x);// search
		driver.findElement(By.xpath("//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).sendKeys("nokia");
		x = driver.findElement(By.xpath("//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).getAttribute("value");
		System.out.println(x); // nokia
		driver.findElement(By.xpath("//*[@id='navbar-slide']/div[2]/div/form[1]/div/input")).clear();// clear
		
		// buttons
		//click, read the text
		
		x = driver.findElement(By.xpath("//*[@id='email-signup-form']/div[2]/span/input")).getAttribute("value");
		System.out.println(x);// button text
		
	}

}
