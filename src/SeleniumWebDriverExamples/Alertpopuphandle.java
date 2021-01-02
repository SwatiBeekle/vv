package SeleniumWebDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//popup or javascript popup alert


public class Alertpopuphandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch browser
		
		//enetr url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
		//javascript popup handle
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		String actual="Please enter a valid user name";
		
		//validation
		if(text.equals(actual)) {
			System.out.println("alert message is correct");
			
		}else {
			System.out.println("alert message is not correct");
		}
		
		alert.accept();//click OK button
		//alert.dismiss();//click Cancel button
		
	driver.close();
	}

}
