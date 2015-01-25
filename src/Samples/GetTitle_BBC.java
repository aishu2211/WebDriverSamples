package Samples;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle_BBC {

public static void main(String[] args) {


		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bbc.com");
		
		driver.findElement(By.xpath("//*[@id='blq-main']/div/div[2]/div[3]/div[1]/h2/a")).click();
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//a[text()='Asia News']")).click();
		//System.out.println(driver.getTitle());	
		
	}

}