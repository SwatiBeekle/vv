package SeleniumWebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
			driver.get("https://ui.freecrm.com/");
			
			driver.findElement(By.name("email")).sendKeys("swatibeekle97@gmail.com");
			driver.findElement(By.name("password")).sendKeys("SwatiBeekle25");
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
			
			String date = "30-December -2020";
			String datearray[]=date.split("-");
			
			String day = datearray[0];   //30-december-2020;
			String month = datearray[1];
			String year = datearray[2];
			
			Select select = new Select(driver.findElement(By.xpath("//span[contains(text(),'December 2020')]")));
			select.selectByVisibleText(month);
			
			//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]
			//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div[7]
			
			
			
			
			
			
			
			
			

	}

}
