package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import geniricsUtility.FileUtility;
import pomClasses.LoginPage;
import pomClasses.RegisterPage;

public class RegLoginUsingHardCodedValue {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		driver.manage().window().maximize();

		RegisterPage r = new RegisterPage(driver);

//		r.getUsername().sendKeys("anjana");
//		r.getUsername().sendKeys("Anjana");
//		r.getUserPassword().sendKeys("anjana@123");
//		WebElement email = r.getEmailid();
//		email.sendKeys("anjana@gmail.com");
//		WebElement register = r.getRegisterButton();
//		register.click();

		r.SetValueForRegisterUser("Anjana", "anjana@gmail.com", "anjana@123");
		if (driver.getPageSource().contains("Login")) {
			System.out.println("pass:user is navigating to login page");
		}

		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.setvalueForLogIn("anjana@gmail.com", "anjana@123");

	}

}
