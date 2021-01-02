package SeleniumWebDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserLaunch {
	public static void main(String[] args) {
		//safaridriver is class
		//1.download safari extension for selenium
		//2.enable allow remote automation insafari
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
