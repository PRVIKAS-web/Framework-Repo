package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_HomePage
{
	public DWS_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="small-searchterms")
	private WebElement searchtext;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn;
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	
	
	public void enterSearchText(String value)
	{
		searchtext.sendKeys(value);
	}
	
	public void clicksearchButton()
	{
		submitbtn.click();
	}
	
	public void clickregisterLink()
	{
		registerLink.click();
	}
	
	public void clickloginLink()
	{
		loginLink.click();
	}
	
	
	

}
