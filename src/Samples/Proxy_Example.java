package Samples;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Proxy_Example {

	public static void main(String[] args) {
		Proxy pro=new Proxy();
		pro.setProxyAutoconfigUrl("http://proxyman.info");
		//http://freeproxyserver.net/
		DesiredCapabilities Cap=new DesiredCapabilities();
		Cap.setCapability(CapabilityType.BROWSER_NAME, "Firefox");
		Cap.setCapability(CapabilityType.PROXY, pro);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		

	}

}
