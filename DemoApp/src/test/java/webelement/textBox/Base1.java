package webelement.textBox;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class Base1 {
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Data Base Connection is achieved");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("|| ececution");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Launch and navigate to the Url");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Login only");
	}
	 
	@Test
	public void test1()
	{
		System.out.println("This is Test");
	}
	
	@AfterMethod
	public void test2()
	{
		System.out.println("Logout to the application");
	}
	 
	 
}
