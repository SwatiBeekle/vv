package SeleniumWebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//movetoElement method in Actions class
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Priority Check-in")).click();

	}

}
