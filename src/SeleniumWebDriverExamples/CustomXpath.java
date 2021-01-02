package SeleniumWebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://community.ebay.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("selenium");
		
		//contains
		driver.findElement(By.xpath("//input[contains(@class,'gh-ac']")).sendKeys("java");
		//id
		//id=test_45
		
		//starts-with
        //id=test_123
		//id=test_456
		
		//ends-with
		//id=test_456_test
		//id=456_test_t
		
		driver.findElement(By.xpath("//input[contains(@id,'test_']")).sendKeys("test");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_']")).sendKeys("test");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t']")).sendKeys("test");
		
		
		//link
		driver.findElement(By.xpath("//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")).click();
		
	}

}
