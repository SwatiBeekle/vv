package SeleniumWebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtableHandle {

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
			
			//click on contack page
			driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
			
		//method-1	
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]
			
//			String beforexpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
//			String afterxpath="]/td[2]/a";
//			
//			for(int i=1; i<=3; i++) {
//				String name = driver.findElement(By.xpath(beforexpath +i+ afterxpath)).getText();
//				System.out.println(name);
//				if(name.contains("sainath B")){
//					driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[" +i+ "]/td[1]/div/input")).click();
//					}
//				}
		
			//method=2
			driver.findElement(By.xpath("//a[contains(text(),'sainath B')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	
	
	}

}
