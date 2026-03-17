package DWS_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWS_Pages.DWS_HomePage;
import DWS_Pages.DWS_LoginPage;

public class DWS_LoginTest 
{
	@Test
	public void TC3()
	{
		 WebDriver driver=new ChromeDriver();
		 
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
		  DWS_HomePage homepage=new DWS_HomePage(driver);
		  
		  homepage.clickloginLink();
		  
		  DWS_LoginPage  loginpage=new DWS_LoginPage(driver);
		  
		  loginpage.enterUsername("lucky9012@gmail.com");
		  
		  loginpage.enterPassword("lucky@12");
		  
		  loginpage.clickLoginButton();
		  
		  driver.close();
		  
	}

}
