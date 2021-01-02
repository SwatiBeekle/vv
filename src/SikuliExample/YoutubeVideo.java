package SikuliExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeVideo {

	public static void main(String[] args) throws FindFailed {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://www.youtube.com/watch?v=1-9573qxk5g");

			
			Screen sc = new Screen();
			
			Pattern p = new Pattern("‪C:\\Users\\ADMIN\\Pictures\\YT_Setting.png.PNG");
			
			sc.wait(p, 2000);
			
			sc.click(p);
			
			
			
			
			
			

	}

}
