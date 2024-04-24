package P03_Screens;
import java.io.IOException;
import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;

public class AccountCardsScreen extends Base {

	// ACCOUNT & CARDS SCREEN VARIABLES
	String BUTTON_Confirm2 = "//android.widget.Button[@text[contains(.,'Confirm')]]";
	String BUTTON_IssueDebitCard = "//android.widget.Button[@text[contains(.,'Issue')]]";
	String BUTTON_Dashbord = "//android.widget.Button[@text ='Go to Dashboard']";
	String BUTTON_Parial = "//android.widget.TextView[@text = 'Parial']";
	String BUTTON_WazinAccounts = "//android.widget.Button[@text = 'Wazin Accounts']";
	String BUTTON_BarChart = "//android.widget.Button[@text = 'Bar Chart']";
	String BUTTON_PieChart = "//android.widget.Button[@text = 'Pie Chart']";
	String BUTTON_NetWorthStatment = "//android.widget.Button[@text = 'Net worth Statement']";
	String BUTTON_LoadMoney = "//android.widget.Button[@text ='Load Money']";
	String BUTTON_Currency = "//android.widget.TextView[@text[contains(.,'BHD')]]";
	String BUTTON_MulticurrencyCard = "//android.widget.Button[@text = 'Multi Currency Card']"; 
	String BUTTON_Transfer = "//android.widget.Button[@text = 'Transfer arrow round-forward']";
	String BUTTON_Transfer2 = "//android.widget.Button[@text ='Transfer']";
	String VIEW_AmountFrame ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.view.View/android.view.View";
	String INPUT_Amount = "//android.widget.EditText";
	String BUTTON_StatmentAmount = "//android.widget.TextView[@text='Statement Amount']";
	String BUTTON_HomePage = "//android.widget.Button[@text ='Go to Homepage']";
	String BUTTON_Pay = "//android.widget.Button[@text ='Pay arrow round-forward']";
	String BUTTON_CreditCard = "//android.widget.Button[@text = 'Credit Cards']";
	String BUTTON_ShowPin = "//android.widget.Button[@text = '']";
	String BUTTON_Edit = "//android.widget.Button[@text ='Edit']";
	String BUTTON_PrimaryMobile = "//android.widget.Button[@text = \"Primary Mobile arrow round-forward\"]"; 
	String BUTTON_Activate = "//android.widget.Button[@text = 'Activate']";
	String BUTTON_Deactivate = "//android.widget.Button[@text = 'Deactivate']";
	String BUTTON_BankToDetails = "//android.widget.Button[@text = 'Back to Details']";
	String BUTTON_ChangeLimit = "//android.widget.Button[@text = 'Change Limit']";
	String BUTTON_Continue = "//android.widget.Button[@text='Continue']";
	String BUTTON_Continue2 = "//android.widget.Button[@text = 'Continue arrow round-forward']";
	String BUTTON_EditLimitAmmount = "//android.widget.TextView[@text='20,000']";
	String BUTTON_EditLimitAmmount2 = "//android.widget.TextView[@text='30,000']";

	String BUTTON_EditLimit = "//android.widget.Button[@text = 'Edit Limit']";
	String uiSelector = "new UiSelector().textMatches(\"" +"Total Unavailable Funds"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String uiSelector2 = "new UiSelector().textMatches(\"" +"Cancel Card"+ "\")";
	String command2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector2 + ");";
	String uiSelector3 = "new UiSelector().textMatches(\"" +"Continue arrow round-forward"+ "\")";
	String command3 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector3 + ");";
	String BUTTON_Details = "//android.widget.Button[@text = 'Details']";
	String BUTTON_EyeIcon = "//android.widget.Image";
	String BUTTON_AccountsCards = "//android.widget.Button[@text = ' Accounts & Cards']";
	String BUTTON_Accounts = "//android.widget.Button[@text = 'Accounts']";
	String BUTTON_DebitCards = "//android.widget.Button[@text = 'Debit Cards']";
	String BUTTON_CreditCards = "//android.widget.Button[@text = 'Credit Cards']";
	String BUTTON_MultiCurrencyCard = "//android.widget.Button[@text = 'Multi Currency Card']";
	String BUTTON_Net_worth_Statement = "//android.widget.Button[@text = 'Net worth Statement']";
	String Method_Name1 = "DEBIT CARD" ; 
	String Method_Name2 = "CREDIT CARD" ; 
	String Method_Name3 = "MULTI CURRENCY CARD" ; 
	String Method_Name4 = "NET WORTH STATMENT" ;
	String Method_Name5 = "WAZIN ACCOUNTS" ;
	String SELECT_CardDetails = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TextView";
	String OPTION_CardDetails = "(//android.widget.Button[@index='0']) [3]";
	String SELECT_CardLanguage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.widget.TextView";
	String OPTION_CardLanguage = "//android.widget.Button[@text = 'Arabic']";
	String SELECT_Delivery = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.Button";
	String OPTION_Delivery = "//android.widget.TextView[@text = 'Abha']";
	String SELECT_Branch = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View/android.widget.TextView";
	String OPTION_Branch = "//android.widget.Button[@text = 'Abha']";
	String SELECT_Account = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.widget.TextView";
	String OPTION_Account = "//android.widget.Button[@index = '2']";
	String STATUS = "ACTIVE";
	String INPUT = "//android.widget.EditText";
	String SELECT_REASON = "(//android.widget.TextView) [10]";
	String OPTION_REASON = "//android.widget.TextView[@text = 'Lost']";
	String BUTTON_StopCard = "//android.widget.Button[@text = 'Stop Card arrow round-forward']";
	String BUTTON_OK = "//android.widget.Button[@text = 'OK' ]";
	String BUTTON_StopTemporary = "//android.widget.Button[@text='Stop Temporary']";
	
	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	
	// ACCOUNTS =================================================================== 
	public void Check_Account_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Thread.sleep(6000);
			
			Methods.Open_Side_Bar();
			
			Base.Take_SscreenShot(RportName, "CHECK ACCOUNT DETAILS TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_Accounts)).click();
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE ACCOUNT YOU WANT TO CHECK THEN PRESS OK");
			
	        try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_EyeIcon)).click();
				Thread.sleep(6000);
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				// DO NOTHING
			}

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Details)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(AppiumBy.androidUIAutomator(command));
			Base.Take_SscreenShot(RportName , "");
			
			Methods.Back_To_Home_Screen();
			
			Base.Take_SscreenShot(RportName , "CHECK ACCOUNT DETAILS TEST IS PASSED");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName , " ERROR IN CHECK ACCOUNT DETAILS TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();

		}
	}
	
	public void Issue_Credit_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			Thread.sleep(6000);
			
			Methods.Open_Side_Bar();
						
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_Accounts)).click();
			
			Thread.sleep(7000);
			
			Methods.action_clickOnPosition(850, 850);
			Methods.action_clickOnPosition(850, 850);

			Thread.sleep(6000);

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(SELECT_CardDetails)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(OPTION_CardDetails)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(SELECT_CardLanguage)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(OPTION_CardLanguage)).click();
				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(SELECT_Delivery)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(OPTION_Delivery)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(SELECT_Branch)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(OPTION_Branch)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(SELECT_Account)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(OPTION_Account)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_Confirm2)).click();
			
			Methods.Get_OTP();
			
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
	// ============================================================================
	
	
	// DEBIT CARD ================================================================= 	
	public void Open_Dedit_Card() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot(Method_Name1, "OPEN DEBIT CARD");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();
		Base.Take_SscreenShot(Method_Name1 , "");


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_DebitCards)).click();
		Base.Take_SscreenShot(Method_Name1 , "");

	}
	
	public void Edit_POS_Limit(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_Dedit_Card();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, "EDIT DEBIT POS LIMIT TEST START");
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHANGE THE DEBIT POS LIMIT FOR THEN PRESS OK");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_EditLimit)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_EditLimitAmmount)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_EditLimitAmmount2)).click();
				Base.Take_SscreenShot(RportName , "");
			}
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_ChangeLimit)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Methods.Get_OTP();
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				// DO NOTHING
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BankToDetails)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Base.Take_SscreenShot(RportName , "EDIT DEBIT POS LIMIT TEST IS PASSED");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			Methods.Back_To_Home_Screen();
			
			driver.navigate().back();

		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName , " ERROR IN EDIT DEBIT POS LIMIT TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();

		}
	}

	public void Deactive_Active_Online_Purchasing(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Dedit_Card();

			} catch (Exception e) {
				// DO NOTHING
			}
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO ACTIVE OR DEACTIVE ONLINE PURCHASING FOR THEN PRESS OK");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath("("+BUTTON_Edit+") [1]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Base.Take_SscreenShot(RportName , "");
				driver.findElement(By.xpath(BUTTON_Deactivate)).click();
			} catch (Exception e) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_Activate)).click();
			STATUS = "ACTIVE" ; 
			}
			
			Methods.Get_OTP();
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				// DO NOTHING
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BankToDetails)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Base.Take_SscreenShot(Method_Name3 , "DEACTIVE & ACTIVE ONLINE PURCHASING TEST IS PASSED");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			Methods.Back_To_Home_Screen();

		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName , " ERROR IN DEACTIVE & ACTIVE ONLINE PURCHASING TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();

		}
		
	}
	
	public void Deactive_Active_Contactless(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Dedit_Card();

			} catch (Exception e) {
				// DO NOTHING 
			}
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO ACTIVE OR DEACTIVE CONTACLESS FOR THEN PRESS OK");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath("("+BUTTON_Edit+") [2]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Base.Take_SscreenShot(RportName , "");
				driver.findElement(By.xpath(BUTTON_Deactivate)).click();
			} catch (Exception e) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Base.Take_SscreenShot(RportName , "");
				driver.findElement(By.xpath(BUTTON_Activate)).click();
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BankToDetails)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Base.Take_SscreenShot(RportName , "DEACTIVE & ACTIVE ONLINE PURCHASING TEST IS PASSED");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			Methods.Back_To_Home_Screen();
			
			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName , " ERROR IN DEACTIVE & ACTIVE ONLINE PURCHASING TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();
		}
	}

	public void Show_Card_Pin(String RportName , int RowNumeber) throws IOException, InterruptedException {

		try {
			
			try {
				Open_Dedit_Card();

			} catch (Exception e) {
				// DO NOTHING
			}
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_ShowPin)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(6000);
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(6000);
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(6000);
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(6000);
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(6000);
			Methods.action_clickOnPosition(540, 2360);
			Methods.action_clickOnPosition(540, 2360);
			Thread.sleep(6000);



			Base.Take_SscreenShot(RportName , "SHOW CARD PIN TEST IS PASSED");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			Methods.Back_To_Home_Screen();
			
			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName , " ERROR IN SHOW CARD PIN TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();

		}
	}
	
	public void Stop_Temporary (String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			try {
				Open_Dedit_Card();

			} catch (Exception e) {
				// DO NOTHING
			}
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
	        
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_StopTemporary)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Confirm2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Methods.Get_OTP();
	        
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
	// ============================================================================
	
	 
	// CREDIT CARD ================================================================ 
	
	public void Open_Credit_Card() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot(Method_Name2, "OPEN CREDIT CARD");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();
		Base.Take_SscreenShot(Method_Name2 , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_CreditCards)).click();
		Thread.sleep(10000);
		Base.Take_SscreenShot(Method_Name2 , "");	
	}
	
	public void Check_Credit_Card_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Credit_Card();
			} catch (Exception e) {
				// DO NOTHING
			}
			
		Base.Take_SscreenShot(RportName , "CHECK CREDIT CARD DETAILS TEST START");
		
        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_Details)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(AppiumBy.androidUIAutomator(command2));
		Base.Take_SscreenShot(RportName , "");
		
		Base.Take_SscreenShot(RportName , "CHECK CREDIT CARD DETAILS TEST IS PASSED");
		Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		Methods.Back_To_Home_Screen();

		}
		catch (Exception e) {
		Base.Take_SscreenShot_Fail(RportName , " ERROR CHECK CREDIT CARD DETAILS TEST" + '\n' +e);
		Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		Methods.Back_To_Home_Screen();

	}

	}
	
	public void Load_Credit_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Credit_Card();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Base.Take_SscreenShot(RportName,  RportName+ " TEST START");
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
			
			Methods.action_clickOnPosition(215, 880);
			Methods.action_clickOnPosition(215, 880);

			
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT)).sendKeys("10");
			Base.Take_SscreenShot(RportName , "");
			
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
						
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Pay)).click();
			Base.Take_SscreenShot(RportName , "");
			

			Methods.Get_OTP();
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				// TODO: handle exception
			}
	
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST");
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + "TEST IS PASSED");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );

		}
		Methods.Back_To_Home_Screen();


	}

	public void Transfer_Credit_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Credit_Card();
			} catch (Exception e) {
				// TODO: handle exception
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
			
			Methods.action_clickOnPosition(545, 860);
			
			Thread.sleep(10000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Amount)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Amount)).sendKeys("20");
			Base.Take_SscreenShot(RportName , "");
			
			Methods.action_clickOnPosition(950, 2260);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Transfer)).click();
			Base.Take_SscreenShot(RportName , "");
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST");
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + "TEST IS PASSED");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}			
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );

		}
		Methods.Back_To_Home_Screen();

	}
	
	public void Stop_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
	try {
			
		try {
			Open_Credit_Card();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Base.Take_SscreenShot(RportName, RportName + "TEST START");
		
        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
		
		Methods.action_clickOnPosition(850, 850);
		Methods.action_clickOnPosition(850, 850);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(SELECT_REASON)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(OPTION_REASON)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_Continue2)).click();
		Base.Take_SscreenShot(RportName , "");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_StopCard)).click();
		Base.Take_SscreenShot(RportName , "");
		
		Methods.Get_OTP();
		
		Thread.sleep(5000);
		
		try {
			Methods.MW_PopUps();
			Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST");
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		} catch (Exception e) {
			Base.Take_SscreenShot(RportName ,  RportName + "TEST IS PASSED");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		}			
	} catch (Exception e) {
		Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST" + '\n' +e);
		Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );

	}
	Methods.Back_To_Home_Screen();
	}
	// ============================================================================


	// MULTI CURRENCY CARD ================================================================ 
	public void Open_Multi_Currency_Card() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot(Method_Name3, "OPEN CREDIT CARD");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();
		Base.Take_SscreenShot(Method_Name3 , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_MulticurrencyCard)).click();
		Thread.sleep(10000);
		Base.Take_SscreenShot(Method_Name3, "");	
	}

	public void Loan_Money(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Multi_Currency_Card();
			} catch (Exception e) {
				// TODO: handle exception
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Currency)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_LoadMoney)).click();
			Base.Take_SscreenShot(RportName , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(VIEW_AmountFrame)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Amount)).sendKeys("20");
			Base.Take_SscreenShot(RportName , "");
			
			Methods.action_clickOnPosition(950, 2260);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_HomePage)).click();
			Base.Take_SscreenShot(RportName , "");
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST");
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + "TEST IS PASSED");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		}
		
	}

	public void Check_Multi_Currency_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			try {
				Open_Multi_Currency_Card();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Details)).click();
			Base.Take_SscreenShot(RportName , "");

			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST");
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + "TEST IS PASSED");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		}
		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================
	
	
	// WAZIN ACCOUNTS ================================================================ 
	public void Open_Wazin_Accounts() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot(Method_Name4, "OPEN CREDIT CARD");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();
		Base.Take_SscreenShot(Method_Name4 , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_WazinAccounts)).click();
		Thread.sleep(10000);
		Base.Take_SscreenShot(Method_Name4, "");	
	}
	
	public void Check_Wazen_Accounts_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			try {
				Open_Wazin_Accounts();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Details)).click();
			Thread.sleep(2000);
			Base.Take_SscreenShot(RportName , "");

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
	
	public void Wazen_Accounts_Pause_Resume(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Wazin_Accounts();
			} catch (Exception e) {
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(550, 850);
			Methods.action_clickOnPosition(550, 850);

			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_OK)).click();
			Thread.sleep(2000);
			Base.Take_SscreenShot(RportName , "");
				
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
		
	}
	// ============================================================================

	
	// NET WORTH STATMENT ================================================================ 
	public void Open_Net_Worth_Statment() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot(Method_Name5, "OPEN CREDIT CARD");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();
		Base.Take_SscreenShot(Method_Name5 , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_NetWorthStatment)).click();
		Thread.sleep(10000);
		Base.Take_SscreenShot(Method_Name5, "");	
	}
	
	public void Chcek_Net_Worth_Statment(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Net_Worth_Statment();	
			} catch (Exception e) {
				// DO NOTHING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_PieChart)).click();
			Thread.sleep(2000);
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BarChart)).click();
			Thread.sleep(2000);
			Base.Take_SscreenShot(RportName , "");
			
			
			try {
				Methods.MW_PopUps();
				Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  "TEST");
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			} catch (Exception e) {
				Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  "ERROR" + RportName +  " TEST" + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		}
		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================


}


