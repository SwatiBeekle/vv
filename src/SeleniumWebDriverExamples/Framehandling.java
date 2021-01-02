package SeleniumWebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("email")).sendKeys("swatibeekle97@gmail.com");
		driver.findElement(By.name("password")).sendKeys("SwatiBeekle25");
		driver.findElement(By.xpath("//div[contains(text(),'Login')][@class='ui fluid large blue submit button']")).click();
		
		driver.switchTo().frame("mainpanel");//("0");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		
	}

}
