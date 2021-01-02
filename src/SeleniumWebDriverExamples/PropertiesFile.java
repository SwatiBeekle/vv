package SeleniumWebDriverExamples;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile {
	
    static WebDriver  driver ;
	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumWebDriver\\src\\SeleniumWebDriverExamples\\config.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);

		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		
	      if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			 driver = new ChromeDriver();//launch browser
			}
	       else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();//launch browser
			}
		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		 driver = new ChromeDriver();//launch browser
	driver.get(url);
		
	
	}

}
