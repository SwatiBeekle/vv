package SeleniumWebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		
		//1.firefoxdriver launch
	 	//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		//	WebDriver driver = new FirefoxDriver();	
		
		
		//2.Chrome driver launch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		
		//checking the title Validation point
		if(title.equals("Google")) {
			System.out.println("expected title is matched");
			
		}else {
			System.out.println("title not matched expected is"+driver.getTitle());
		}
		
	//get the current url
		System.out.println(driver.getCurrentUrl());
		
		//pagesource
		//driver.getPageSource();
		
		//quit browser
		driver.quit();
	}

}
