package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MoneyTransferScreen extends Base {
	
	// MONEY TRANSFER SCREEN VARIABLES
	String BUTTON_Confirm2 = "//android.widget.Button[@text = 'Confirm arrow round-forward']";
	String BUTTON_NewRequest  = "//android.widget.Button[@index= '1']";
	String BUTTON_RequestToPay = "//android.widget.Button[@index= '21']";
	String BUTTON_AddNewBenf = "//android.widget.Button[@text= 'Add New Beneficiary']";
	String BUTTON_BenficiaryManagement = "//android.widget.Button[@index= '19']";
	String BUTTON_Zakaty = "//android.widget.Button[@index= '17']";
	String BUTTON_CharityDonation = "(//android.widget.Button[@index= '15']) [1]";
	String CHECKBOX = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.TextView";
	String BUTTON_MoneyExpress = "//android.widget.Button[@index= '11']";
	String INPUT_Ammount3 = "(//android.widget.EditText) [2]";
	String INPUT_Ammount2 = "(//android.widget.EditText) [1]";
	String BUTTON_Continue = "//android.widget.Button[@text='Continue']";
	String BUTTON_WUTransfer = "//android.widget.Button[@index= '9']";
	String BITTON_InternationalTransfer = "//android.widget.Button[@index= '7']";
	String BUTTON_Now = "//android.widget.TextView[@text = 'Now']";
	String BUTTON_LocalTransfer = "//android.widget.Button[@index= '5']";
	String BUTTON_PurposeOption = "//android.widget.TextView[@text = 'Personal expenses']";
	String BUTTON_PurposeList = "//android.widget.TextView[@text = 'Select main purpose']";
	String BUTTON_BenfOption = "(//android.widget.TextView[@text[contains(.,'Riyad Bank ')]]) [1]";
	String BUTTON_Beneficiary = "//android.widget.TextView[@text = 'Beneficiary']";
	String BUTTON_WithinRiyadBank = "//android.widget.Button[@index= '3']";
	String BUTTON_HomePage = "//android.widget.Button[@text ='Go to Homepage']";
	String BUTTON_Transfer2 = "//android.widget.Button[@text = 'Transfer arrow round-forward']";
	String BUTTON_Continue2 = "//android.widget.Button[@text = 'Continue arrow round-forward']";
	String INPUT_Ammount = "//android.widget.EditText";
	String BUTTON_ToAccount = "(//android.widget.TextView[@text = 'SAR']) [1]";
	String BUTTON_FromAccount = "(//android.widget.TextView[@text = 'SAR']) [1]";
	String BUTTON_FromList = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.Button";
	String BUTTON_BtweenMyAccounts = "//android.widget.Button[@index= '1']";
	String BUTTON_MoneyTransfer  = "//android.widget.Button[@text =' Money Transfers']";
	String BUTTON_BenfOption2 = "lbl-30";
	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	public void All_Money_Transfer(int RowNumeber) throws IOException, InterruptedException {
		
		String Cat = "MONEY TRANSFER - ";
		Between_My_Accounts    (Cat+"BETWEEN MY ACCOUNTS TRANSFER", RowNumeber);
		Within_Riyad_Bank      (Cat+"WITHIN RIYAD BANK TRANSFER", RowNumeber);
		Local_Transfer	   	   (Cat+"LOCAL TRANSFER", RowNumeber);
		International_Transfer (Cat+"INTERNATIONAL TRANSFER", RowNumeber);
		WU_Transfer			   (Cat+"WESTREN UNION TRANSFER", RowNumeber);
		Charity_Donation	   (Cat+"CHARITY DONTATION", RowNumeber);
		Zakaty				   (Cat+"ZAKATY", RowNumeber);
		Request_To_Pay		   (Cat+"REQUEST TO PAY", RowNumeber);
	}
	// ============================================================================
	
	
	private void Confirm_Transfer(String RportName) throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_PurposeList)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_PurposeOption)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_Continue2)).click();
		Base.Take_SscreenShot(RportName , "");
		
		try {
			Methods.MW_PopUps() ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
		} catch (Exception e) {
			// DO NOTHING
		}
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");
		} catch (Exception e) {
			// DO NOTHING
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_Transfer2)).click();
		Base.Take_SscreenShot(RportName , "");
		
		Methods.Get_OTP();
	}
	// ============================================================================

	
	public void Open_Money_Transfer() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot("MONEY TRANSFER", "OPEN MONEY TRANSFER");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_MoneyTransfer)).click();
		Base.Take_SscreenShot("MONEY TRANSFER" , "");
			
	}
	// ============================================================================

	
	public void Between_My_Accounts(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_BtweenMyAccounts)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_FromList)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_FromAccount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(2000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ToAccount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(2000);
			
			Methods.action_clickOnPosition(950, 2260);

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Transfer2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Methods.Get_OTP();
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}		
	}
	// ============================================================================

	
	public void Within_Riyad_Bank(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_Money_Transfer();

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_WithinRiyadBank)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			Methods.action_clickOnPosition(500, 300);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Beneficiary)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_BenfOption)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(2000);
			
			Methods.action_clickOnPosition(950, 2260);
			
			Confirm_Transfer(RportName);
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void Local_Transfer(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_LocalTransfer)).click();
			Base.Take_SscreenShot(RportName , "");	
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 300);
			Methods.action_clickOnPosition(500, 300);

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(2000);
			
			Methods.action_clickOnPosition(950, 2260);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Beneficiary)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 1550);
			
			Confirm_Transfer(RportName);

			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void International_Transfer(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BITTON_InternationalTransfer)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 300);
			Methods.action_clickOnPosition(500, 300);

			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 1850);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Ammount)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(2000);
			
			Methods.action_clickOnPosition(950, 2260);
			
			
			Confirm_Transfer(RportName);

			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void WU_Transfer(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_WUTransfer)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			Methods.action_clickOnPosition(500, 1850);
			Methods.action_clickOnPosition(500, 1850);

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
	        // Press the key '1'
	        KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
	        driver.pressKey(keyEvent1);

	        // Press the key '7'
	        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
	        driver.pressKey(keyEvent0);
			
			driver.navigate().back();
			
			Confirm_Transfer(RportName);
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void Money_Express(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_MoneyExpress)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 300);
			Methods.action_clickOnPosition(500, 300);

			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 2100);
			Methods.action_clickOnPosition(500, 2100);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount2)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			driver.navigate().back();
			
			Confirm_Transfer(RportName);
					
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void Charity_Donation(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CharityDonation)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 300);
			Methods.action_clickOnPosition(500, 300);
			
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 1700);
			Methods.action_clickOnPosition(500, 1700);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Transfer2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Methods.Get_OTP();
			
					
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void Zakaty(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Zakaty)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 300);
			Methods.action_clickOnPosition(500, 300);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount3)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount3)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(500, 2300);
			Methods.action_clickOnPosition(500, 2300);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Transfer2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Methods.Get_OTP();
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	
	public void Request_To_Pay(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Money_Transfer();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_RequestToPay)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_NewRequest)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(10000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_FromAccount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			try {
				Thread.sleep(5000);
				
				Methods.action_clickOnPosition(500, 2300);
				Methods.action_clickOnPosition(500, 2300);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_FromAccount)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				// TODO: handle exception
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Ammount)).click();
			Base.Take_SscreenShot(RportName , "");
			
	        // Press the key '1'
	        KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
	        driver.pressKey(keyEvent1);

	        // Press the key '7'
	        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
	        driver.pressKey(keyEvent0);
						
			driver.navigate().back();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Beneficiary)).click(); 	
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id(BUTTON_BenfOption2)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				Methods.action_clickOnPosition(500, 1950);
				Methods.action_clickOnPosition(500, 1950);
			}
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST ");
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
				Methods.Back_To_Home_Screen();
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_HomePage)).click();
				Base.Take_SscreenShot(RportName , "");	
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

}
