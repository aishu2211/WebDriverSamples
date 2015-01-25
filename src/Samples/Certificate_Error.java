package Samples;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Certificate_Error {

	public static void main(String[] args) {
		//FirefoxProfile fp = new FirefoxProfile();
		//fp.setAcceptUntrustedCertificates(true);
		//fp.setAssumeUntrustedCertificateIssuer(false);
		
		
		//WebDriver driver = new FirefoxDriver(fp);
		System.setProperty("webdriver.chrome.driver", "D://Application//Aishwarya_Selenium//Jar Files//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("URL");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> iter = ids.iterator();
		String mainWindowId = iter.next();
		String tabWindowId = iter.next();
		driver.switchTo().window(tabWindowId);
		driver.findElement(By.xpath("")).click();
		// certificate err
		// IE
		//driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		
	}

}
