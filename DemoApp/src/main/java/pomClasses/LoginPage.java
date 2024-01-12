package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver=driver;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getUserPassword() {
		return userPassword;
	}

	@FindBy(id = "email")
	private WebElement emailid;

	@FindBy(id = "password")
	private WebElement userPassword;

	@FindBy(tagName = "button")
	private WebElement loginButton;

	@FindBy(xpath = "//div[text()='Signin successful']")
	private WebElement signinSuccessfulmsg;

	public WebElement getSigninSuccessfulmsg() {
		return signinSuccessfulmsg;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setvalueForLogIn(String email, String password) {
		emailid.sendKeys(email);
		userPassword.sendKeys(password);
		loginButton.click();
	}

	public boolean verifySignInSuccesFullMsg() {
		return signinSuccessfulmsg.isDisplayed();
	}
}
