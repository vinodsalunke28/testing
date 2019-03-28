package testing_webapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Panya\\Desktop\\java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
