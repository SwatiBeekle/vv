package SeleniumWebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityex {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
			driver.get("http://localhost:8080/login.do");
			
			//1.isDisplay -is applicable for all the element
			boolean display = driver.findElement(By.id("loginButton")).isDisplayed();
			System.out.println(display);

			//2.isEnable
			boolean b1= driver.findElement(By.id("loginButton")).isEnabled();
			System.out.println(b1);
			
			//3.iSelected
			boolean b2 = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
			System.out.println(b2);
			
			//de-select checkbox
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			boolean b3= driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
			System.out.println(b3);
			
			
			
			
			
			
	}

}
