package SeleniumWebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		WebElement date = driver.findElement(By.name("ctl00$mainContent$view_date1"));
		String dateval = "25-12-2020";
		
		selectdatebyJS(driver,date,dateval);
	}
	
	public static void selectdatebyJS(WebDriver driver,WebElement element,String dateval) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
	}

}
