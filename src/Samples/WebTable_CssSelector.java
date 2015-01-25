package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTable_CssSelector {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		
		//String xpath="html/body/div[6]/section[2]/div[1]/table/tbody/tr[8]/td[5]/a";
		String xpath="//[@class='tpl-fluid']/div[4]/div[3]/tr[8]/td[3]";
		String cSelec="table[class='border2 lpad wa wc-tab ccols4'] tbody tr:nth-child(3) td:nth-child(3) a";
		System.out.println(driver.findElement(By.xpath(xpath)).getText());
	}

}
