package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;
import DWS_Pages.DWS_RegisterPage;

public class DWS_RegisterTest 
{
	@Test
	public void TC2()
	{
		  WebDriver driver=new ChromeDriver();
		 
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  DWS_HomePage homepage=new DWS_HomePage(driver);
		  
		  homepage.clickregisterLink();
		  
		  DWS_RegisterPage registerpage=new DWS_RegisterPage(driver);
		  
		  registerpage.clickGender();
		  
		  registerpage.enterFirstName("vicky");
		  
		  registerpage.enterFirstName("PR");
		  
		  registerpage.enterEmail("lucky9012@gmail.com");
		  
		  registerpage.enterPassword("lucky@12");
		  
		  registerpage.enterConfirmPassword("lucky@12");
		  
		  registerpage.clickRegisterButton();
		  
		  driver.close();
		  
		  
	}

}
