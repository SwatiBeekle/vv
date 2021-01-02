package SeleniumWebDriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        
   
     List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
     System.out.println("total value in listbox"+alloptions.size());
     for(int i=0;i<alloptions.size();i++) {
			System.out.println(alloptions.get(i).getText());
			if(alloptions.get(i).getText().contains("selenium download")) {
				alloptions.get(i).click();
				break;

	}

}
}
}