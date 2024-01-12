package webelement.textBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import geniricsUtility.FileUtility;

public class BaseClass {
	public static WebDriver driver;
	public static  FileUtility file = new FileUtility();

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Data Base Connection is achieved");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("|| ececution");
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		String browser = file.fetchDataFromPropertyFile("browser");
		String url = file.fetchDataFromPropertyFile("url");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("launch the browser and url");

	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		String email=file.fetchStringDataFromExcelSheet("register", 1, 0);
		String password=file.fetchStringDataFromExcelSheet("register", 1, 1 );
		
		System.out.println("Login only");
	}

	@Test
	public void test1() {
		System.out.println("This is Test");
	}

}
