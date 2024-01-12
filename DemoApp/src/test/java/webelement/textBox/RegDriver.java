package webelement.textBox;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import geniricsUtility.FileUtility;
import pomClasses.RegisterPage;

public class RegDriver {
	public static void main(String[] args) throws Exception {
		 WebDriver driver=null;
			FileUtility f = new FileUtility();		           
			String  browser= f.fetchDataFromPropertyFile("browser");
			            String url=f.fetchDataFromPropertyFile("url");
			            
			       String name =f.fetchStringDataFromExcelSheet("register", 1, 0) ;
			       String emailid=f.fetchStringDataFromExcelSheet("register", 1, 1);
			       String password=f.fetchStringDataFromExcelSheet("register", 1, 2);
	           if(browser.equals("chrome"))
	           {
	        	   driver =new ChromeDriver();
	           }
	           if(browser.equals("edge"))
	           {
	        	    driver =new EdgeDriver();
	           }
	           if(browser.equals("firefox"))
	           {
	        	    driver =new FirefoxDriver();
	           }
	           driver.get(url);
	       //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	           driver.manage().window().maximize();
	           RegisterPage r = new RegisterPage(driver);
	                     r.SetValueForRegisterUser(name, emailid, password);
	}

}
