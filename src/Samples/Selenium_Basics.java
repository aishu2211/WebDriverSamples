package Samples;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Selenium_Basics {

	public static void main(String[] args){
		
		FirefoxDriver driver=new FirefoxDriver();
		
		//To find the binary of Firefox
		
		//FirefoxBinary binary=new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
		//FirefoxDriver driver1=new FirefoxDriver(binary,null);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\Aishwarya_Selenium\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d1=new ChromeDriver();
		d1.get("http://gmail.com");
		
		System.setProperty("webdriver.ie.driver", "D:\\Application\\Aishwarya_Selenium\\Jar Files\\IEDriverServer_x64_2.42.0\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://bbc.com");
		
		
	}
}
