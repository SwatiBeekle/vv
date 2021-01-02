package SeleniumWebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class WithoutOpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://localhost:8080/login.do");

		System.out.println("before login title "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("after login title "+driver.getTitle());
	
	}		
		
		
			
		}

	

