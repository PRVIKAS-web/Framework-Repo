package DWS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_RegisterPage 
{
  public DWS_RegisterPage(WebDriver driver)
  {
	 PageFactory.initElements(driver,this);
  }
 
    @FindBy(id="gender-male")
	private WebElement gender;
    
    @FindBy(id="FirstName")
   	private WebElement firstname;
    
    @FindBy(id="LastName")
   	private WebElement lastname;
    
    @FindBy(id="Email")
   	private WebElement email;
    
    @FindBy(id="Password")
   	private WebElement password;
    
    @FindBy(id="ConfirmPassword")
   	private WebElement confirmpassword;
    
    @FindBy(id="register-button")
   	private WebElement registerbutton;
    
    public void clickGender()
    {
    	gender.click();
    }
    public void enterFirstName(String firstnameval)
    {
    	firstname.sendKeys(firstnameval);
    }
    
    public void enterLastName(String lastnameval)
    {
    	lastname.sendKeys(lastnameval);
    }
    
    public void enterEmail(String emailval)
    {
    	email.sendKeys(emailval);
    }
    public void enterPassword(String passwordval)
    {
    	password.sendKeys(passwordval);
    }
    
    public void enterConfirmPassword(String confirmpasswordval)
    {
    	confirmpassword.sendKeys(confirmpasswordval);
    }
    
    public void clickRegisterButton()
    {
    	registerbutton.click();
    }
    
    
    
    
    
    
}
