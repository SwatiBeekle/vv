package SeleniumWebDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class LocatorEx {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://signup.ebay.com/pa/crte");
	
	//1.xpath---2
	//absolute xpath should not be used
	//relative xpath is used
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("xyz");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("email.com");
	
//	//2.id---1
//	driver.findElement(By.id("firstname")).sendKeys("abc");
//	
//	//3.name---3
//	driver.findElement(By.name("firstname")).sendKeys("abc");
//	
	//4.Linktext---4
	driver.findElement(By.linkText("Create a business account")).click();
	
	//5.partial linktext:not recomended to use
	driver.findElement(By.partialLinkText("Create")).click();
	
	//6.css selector
	driver.findElement(By.cssSelector("#firstname")).sendKeys("abc");
	
	//7.class name:not recomended to use
	driver.findElement(By.className("textbox__control textbox__control--underline")).sendKeys("abc");
	
	
	
	
}
}
