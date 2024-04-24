package P03_Screens;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;


public class LoginScreen extends Base	{
	
	// LOGIN VARIABLES
	String BUTTON_GetStarted = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button";
	String INPUT_Number = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText";
	String INPUT_Iqama = "com.emcrey.riyadbank.cert:id/editText_national_id";
	String BUTTON_Nafath = "com.emcrey.riyadbank.cert:id/button_action_nafath";
	String BUTTON_Lang = "com.emcrey.riyadbank.cert:id/button_language";
	String ALERT_ErrorMessage = "com.emcrey.riyadbank.cert:id/tvText"; 
	String BUTTON_ForgotPassCode = "//android.widget.TextView[@text=\"I forgot my passcode\"]";
	String Mehtod_Name = "LOGIN";	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods(); 
	Base Base = new Base();	
	Data Data = new Data();
	/* 
	 user : 544585457 		password : 987111
 	 user : 545980075 		password : 142536
	*/
	
	
	// LOGIN TO BOUKI AND DEAL WITH OTP AND PASSWORD AND ANY OTHER POP-UPS 
	public void Login() throws IOException, InterruptedException  {
		Thread.sleep(1000);
		Base.Take_SscreenShot(Mehtod_Name , "LOGIN TEST START");

		// SOMTIMES IT APEARS AND IF THEY DONT ITS OKEY FOR THE CODE TO CONTINUE 
	    // ====================================================================
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_GetStarted)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_Number)).sendKeys("544585459");
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_GetStarted)).click();
		}	catch (Exception e) {
			// DON NOTHING 
		}
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Methods.Devic_PopUps();
			Base.Take_SscreenShot(Mehtod_Name , "");
		}	catch (Exception e) {
			// DON NOTHING 
		}
	
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Methods.OTP();
			Base.Take_SscreenShot(Mehtod_Name , "");

		} 	catch (Exception e) {
			// DON NOTHING 
		}		
	    // ====================================================================

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Methods.Passowrd();
		Base.Take_SscreenShot(Mehtod_Name , "LOGIN TEST IS PASSED");
		Data.Set_Methode_Status( 3 , Mehtod_Name , "PASS" );
	}
	
	
	// NOT UPDATED YET
	public void ForgetPassCode () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_ForgotPassCode)).click();
		
		Methods.OTP();
		
		Methods.CardPin();
		
		if (driver.findElement(By.id(ALERT_ErrorMessage)).isDisplayed()  
			&& driver.findElement(By.id(ALERT_ErrorMessage)).getText().equals("System error, please try again later") ) {
			assertTrue(false);
		}
	}
			
			
	// NOT UPDATED YET
	public void InputNumber () throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(INPUT_Number)).sendKeys("562253300");
		Base.Take_SscreenShot(Mehtod_Name , "INPUT OLD NUMBER");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_GetStarted)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");
	}
	
	
	// NOT UPDATED YET
	public void Input_New_Number () throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(INPUT_Number)).sendKeys("544585457");
		Base.Take_SscreenShot(Mehtod_Name , "INPUT NEW NUMBER");

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_GetStarted)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		
		
	}
	
	
}
