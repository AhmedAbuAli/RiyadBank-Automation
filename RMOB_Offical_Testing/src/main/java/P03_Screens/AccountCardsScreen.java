package P03_Screens;
import java.io.IOException;
import java.time.Duration;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

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
	String BUTTON_Cancel = "//android.widget.Button[@text='Cancel']";
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
	String RADIO_PayOtherAmount = "//android.widget.RadioButton[@text='Pay Other Amount']";
	String BUTTON_Refinance = "//android.widget.Button[@text=' Refinance']";
	String CHECKBOX = "//android.widget.CheckBox";
	String uiSelector7 = "new UiSelector().textMatches(\"" +"Apply"+ "\")";
	String command7 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector7+ ");";
	String BUTTON_Apply ="//android.widget.Button[@text = 'Apply']";
	String SELECT_AllSelect = "//android.widget.TextView[@text ='']";
	String OPTION_Sector = "//android.widget.TextView[@text='Private']";
	String OPTION_CurrentEmployer = "//android.widget.TextView[@text='Development and Consulting Services Institute']";
	String OPTION_IncomeSector = "//android.widget.TextView[@text='GOSI']";
	String OPTION_City3 = "//android.widget.TextView[@text='Riyadh']";
	String uiSelector5 = "new UiSelector().textMatches(\"" +"Continue"+ "\")";
	String command5 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector5 + ");";
	String OPTION_PurposeOfLoan = "//android.widget.TextView[@text='Renovation & Home Improvements']";
	String TextView = "//android.widget.TextView[@text = '";
	String BUTTON_Calculate = "//android.widget.Button[@text = 'Calculate']";
	String uiSelector9 = "new UiSelector().textMatches(\"" +"Continue arrow round-forward"+ "\")";
	String command9 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector9 + ");";
	String uiSelector4 = "new UiSelector().textMatches(\"" +"Change PIN"+ "\")";
	String command4 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector4 + ");";
	String uiSelector10 = "new UiSelector().textMatches(\"" +"Create PIN"+ "\")";
	String command10 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector10 + ");";


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
	
	
	// ACCOUNTS =================================================================== 
	public void Check_Account_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Thread.sleep(6000);
			
			Methods.Open_Side_Bar();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Accounts)).click();
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE ACCOUNT YOU WANT TO CHECK THEN PRESS OK");
			
	        try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_EyeIcon)).click();
				Thread.sleep(6000);
				
			} catch (Exception e) {
				// DO NOTHING
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Details)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(AppiumBy.androidUIAutomator(command));
						
			Base.Take_SscreenShot(RportName , "");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		}

		Methods.Back_To_Home_Screen();

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
	
	public void Refinance(String RportName , int RowNumeber) throws IOException, InterruptedException {
	
		try {

			Thread.sleep(6000);
			
			Methods.Open_Side_Bar();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Accounts)).click();
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE ACCOUNT YOU WANT TO CHECK THEN PRESS OK");
			
			Methods.action_clickOnPosition(550, 800);
			Methods.action_clickOnPosition(550, 800);

			Thread.sleep(10000);

			Thread.sleep(15000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command7));

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Apply)).click();

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();

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
	// ============================================================================
	
	
	// DEBIT CARD ================================================================= 	
	public void Open_Dedit_Card() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_DebitCards)).click();

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(AppiumBy.androidUIAutomator(command4));
		} catch (Exception e) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(AppiumBy.androidUIAutomator(command10));
		}





	}
	
	public void Edit_POS_Limit(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			try {

				Open_Dedit_Card();

			} catch (Exception e) {

				// DO NOTHING

			}
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHANGE THE DEBIT POS LIMIT FOR THEN PRESS OK");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_EditLimit)).click();
			
			Thread.sleep(3000);
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_EditLimitAmmount)).click();
				
			} catch (Exception e) {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_EditLimitAmmount2)).click();

			}
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_ChangeLimit)).click();
			
			Methods.Get_OTP();
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();

			} catch (Exception e) {

				// DO NOTHING
			
			}

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BankToDetails)).click();

			Base.Take_SscreenShot(RportName , "EDIT DEBIT POS LIMIT TEST IS PASSED");
			
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

			Methods.Back_To_Home_Screen();
			
			driver.navigate().back();

		} catch (Exception e) {

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
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Deactivate)).click();

			} catch (Exception e) {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Activate)).click();
			STATUS = "ACTIVE" ; 

			}
			
			Methods.Get_OTP();
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();

			} catch (Exception e) {

				// DO NOTHING

			}
			
			Thread.sleep(5000);

			Base.Take_SscreenShot(RportName , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BankToDetails)).click();
			
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			Methods.Back_To_Home_Screen();

		} catch (Exception e) {

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
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Deactivate)).click();

			} catch (Exception e) {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Activate)).click();
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BankToDetails)).click();
			
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

	public void Show_Card_Pin(String RportName , int RowNumeber) throws IOException, InterruptedException {

		try {
			
			try {

				Open_Dedit_Card();

			} catch (Exception e) {
				
				// DO NOTHING
			}
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD TO SHOW THE PIN THEN PRESS OK");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_ShowPin)).click();
				
			Thread.sleep(20000);

			Base.Take_SscreenShot(RportName , "");

			Methods.action_clickOnPosition(540, 2300);
			Methods.action_clickOnPosition(540, 2300);
			
			Thread.sleep(6000);

			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			Methods.Back_To_Home_Screen();
			
			
		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();

		}
	}
	
	public void Stop_Temporary (String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Dedit_Card();
			
	        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
	        
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_StopTemporary)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Confirm2)).click();
			
			Methods.Get_OTP();
	        
			Methods.ChcekResult(RportName, RowNumeber);

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}

	}
	// ============================================================================
	
	 
	// CREDIT CARD ================================================================ 
	public void Open_Credit_Card() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_CreditCards)).click();

		Thread.sleep(10000);
	}
	
	public void Check_Credit_Card_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
		Open_Credit_Card();
		
		Methods.Check_Alerts();

		JOptionPane.showMessageDialog(null, "Please make sure that the account is not dormant");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_Details)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(AppiumBy.androidUIAutomator(command2));
		
		Base.Take_SscreenShot(RportName , "");
		Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		Methods.Back_To_Home_Screen();

		}catch (Exception e) {

		Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		Methods.Back_To_Home_Screen();

	}

	}
	
	public void Load_Credit_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Credit_Card();
		
			Methods.Check_Alerts();
	
			JOptionPane.showMessageDialog(null, "Please make sure that the account is not dormant");

			Methods.action_clickOnPosition(215, 880);
			Methods.action_clickOnPosition(215, 880);

			Thread.sleep(5000);

			JOptionPane.showMessageDialog(null, "Please confirm that the account has enough balance , if not please change manually ");
		
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(RADIO_PayOtherAmount)).click();
			} catch (Exception e) {
				// DO NOTHING
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT)).sendKeys("10");
			
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
						
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Pay)).click();

			Methods.Get_OTP();
			
			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();

				Thread.sleep(3000);

				try {

					Methods.MW_PopUps();

					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					driver.findElement(By.xpath(BUTTON_Cancel)).click();

					Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
					
					Thread.sleep(3000);
				
				} catch (Exception e) {
					
					Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
					
					Base.Take_SscreenShot(RportName ,  RportName + "");
				
				}

			} catch (Exception e) {

				// DO NOTHING

			}
	
		} catch (Exception e) {

			Methods.MW_PopUps();
			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );

		}

		Methods.Back_To_Home_Screen();

	}

	public void Transfer_Credit_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_Credit_Card();
		
			Methods.Check_Alerts();
	
			JOptionPane.showMessageDialog(null, "Please make sure that the account is not dormant");

			Methods.action_clickOnPosition(545, 860);
			
			Thread.sleep(10000);

			JOptionPane.showMessageDialog(null, "Please confirm that the account has enough balance , if not please change manually ");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Amount)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_Amount)).sendKeys("20");
			
			Methods.action_clickOnPosition(950, 2260);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue2)).click();
			
			 try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Transfer)).click();
			 } catch (Exception e) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Pay)).click();
			 }

			try {

				Methods.MW_PopUps();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Cancel)).click();

				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );

			} catch (Exception e) {

				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );


		}

		Methods.Back_To_Home_Screen();

	}
	
	public void Stop_Card(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
	try {
			
		Open_Credit_Card();
		
        JOptionPane.showMessageDialog(null, "SLIDE MANUALLY TO THE CARD YOU WANT TO CHECK THEN PRESS OK");
		
		Methods.action_clickOnPosition(850, 850);
		Methods.action_clickOnPosition(850, 850);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(SELECT_REASON)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(OPTION_REASON)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_Continue2)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_StopCard)).click();
		
		Methods.Get_OTP();
		
		Thread.sleep(5000);
		
		Methods.ChcekResult(RportName, RowNumeber);		

	} catch (Exception e) {

		Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		Methods.Back_To_Home_Screen();

	}

}
	// ============================================================================


	// MULTI CURRENCY CARD ================================================================ 
	public void Open_Multi_Currency_Card() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_MulticurrencyCard)).click();
		Thread.sleep(10000);
	}

	public void Loan_Money(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			

			Open_Multi_Currency_Card();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

			if (driver.findElement(By.xpath(BUTTON_Currency)).isDisplayed() &&
			    driver.findElement(By.xpath(BUTTON_LoadMoney)).isEnabled()) {
				
					driver.findElement(By.xpath(BUTTON_LoadMoney)).click();

					Thread.sleep(5000);
			
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					driver.findElement(By.xpath(VIEW_AmountFrame)).click();
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					driver.findElement(By.xpath(INPUT_Amount)).sendKeys("20");
					
					Methods.action_clickOnPosition(950, 2260);

					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					driver.findElement(By.xpath(BUTTON_Continue2)).click();

					Base.Take_SscreenShot(RportName ,  RportName + "");
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					driver.findElement(By.xpath(BUTTON_HomePage)).click();

					Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

			} else {
				
				try {
					Methods.MW_PopUps();
				} catch (Exception e) {
					// DO NOTHING
				}

				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
				Methods.Back_To_Home_Screen();

			}

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
			Methods.Back_To_Home_Screen();


		}
		
	}

	public void Check_Multi_Currency_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
				Open_Multi_Currency_Card();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
				if (driver.findElement(By.xpath(BUTTON_Details)).isEnabled()) {

					driver.findElement(By.xpath(BUTTON_Details)).click();

					Base.Take_SscreenShot(RportName ,  RportName + "");
					Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				}
				else {

					try {
						Methods.MW_PopUps();
					} catch (Exception e) {
						// DO NOTHING
					}

					Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );

				}
					
			Methods.Back_To_Home_Screen();

			}
	// ============================================================================
	
	
	// WAZIN ACCOUNTS ================================================================ 
	public void Open_Wazin_Accounts() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_WazinAccounts)).click();
		Thread.sleep(10000);
		
	}
	
	public void Check_Wazen_Accounts_Details(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Wazin_Accounts();

			Thread.sleep(20000);

			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

			} catch (Exception e) {

				JOptionPane.showMessageDialog(null, "Slide manually to the account you want to check");

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.xpath(BUTTON_Details)).click();

				Thread.sleep(2000);

				Base.Take_SscreenShot(RportName , "");

				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );


			}	

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

		}
		Methods.Back_To_Home_Screen();
	}
	
	public void Wazen_Accounts_Pause_Resume(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_Wazin_Accounts();

			Thread.sleep(10000);
			
			JOptionPane.showMessageDialog(null, "Slide manually to the account you want pause / resume ");

			Methods.action_clickOnPosition(550, 850);
			Methods.action_clickOnPosition(550, 850);

			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_OK)).click();

			Thread.sleep(2000);
				
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

	
	// NET WORTH STATMENT ================================================================ 
	public void Open_Net_Worth_Statment() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		
		Methods.Open_Side_Bar();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_AccountsCards)).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(BUTTON_NetWorthStatment)).click();
		Thread.sleep(10000);
	}
	
	public void Chcek_Net_Worth_Statment(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_Net_Worth_Statment();	

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_PieChart)).click();
			Thread.sleep(2000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_BarChart)).click();
			Thread.sleep(2000);
			
			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
				

			} catch (Exception e) {

				Base.Take_SscreenShot(RportName ,  RportName + " ");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

			}

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , "FAIL" );
		}
		
		Methods.Back_To_Home_Screen();
	}
	// ============================================================================


}
