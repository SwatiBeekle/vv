package SeleniumWebDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		driver.get("http://localhost:8080/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//driver.findElement(By.id("loginButton")).click();
		
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		flash(loginbtn,driver);
		drawborder(loginbtn,driver);
	
	}
	public static void  flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgc = element.getCssValue("backgroundColour");
		for(int i = 0; i < 50; i++) {
			colorchange("rgb(0,200,0)",element,driver);
			colorchange(bgc,element,driver);
		}
	}
	
	public static void colorchange(String colour,WebElement element,WebDriver driver)  {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("arguments[0].style.backgroundColour = '"+colour+"'" ,element);
	
	     }

	public static void drawborder(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].stle.border ='3px solid red'", element);
		
	}
	

}












