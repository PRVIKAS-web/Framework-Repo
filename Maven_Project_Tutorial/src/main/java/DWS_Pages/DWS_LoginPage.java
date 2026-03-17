package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage 
{
	public DWS_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	private WebElement username;
	
	@FindBy(name="Password")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement loginbutton;
	
	public void enterUsername(String usernameval)
	{
		username.sendKeys(usernameval);
	}
	
	public void enterPassword(String passwordval)
	{
		password.sendKeys(passwordval);
	} 
	
	public void clickLoginButton()
	{
		loginbutton.click();
	} 
	
	
	
	

}
