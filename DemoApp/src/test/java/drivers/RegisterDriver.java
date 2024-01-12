package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import geniricsUtility.FileUtility;
import pomClasses.LoginPage;
import pomClasses.RegisterPage;

public class RegisterDriver {
	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		FileUtility f = new FileUtility();
		String browser = f.fetchDataFromPropertyFile("browser");
		String url = f.fetchDataFromPropertyFile("url");

		String name = f.fetchStringDataFromExcelSheet("register", 1, 0);
		String email1 = f.fetchStringDataFromExcelSheet("register", 1, 1);
		String password = f.fetchStringDataFromExcelSheet("register", 1, 2);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Thread.sleep(2000);
		RegisterPage r = new RegisterPage(driver);
		r.SetValueForRegisterUser(name, email1, password);
		
		Thread.sleep(2000);
		LoginPage log = new LoginPage (driver);
		 log.setvalueForLogIn(email1, password);
		 
	}
 
}
