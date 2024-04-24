package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HassadProgramScreen extends Base {
	
	// HASSAD PROGRAM SCREEN VARIABLES
    KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
    KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
	String BUTTON_Hassad = "//android.widget.Button[@text = ' Hassad Program']" ;
	String BUTTON_Transfer = "//android.widget.Button[@text = ' Transfer']" ; 
	String OPTION_Benf = "(//android.view.View[@resource-id[contains(.,'lbl')]]) [1]";
	String INPUT_Amount = "(//android.widget.EditText) [2]";
	String ARROW_Message = "//android.widget.TextView[@text = '']";
	String OPTION_Messge = "//android.widget.TextView[@text = 'Congratulation on your wedding']";
	String BUTTON_Continue2 = "//android.widget.Button[@text = 'Continue arrow round-forward']";
	String BUTTON_Transfer2 = "//android.widget.Button[@text = 'Transfer arrow round-forward']";
	String CHECKBOX = "//android.widget.CheckBox";

	
	

	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	public void Open_Hassad() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		Methods.Open_Side_Bar();
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Hassad)).click();		
		Base.Take_SscreenShot("HASSAD PROGRAM", "OPEN HASSAD");
	}
	// ============================================================================
	
	public void Hassad_Transfer(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			Open_Hassad();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Transfer)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Benf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Amount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Amount)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
	        driver.pressKey(keyEvent1);
	        driver.pressKey(keyEvent0);

			driver.navigate().back();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(ARROW_Message)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Messge)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");		
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Transfer2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			/* 
			 * TO CONTINUE 
			 */
				
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
