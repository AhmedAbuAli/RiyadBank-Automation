package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ApplyOnlineScreen extends Base{
	
	// APPLY ONLINE SCREEN VARIABLES
	String TextView = "//android.widget.TextView[@text = '";
	String BUTTON_ApplyTasheel = "//android.widget.Button[@text ='Apply for Tas’heel']"; 
	String VIEW_ApplyOnlineMenu ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]";
	String INPUT_MinBalance = "(//android.widget.EditText) [4]";
	String INPUT_TargetAmount = "(//android.widget.EditText) [3]";
	String OPTION_GoalType = "//android.widget.TextView[@text ='Buy A Car']";
	String SELECT_GoalType ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button";
	String INPUT_GoalPreferredName = "(//android.widget.EditText) [1]";
	String RADIO_WithRetiurns ="//android.widget.RadioButton[@text ='With returns']";
	String BUTTON_StartSaving ="//android.widget.Button[@text ='Start Saving Now']";
	String BUTTON_ApplyWazen = "//android.widget.Button[@text ='Apply for Wazin']";
	String BUTTON_Currency ="//android.widget.TextView[@text[contains(.,'USD')]]";
	String BUTTON_ApplyMultiCurrency = "//android.widget.Button[@text ='Apply for Multi Currency']";
	String BUTTON_ApplySalaryCard = "//android.widget.Button[@text ='Apply for Salary Card']";
	String INPUT_Address = "(//android.widget.EditText) [2]";
	String BUTTON_ApplyPrepaidCard = "//android.widget.Button[ @text ='Apply for Prepaid Card']";
	String BUTTON_CreateCard = "//android.widget.Button[@text ='Create card arrow round-forward']";
	String BUTTON_ApplyVirtualCard = "//android.widget.Button[@text ='Apply for Virtual Card']";
	String BUTTON_Confirm = "//android.widget.Button[@text ='Confirm']";
	String BUTTON_Continue = "//android.widget.Button[@text ='Continue']";
	String OPTION_City = "//android.widget.TextView[@text ='ABHA']";
	String OPTION_City2 = "//android.widget.TextView[@text ='Abha']";
	String SELECT_City = "(//android.widget.TextView[@text ='City Of Residence']) [2]";
	String SELECT_City2 = "(//android.widget.EditText) [1]";
	String SELECT_IncomeSector = "//android.widget.TextView[@text ='Select Income Sector']";
	String OPTION_Selector = "//android.widget.TextView[@text ='Private']";
	String SELECT_Selector = "//android.widget.TextView[@text ='Select a Sector']";
	String RADIO_NO = "//android.widget.RadioButton[@text = 'No']";
	String INPUT_MonthlyIncome = "//android.widget.EditText[@text = 'Monthly income']";
	String BUTTON_Apply ="//android.widget.Button[@text = 'Apply']";
	String BUTTON_CreditCard = "//android.widget.Button[@text = 'Apply for Credit Card']";
	String BUTTON_Calculate = "//android.widget.Button[@text = 'Calculate']";
	String BUTTON_AddintionalAccount = "//android.widget.Button[@text = 'Apply for Additional Account']";
	String BUTTON_ApplyOnline = "//android.widget.Button[@text = ' Apply Online']";
	String[] options = {"Current Account", "Saving Account without income", "Saving Account with income" , "Apply for Personal Loan" };
	String[] options2 = {"Short Process", "Long Process"};
	String Selected_Option = ""; 
	String BUTTON_OpenAccount = "(//android.widget.Button[@text = 'Open Account'])";
	String uiSelector = "new UiSelector().textMatches(\"" +"Apply for Personal Loan"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String uiSelector2 = "new UiSelector().textMatches(\"" +"Apply"+ "\")";
	String command2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector2 + ");";
	String uiSelector3 = "new UiSelector().textMatches(\"" +"Apply for Multi Currency"+ "\")";
	String command3 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector3 + ");";
	String uiSelector4 = "new UiSelector().textMatches(\"" +"Apply for Wazin"+ "\")";
	String command4 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector4 + ");";
	String uiSelector5 = "new UiSelector().textMatches(\"" +"Continue"+ "\")";
	String command5 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector5 + ");";
	String uiSelector6 = "new UiSelector().textMatches(\"" +" E-Care & Help"+ "\")";
	String command6 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector6+ ");";
	String uiSelector7 = "new UiSelector().textMatches(\"" +"Apply"+ "\")";
	String command7 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector7+ ");";
	String uiSelector8 = "new UiSelector().textMatches(\"" +"Education"+ "\")";
	String command8 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector8+ ");";
	String uiSelector9 = "new UiSelector().textMatches(\"" +"Continue arrow round-forward"+ "\")";
	String command9 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector9 + ");";
	String SELECT_Currency = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText";
	String OPTION_Currency = "//android.widget.TextView[@text[contains(.,'SAR')]]";
	String SELECT_Signature = "(//android.widget.TextView[@text ='Account signature']) [2]";
	String OPTION_Signature = "//android.widget.TextView[@text ='Current Account']";
	String BUTTON_Continue2 = "//android.widget.Button[@text = 'Continue arrow round-forward']";
	String CHECKBOX = "//android.widget.CheckBox";
	String BUTTON_AddAccount = "//android.widget.Button[@text ='Add account']";
	String SELECT_Purpose = "//android.widget.TextView[@text ='Select main purpose']";
	String OPTION_Purpose = "//android.widget.TextView[@text ='Buy a home']";
	String BUTTON_PrimaryMobile = "//android.widget.Button[@text = \"Primary Mobile arrow round-forward\"]"; 
	String SELECT_NumOfDepen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView";
	String OPTION_NumOfDepen = "//android.widget.TextView[@text ='1']";
	String SELECT_HomeOwn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.widget.TextView";
	String OPTION_HomeOwn = "//android.widget.TextView[@text ='Owned']";
	String SELECT_ResdinType = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.view.View/android.widget.TextView";
	String OPTION_ResdinType = "//android.widget.TextView[@text ='Apartment']";
	String BUTTON_Insurance = "//android.widget.Button[@text =' Insurance']";
	String BUTTON_MotorInsurance = "//android.widget.Button[@text ='Motor Insurance']";
	String BUTTON_BuyNow = "//android.widget.Button[@text ='Buy Now']";
	String BUTTON_ApplyPersonalLoan = "//android.widget.Button[@text='Apply for Personal Loan']";
	String SELECT_AllSelect = "//android.widget.TextView[@text='']";
	String OPTION_Sector = "//android.widget.TextView[@text='Private']";
	String INPUT = "//android.widget.EditText";
	String OPTION_CurrentEmployer = "//android.widget.TextView[@text='Development and Consulting Services Institute']";
	String OPTION_IncomeSector = "//android.widget.TextView[@text='GOSI']";
	String OPTION_City3 = "//android.widget.TextView[@text='Riyadh']";
	String OPTION_PurposeOfLoan = "//android.widget.TextView[@text='Renovation & Home Improvements']";
	KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
    KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
    KeyEvent keyEvent2 = new KeyEvent(AndroidKey.DIGIT_2);
    KeyEvent keyEvent3 = new KeyEvent(AndroidKey.DIGIT_3);
    KeyEvent keyEvent4 = new KeyEvent(AndroidKey.DIGIT_4);
    KeyEvent keyEvent5 = new KeyEvent(AndroidKey.DIGIT_5);
    KeyEvent keyEvent6 = new KeyEvent(AndroidKey.DIGIT_6);
    KeyEvent keyEvent7 = new KeyEvent(AndroidKey.DIGIT_7);
    KeyEvent keyEvent8 = new KeyEvent(AndroidKey.DIGIT_8);
    KeyEvent keyEvent9 = new KeyEvent(AndroidKey.DIGIT_9);
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
		
	public void Open_Apply_Online() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		Methods.Open_Side_Bar();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_ApplyOnline)).click();
			
	}
	// ============================================================================


	public void Complete_Account(String RportName ) throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(SELECT_Currency)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(OPTION_Currency)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(SELECT_Signature)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(OPTION_Signature)).click();
		
		try {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_Purpose)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Purpose)).click();

		} catch (Exception e) {

			// DO NOTHING

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Continue2)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(CHECKBOX)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_AddAccount)).click();
		
		Methods.Get_OTP();
	
	}
	// ============================================================================

	
	public void Open_Account(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Apply_Online();
									
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AddintionalAccount)).click();
			
			Selected_Option = Methods.Choose_List(options, "Open a new account", "Please choose an account to apply");
			
			if (Selected_Option == options[0]) {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_OpenAccount+" [1]")).click();
				
				Complete_Account(RportName);
			}
			else if (Selected_Option == options[1]) {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_OpenAccount+" [2]")).click();
				
				Complete_Account(RportName);
			}
			else if (Selected_Option == options[2]) {
						
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_OpenAccount+" [3]")).click();
				
				Complete_Account(RportName);
			}
		
			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			
			} catch (Exception e) {
			
				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}

		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================

	
	public void Create_Credit_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Apply_Online();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreditCard)).click();
			
			Thread.sleep(30000);
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO APPLY FOR THEN PRESS OK");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_MonthlyIncome)).click();
			
	        KeyEvent keyEvent3 = new KeyEvent(AndroidKey.DIGIT_3);
	        driver.pressKey(keyEvent3);
			
			for (int i = 0; i < 4; i++) {

		        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
		        driver.pressKey(keyEvent0);
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(RADIO_NO)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();
			
			Thread.sleep(20000);
			
			Selected_Option = Methods.Choose_List(options2, "Choose a process", "Please choose how you want to apply for the credit card ");

			if (Selected_Option == options2[1]) {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(SELECT_NumOfDepen)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(OPTION_NumOfDepen)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(SELECT_HomeOwn)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(OPTION_HomeOwn)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(SELECT_ResdinType)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(OPTION_ResdinType)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(AppiumBy.androidUIAutomator(command5)).click();;
				
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_Selector)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Selector)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_IncomeSector)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_IncomeSector)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_City)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_City)).click();
			
			 Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			Thread.sleep(30000);
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Continue)).click();
				Base.Take_SscreenShot( RportName, "");
			
			} catch (Exception e) {

				// DO NOTHING
			
			}
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm)).click();
				
			Methods.Get_OTP();
				
			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			
			} catch (Exception e) {
			
				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			}	
		
		} catch (Exception e) {
		
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		
		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================

	
	public void Creat_Virtual_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Apply_Online();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplyVirtualCard)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateCard)).click();
			Base.Take_SscreenShot( RportName, "");
			
			
			
			
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

	
	public void Creat_Prepaid_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Apply_Online();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplyPrepaidCard)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();

			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_City2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_City2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Address)).sendKeys("KSA - ABHA");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			Thread.sleep(7000);
			
			Methods.action_clickOnPosition(500, 1800);
			Methods.action_clickOnPosition(500, 1800);
			
			Thread.sleep(7000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm)).click();
			
			Methods.Get_OTP();

			Thread.sleep(30000);
			
			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			
			} catch (Exception e) {
			
				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			}

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		
		}

		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================

	
	public void Creat_Salary_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Apply_Online();
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplySalaryCard)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();
			Base.Take_SscreenShot( RportName, "");

			
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

	
	public void Creat_Multi_Currency_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Apply_Online();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command3));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplyMultiCurrency)).click();

			Thread.sleep(5000) ;
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_City2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_City2)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_Address)).sendKeys("KSA - ABHA");

			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();

			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			Thread.sleep(5000);
			
			Methods.action_clickOnPosition(550, 1500);
			Methods.action_clickOnPosition(550, 1500);

			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();

			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm)).click();
			
			Methods.Get_OTP();

			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			
			} catch (Exception e) {
				
				Base.Take_SscreenShot(RportName ,  RportName + " ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			}

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		
		}

		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================

	public void Creat_Wazen(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

		    Actions actions = new Actions(driver);

			Open_Apply_Online();
			
	        actions.moveToElement(driver.findElement(By.xpath(VIEW_ApplyOnlineMenu))).click().sendKeys(Keys.PAGE_DOWN).perform();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplyWazen)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_StartSaving)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(RADIO_WithRetiurns)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_GoalPreferredName)).sendKeys("Buy a car");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_GoalType)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_GoalType)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_TargetAmount)).click();
			
	        KeyEvent keyEvent3 = new KeyEvent(AndroidKey.DIGIT_3);
	        driver.pressKey(keyEvent3);
			
			for (int i = 0; i < 4; i++) {

		        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
		        driver.pressKey(keyEvent0);
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_MinBalance)).click();
			
	        KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
	        driver.pressKey(keyEvent0);
			
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command5)).click();;
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm)).click();
			
			Methods.Get_OTP();

			try {
				
				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			
			} catch (Exception e) {
				
				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			}

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		
		}

		Methods.Back_To_Home_Screen();
		
	}
	// ============================================================================

	public void Insurance_Motor_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Methods.Open_Side_Bar();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Insurance)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_MotorInsurance)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_BuyNow)).click();
			
			Thread.sleep(3000);
			
			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

			} catch (Exception e) {

				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

			}	

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

		}
		
	}

	public void Apply_Personal_Loan(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Methods.Open_Side_Bar();

			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command6));
				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplyOnline)).click();
			
			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_ApplyPersonalLoan)).click();

			Thread.sleep(15000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command7));

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();

			// SECTOR
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [1]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Sector)).click();

			Thread.sleep(3000);

			// SALARY DEPOSIT DAY
			driver.pressKey(keyEvent2);
			driver.pressKey(keyEvent8);

			driver.navigate().back();

			// CURRENT EMPLOYER
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [2]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_CurrentEmployer)).click();

			// INCOME SECTOR 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [3]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_IncomeSector)).click();
			
			// CITY
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [4]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_City3)).click();

			// POST CODE
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(("("+INPUT+") [2]"))).click();

			driver.pressKey(keyEvent2);
			driver.pressKey(keyEvent8);
			driver.pressKey(keyEvent8);
			driver.pressKey(keyEvent8);
			driver.pressKey(keyEvent8);

			driver.navigate().back();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command5));

			// BASIC SALARY
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(("("+INPUT+") [4]"))).click();

			driver.pressKey(keyEvent2);
			driver.pressKey(keyEvent8);
			driver.pressKey(keyEvent0);
			driver.pressKey(keyEvent0);
			driver.pressKey(keyEvent0);

			driver.navigate().back();

			//PURPOSE OF LOAN
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_AllSelect)).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_PurposeOfLoan)).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();

			// ==================================== END OF PAGE 1 ====================================

			Thread.sleep(5000);

			// NUMNER OF DEPENDETS
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [1]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(TextView+"1']")).click();
						
			// HOME OWNERSHIP
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [2]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(TextView+"Owned']")).click();

			// RESIDENTIAL TYPE
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [3]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(TextView+"Apartment']")).click();

			// RESIDENTIAL TYPE
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [3]")).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(TextView+"Apartment']")).click();


			// CITY OF RESIDENCE
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT_AllSelect+") [4]")).click();

			Thread.sleep(7000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(TextView+"ABHA']")).click();


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command5)).click();

			// ==================================== END OF PAGE 2 ====================================

			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Calculate)).click();

			// ==================================== END OF PAGE 3 ====================================

			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command9)).click();

			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			
			} catch (Exception e) {

				Thread.sleep(3000);

				Base.Take_SscreenShot(RportName ,  RportName + " ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			}

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		
		}

		driver.navigate().back();

		driver.navigate().back();

		driver.navigate().back();
		
		driver.navigate().back();
		
		Methods.Back_To_Home_Screen();
		
	}
}
