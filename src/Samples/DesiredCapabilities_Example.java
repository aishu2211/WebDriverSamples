package Samples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilities_Example {

	
	public static void main(String[] args) {
		
		DesiredCapabilities capailities = new DesiredCapabilities();
		capailities.setJavascriptEnabled(true);
		//capailities.setCapability(CapabilityType.PROXY, value);
		
		
		FirefoxDriver driver = new FirefoxDriver(capailities);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Aishwarya_Selenium\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d1 = new ChromeDriver(capailities);
		
		System.setProperty("webdriver.ie.driver", "D:\\Application\\Aishwarya_Selenium\\Jar Files\\IEDriverServer_x64_2.42.0\\IEDriverServer.exe");
		InternetExplorerDriver d2 = new InternetExplorerDriver(capailities);
		
		

	}

}
