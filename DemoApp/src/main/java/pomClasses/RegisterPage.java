package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver)
 	{
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id="name")
	  private WebElement username;
	@FindBy(id="email")
	private WebElement emailid ;
	
	@FindBy(id="password")
	private WebElement userPassword;
	
	@FindBy(tagName="button")
	private WebElement registerButton;
	
 
//	@FindBy(xpath="//div[text()='RegisteredSuccessfully']")
//	    private WebElement  registerSuccessfulmsg;
//	
	
	
	public WebElement getUsername() {
		return username;
		
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getUserPassword() {
		return userPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
//	public WebElement getRegisterSuccessfulmsg() {
//		return registerSuccessfulmsg;
//	}
	
	public void SetValueForRegisterUser(String name,String email,String password )
	{
		username.sendKeys( name);
		emailid.sendKeys(email);
		userPassword.sendKeys( password);
		registerButton.click();
	}
	
//	public boolean verifyResisterSuccessfulmsg()
//	{
//	    return  registerSuccessfulmsg.isDisplayed();
//	}
//	



	

}
