package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {
	
	// test the home page of Gmail
	@Test
	public void testHomePage(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Aishwarya_Selenium\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		/*
		WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys("dummyname");
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("xxxxxxx");
		
		WebElement button = driver.findElement(By.id("signIn"));
		button.click();
		*/
		
		driver.findElement(By.id("Email")).sendKeys("aishu2211@gmail.com");
		driver.findElement(By.name("Passwd")).sendKeys("2210blue");
		driver.findElement(By.id("signIn")).click();
		
		
		// writing email into email field
		/*driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		driver.findElement(By.xpath("html/body/div[14]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("vivek7124@gmail.com");
		driver.findElement(By.xpath("html/body/div[14]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")).sendKeys("This is a test mail");
		
		String x = driver.findElement(By.xpath("//*[@id=':ry']")).getText();
		System.out.println(x);
		
		//driver.findElement(By.className("g-button g-button-submit")).click();
		driver.findElement(By.xpath("html/body/div[14]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
		*/
		
		
		
	}

}


