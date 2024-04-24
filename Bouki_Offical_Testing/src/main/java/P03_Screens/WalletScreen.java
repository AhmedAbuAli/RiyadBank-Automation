package P03_Screens;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;

public class WalletScreen extends Base{
	
	// REQUEST CARD VARIABLES
	String BUTTON_RequestCard = "//android.widget.TextView[ @text = \"Request physical card\"]";
	String BUTTON_Deliver = "//android.widget.TextView[ @text = \"Deliver to your door\"]";
	String BUTTON_Confirm = "//android.widget.Button[ @text = \"Confirm\"]";
	String BUTTON_Done = "//android.widget.Button[ @text = \"Done\"]";
	String BUTTON_OrderCard = "//android.widget.Button[ @text = \"Order Card\"]";
	// WALLET DETAILS VARIABLES
	String BUTTON_WalletDetails = "//android.widget.TextView[@text = \"Wallet Details\"]";
	String BUTTON_CopyWalletAccount = "com.emcrey.riyadbank.cert:id/ivCopyWalletAccount";
	String ALERT_CopyWalletAccount = "com.emcrey.riyadbank.cert:id/tvText";
	// CARD DETAILS VARIABLES
	String BUTTON_CardDetails = "//android.widget.TextView[@text=\"Card Details\"]";
	String BUTTON_Address = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView";
	String BUTTON_ShowDetails = "com.emcrey.riyadbank.cert:id/textView_show_card_details";
	String BUTTON_CopyCardNumber = "com.emcrey.riyadbank.cert:id/imageView_copy_card_number";
	String ALERT_CopyCardNumber = "com.emcrey.riyadbank.cert:id/tvText";
	// TRANSACTIONS VARIALBES
	String BUTTON_Transactions = "//android.widget.TextView[@text = \"Transactions\"]";
	String BUTTON_LockECommerce = "com.emcrey.riyadbank.cert:id/switch_lock_ecommerce";
	String BUTTON_LockContactless = "com.emcrey.riyadbank.cert:id/switch_lock_contactless";
	// SETTINGS VARIABLES
	String BUTTON_Settings  = "//android.widget.TextView[@text =\"Settings\"]";
	String BUTTON_ChangeCardPin = "com.emcrey.riyadbank.cert:id/imageView_change_card_pin";
	String ALERT_CardPinChange = "com.emcrey.riyadbank.cert:id/tvText";
	String BUTTON_ShowCardPin = "com.emcrey.riyadbank.cert:id/imageView_show_card_pin";
	String BUTTON_ShowCardPin2 = "//android.widget.TextView[@text ='Show']";
	String POPUP_CardPin = "//android.widget.TextView[@text = \"Your card's PIN\"]";
	String uiSelector = "new UiSelector().textMatches(\"" +"Freeze Card"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String uiSelector2 = "new UiSelector().textMatches(\"" +"Next"+ "\")";
	String command2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector2 + ");";
	String BUTTON_DebitLimit = "com.emcrey.riyadbank.cert:id/imageView_debit_limit_pos";
	String INPUT_EnterAnotherAmount = "//android.widget.EditText[@text = \"Enter another amount\"]";
	// GENERAL VARIABLES
	String BUTTON_Next = "//android.widget.Button[@text = \"Next\"]"; 
	String BUTTON_Back = "com.emcrey.riyadbank.cert:id/imageView_back";
	String BUTTON_Wallet = "//android.widget.FrameLayout[@content-desc=\"Wallet\"]";
	String Mehtod_Name = "Wallet";	
	CommenMethods Methods = new CommenMethods() ; 
	Base Base = new Base();
	Data Data = new Data();
	
	public void Open_Card_Settings() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Settings)).click();
		Base.Take_SscreenShot(Mehtod_Name , "OPEN CARD SETTINGS");
	}

	public void Open_CardDetails() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_CardDetails)).click();
		Base.Take_SscreenShot(Mehtod_Name , "OPEN CARD DETAILS");

	}
	
	public void Open_Wallet () throws IOException, InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Wallet)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "OPEN WALLET SERVICES");

	}
		
	// NOT IN REGGRESSION
	/*
 	public void RequestPhysicalCard() throws InterruptedException, IOException {
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_RequestCard)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "REQUEST A PHYSICAL CARD TEST START");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Deliver)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Address)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Confirm)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_OrderCard)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		Methods.InternalOTP();
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Done)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "REQUEST A PHYSICAL CARD TEST IS PASSED");
		Methods.Back_To_Home_Screen();
		
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(Mehtod_Name , "ERROR IN WALLET REQUEST A PHYSICAL CARD");
			Methods.Back_To_Home_Screen();	
		}
	}
*/
	
	// NOT IN REGGRESSION ( NOT UPDATED YET )
	/*
	public void Transactions() throws InterruptedException {		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_Transactions)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_LockECommerce)).click();
		
		Thread.sleep(10000);

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_LockContactless)).click();
	}
	*/
		
	// NOT IN REGGRESSION ( NOT UPDATED YET )
	/*
	public void Change_Card_Pin() {
		// CHANGE CARD PIN 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_ChangeCardPin)).click();
		
		Methods.CardPin();
		
		Methods.CardPin();

		Methods.CardPin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (!(driver.findElement(By.id(ALERT_CardPinChange)).isDisplayed() &&
			driver.findElement(By.id(ALERT_CardPinChange)).getText().equals("Card pin changed successfully!"))) {
			assertTrue(false);
		}
	}
	*/

	public void Show_Wallet_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_Wallet();
			} catch (Exception e) {
				// DO NOTHING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_WalletDetails)).click();;
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(BUTTON_CopyWalletAccount)).click();;
			Base.Take_SscreenShot(Mehtod_Name , "");
																		
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();	
	}

	public void Show_Card_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
	try {

		try {
			Open_Wallet();

		} catch (Exception e) {
			// DO NOTHING
		}
		try {
			Open_CardDetails();

		} catch (Exception e) {
			// DO NOTHING
		}
		Base.Take_SscreenShot(RportName, RportName + "TEST START");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_ShowDetails)).click();
		Base.Take_SscreenShot(Mehtod_Name , "CARD DETAILS TEST START");

		Methods.Passowrd();
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_CopyCardNumber)).click();
																	
		Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
		Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		
	} catch (Exception e) {
		Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
		Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
	}
	Methods.Back_To_Home_Screen();
	
}
		
	public void Show_Card_Pin(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_Wallet();
			} catch (Exception e) {
				// DO NOTHING
			}
			try {
				Open_CardDetails();
			} catch (Exception e) {
				// DO NOTHING
			}
			try {
				Open_Card_Settings();

			} catch (Exception e) {
				// DO NOTHING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id(BUTTON_ShowCardPin)).click();
				Base.Take_SscreenShot(Mehtod_Name , "");
			} catch (Exception e) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_ShowCardPin2)).click();
				Base.Take_SscreenShot(Mehtod_Name , "");
			}

			Methods.Passowrd();
			Base.Take_SscreenShot(Mehtod_Name , "");
																		
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();	
	}
			
	public void Change_Debit_Limits_in_POS(String RportName , int RowNumeber) throws IOException, InterruptedException {
	
	try {
		try {
			Open_Wallet();
		} catch (Exception e) {
			// DO NOTHING
		}
		try {
			Open_CardDetails();
		} catch (Exception e) {
			// DO NOTHING
		}
		try {
			Open_Card_Settings();
		} catch (Exception e) {
			// DO NOTHING
		}

		Base.Take_SscreenShot(RportName, RportName + "TEST START");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_DebitLimit)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		driver.findElement(AppiumBy.androidUIAutomator(command2));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(INPUT_EnterAnotherAmount)).sendKeys("1500");
		Base.Take_SscreenShot(Mehtod_Name , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Next)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Confirm)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		Methods.InternalOTP();
		Base.Take_SscreenShot(Mehtod_Name , "");
																	
		Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
		Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		
	} catch (Exception e) {
		Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
		Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
	}
	Methods.Back_To_Home_Screen();	
	}
}
	









