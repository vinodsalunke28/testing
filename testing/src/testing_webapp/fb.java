package testing_webapp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {
	
	public static void main(String args[]) throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Panya\\Desktop\\java\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.findElement(By.id("")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("month"));
		Select mon=new Select(ele);
		List<WebElement>li=mon.getOptions();
		int i=li.size();
		
		for(WebElement lis:li)
		{
			String data=lis.getText();
			System.out.println("month list  "+data);
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
