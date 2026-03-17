package maven_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWS_SubscribeTest 
{
	@Test
	public void subscribeTest()
	{
		
		 WebDriver driver=new ChromeDriver();
		 
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
          driver.findElement(By.id("newsletter-email")).sendKeys("vickypr1998@gmail.com");
	      
	      driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

}
