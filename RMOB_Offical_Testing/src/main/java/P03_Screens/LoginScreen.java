package P03_Screens;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;

public class LoginScreen extends Base {

	// LOGIN VARIABLES
	String INPUT_PasswordConf = "(//android.widget.EditText) [2]";
	String INPUT_PasswordE = "(//android.widget.EditText) [1]";
	String INPUT_EmailConf = "(//android.widget.EditText) [3]";
	String INPUT_Email = "(//android.widget.EditText) [2]";
	String INPUT_UsernameE = "(//android.widget.EditText) [1]";
	String INPUT_CardPin = "//android.widget.EditText[@text='Card PIN']";
	String BUTTON_Continue = "//android.widget.Button[@text[contains(.,'Continue')]]";
	String INPUT_IDNumber = "//android.widget.EditText";
	String BUTTON_Register = "//android.widget.Button[@text= 'New user? register now']";
	String INPUT_Password = "(//android.widget.EditText)[2]";
	String BUTTON_MaybeLater = "//android.widget.Button[@text = \"Maybe later\"]";
	String INPUT_Username = "(//android.widget.EditText)[1]";
	String BUTTON_Login = "//android.widget.Button[@text='Login']";
	String BUTTON_Later = "//android.widget.Button[@text[contains(.,'Maybe')]]";

	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods(); 
	Base Base = new Base();	
	Data Data = new Data();
	String[] options = {
		"77830909",
		"50131511", 
		"88180432",
		"67005851",
		"99333996" 
	} ;


	public void Login(String RportName , int RowNumeber) throws IOException, InterruptedException  {
		
		try { 
			
			String User = Methods.Choose_List( options ,"Login account" , "Please choose an account to login with" );
						
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Username)).sendKeys(User);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Password)).sendKeys("uat123@123");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Login)).click();
			
			Thread.sleep(15000);
			
			Methods.Check_Alerts();
	
		try {
			Methods.Get_OTP();
		} catch (Exception e) {
			// DO NOTHING 
		}
		
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Later)).click();
			} catch (Exception e) {
				// DO NOTHING
			}

			Thread.sleep(30000);
			Base.Take_SscreenShot(RportName , "");
						
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );		
			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName , " ERROR IN LOGIN TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );		
			}

	}

	public void Register(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Register)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_IDNumber)).sendKeys("1000000005");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Continue)).click();
		Base.Take_SscreenShot(RportName , "");
		
		Methods.Get_OTP();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_CardPin)).sendKeys("2525");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_UsernameE)).sendKeys("Shh99hhaduat");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_Email)).sendKeys("Shh99hhaduat@gmail.com");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_EmailConf)).sendKeys("Shh99hhaduat@gmail.com");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Continue)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_PasswordE)).sendKeys("Uat123@123");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_PasswordConf)).sendKeys("Uat123@123");
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Continue)).click();
		Base.Take_SscreenShot(RportName , "");
		
	}











}
