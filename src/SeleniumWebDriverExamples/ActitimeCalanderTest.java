package SeleniumWebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class ActitimeCalanderTest {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/login.do");

		System.out.println("before login title "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//button[@id='ext-gen23']")).click();
		
		String data = "12-Jan-2018";
		String dateArray[]=data.split("-");
		
		String date=dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		Select select = new Select(driver.findElement(By.xpath("//a[contains(text(),'Jan')]")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.xpath("//a[contains(text(),'2018')]")));
		select1.selectByVisibleText(year);
		
		//*[@id="ext-gen43"]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/a
		//*[@id="ext-gen43"]/tbody/tr[2]/td/table/tbody/tr[5]/td[3]/a
		
		
		String beforexpath = "//*[@id=\"ext-gen43\"]/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath="]/td[";
		
		final int totalweek=7;
		
		for(int rowNum=2; rowNum<=7; rowNum++) {
			for(int colNum=1; colNum<=7; colNum++) {
				
				String day1 = driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
				
			}
			
		}
		
		
		
		
	}
	

}
