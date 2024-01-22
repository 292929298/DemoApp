 package drivers;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.LoginPage;
import pomClasses.RegisterPage;
import webelement.textBox.BaseClass;
 
 

public class ToRegisterUserAndLoginWthTestNG extends BaseClass{
	
	@Test(priority=1)
	public void toRegisterUser() throws Exception {
		
		String name = file.fetchStringDataFromExcelSheet("register", 1, 0);
		String email1 = file.fetchStringDataFromExcelSheet("register", 1, 1);
		String password = file.fetchStringDataFromExcelSheet("register", 1, 2);
       
		RegisterPage r = new RegisterPage(driver);
		LoginPage lg = new LoginPage(driver);
		r.SetValueForRegisterUser(name, email1, password);
		
//		if (r.verifyResisterSuccessfulmsg())
//		{
//			System.out.println("pass: the User has logged in");
//		}
//		else
//		{
//			System.out.println("Fail: the User has not logged in");
//		}
		
		Assert.assertTrue(lg.verifyResisterSuccessfulmsg());
		System.out.println("pass: =============");
	Thread.sleep(2000);	
	}
	@Test(priority =2)
	public void loginUser() throws Exception
	{
		String email1 = file.fetchStringDataFromExcelSheet("register", 1, 1);
		String password = file.fetchStringDataFromExcelSheet("register", 1, 2);
	   LoginPage lg = new LoginPage(driver);
		lg.setvalueForLogIn(email1, password);
		System.out.println("pass");
		if(lg.verifySignInSuccesFullMsg())
		{
			System.out.println("pass : The user has logged in");
		}
		else
		{
			System.out.println("Fail : The user has not logged in");
		}
		
	}

}
