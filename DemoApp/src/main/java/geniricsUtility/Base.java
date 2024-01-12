package geniricsUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	static {

		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/resources/envir.properties");
			prop = new Properties();
			prop.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setup() {
		String browsername = prop.getProperty("browser"); // switch case break
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("ff")) {

			driver = new FirefoxDriver();
		} else if (browsername.equals("edge")) {

			driver = new EdgeDriver();
		}
		//driver.get(prop.getProperty("url"));
		driver.get("url");
		driver.manage().window().maximize();
 	}
}
