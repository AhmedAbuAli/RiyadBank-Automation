package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BillsGovermentPaymentScreen extends Base  {
	
	// Bills & Government Payment SCREEN VARIABLES
	String BUTTON_Pay = "//android.widget.Button[@text[contains(.,'Pay')]]";
	String INPUT_BillAmount = "(//android.widget.EditText)[1]";
	String CHECKBOX_Bill = "(//android.widget.TextView) [9]";
	String BUTTON_AllBills = "//android.widget.Button[@text = 'All']";
	String BUTTON_HomePage = "//android.widget.Button[@text ='Go to Homepage']";
	String BUTTON_RegisterAndSaveBill = "//android.widget.Button[@text = 'Register & Save Bill arrow round-forward']";
	String BUTTON_Continue2 = "//android.widget.Button[@text = 'Continue arrow round-forward']";
	String INPUT_PrefrredName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText";
	String BUTTON_SaveBill = "//android.widget.Button[@text= 'Register & Save Bill']";
	String INPUT_AccountNumber = "//android.widget.EditText[@text= 'Account Number']";
	String BUTTON_OptionBiller = "//android.widget.TextView[@text= '001 - STC']";
	String VIEW_SelectBiller = "//android.widget.TextView[@text= 'Select company from the list']";
	String BUTTON_OptionCategory = "//android.widget.TextView[@text= 'Communication']";
	String VIEW_SelectCategory = "//android.widget.TextView[@text= 'Select category']";
	String BUTTON_BillsGovPay = "//android.widget.Button[@text = ' Bills & Government Payment']";
	String BUTTON_MyBills = "//android.widget.Button[@index= '1']";
	String BUTTON_NewBill = "//android.widget.Button[@index= '3']";
	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	
	public void All_Bills_Goverment_Payment(int RowNumeber) throws IOException, InterruptedException {
		
		String Cat = "BILLS & GOVERMENT PAYMENT - ";
		Add_New_Bill(Cat+"ADD A NEW BILL", RowNumeber);
		Pay_Bill	(Cat+"PAY A BILL", RowNumeber+1);

	}
	// ============================================================================
	
		
	public void Open_Bills_Goverment_Payment() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		Methods.Open_Side_Bar();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_BillsGovPay)).click();
			
	}
	// ============================================================================

	
	// NEW BILL =================================================================== 
	public void Add_New_Bill(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_Bills_Goverment_Payment();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_NewBill)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(VIEW_SelectCategory)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_OptionCategory)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(VIEW_SelectBiller)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_OptionBiller)).click();
			
	        // Press the key '8' eight times
	        for (int i = 0; i < 8; i++) {

				KeyEvent keyEvent = new KeyEvent(AndroidKey.DIGIT_8);

				Thread.sleep(1000);

				driver.pressKey(keyEvent);

			}
 
	        // Press the key '0'
	        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
	        driver.pressKey(keyEvent0);

	        // Press the key '9'
	        KeyEvent keyEvent9 = new KeyEvent(AndroidKey.DIGIT_9);
	        driver.pressKey(keyEvent9);

	        // Press the key '7'
	        KeyEvent keyEvent7 = new KeyEvent(AndroidKey.DIGIT_7);
	        driver.pressKey(keyEvent7);
			
			Methods.action_clickOnPosition(950, 2260);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_SaveBill)).click();
			
			driver.navigate().back();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_PrefrredName)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_PrefrredName)).sendKeys("TEST"+Integer.toString(Methods.Generate_Random_App_Passcode()));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_RegisterAndSaveBill)).click();
			
			Methods.Get_OTP();
			
			try {

				Methods.MW_PopUps();
				
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();

			} catch (Exception e) {

				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();

			}	

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}

	}
	// ============================================================================

	
	// MY BILL =================================================================== 
	public void Pay_Bill(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Bills_Goverment_Payment();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_MyBills)).click();
			
			Thread.sleep(10000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AllBills)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX_Bill)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_BillAmount)).click();
			
	        // Press the key '1'
	        KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
	        driver.pressKey(keyEvent1);
			
	        // Press the key '0'
	        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
	        driver.pressKey(keyEvent0);
	        
			Methods.action_clickOnPosition(950, 2260);

	        
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Pay)).click();
			
			Thread.sleep(30000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Pay)).click();

			Thread.sleep(30000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Pay)).click();
			
			Methods.Get_OTP();
			
			try {

				Methods.MW_PopUps();

				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

				Methods.Back_To_Home_Screen();

			} catch (Exception e) {

				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();

			}	

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

			Methods.Back_To_Home_Screen();

		}
		
	}
	// ============================================================================

	
}
