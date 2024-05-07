package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;

// SCRIPT NOT FULLY DONE 
public class AccountIdentifierManagementScreen extends Base {

	// ACCOUNT IDENTIFIER MANGAMENET SCREEN VARIABLES
	String BUTTON_Continue2 = "//android.widget.Button[@text = 'Continue arrow round-forward']";
	String OPTION_UnlinkReason = "//android.widget.TextView[@text='Privacy Concern']";
	String SELECT_UnlinkReason = "//android.widget.TextView[@text='Unlink Reason']";
	String BUTTON_UnlinkMyAccount  ="//android.widget.Button[@text ='Unlink Existing Account']";
	String eyeImg = "//android.widget.Image[@text='icon_eye_balance']";
	String BUTTON_AccountIcon = "//android.widget.Button[contains(@text, 'Account Identifier Management')]";
	String uiSelector = "new UiSelector().textMatches(\"" +"Link New Account"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String linkBtn = "//android.widget.Button[@text='Link New Account']";
	String BUTTON_Account = "//android.widget.TextView[@text='Account']";
	String selectAcc = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View";
	String BUTTON_CurrentAccount = "(//android.widget.TextView[@text=\"Current Account\"])[2]";
	String BUTTON_Identifier = "//android.widget.TextView[@text='Identifier']";
	String BUTTON_LinkNewAccount = "//android.widget.Button[@text='Link New Account']";
	String BUTTON_IdentifierOption1 = "(//android.widget.TextView[contains(@text, '966')]) [1]";
	String BUTTON_IdentifierOption2 = "(//android.widget.TextView[contains(@text, '@')]) [1]";
	String BUTTON_Continue = "//android.widget.Button[@text='Continue']";
	String BUTTON_Confirm = "//android.widget.Button[@text='Confirm']";
	String confirmUnlink = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button";
	String BUTTON_Home = "//android.widget.Button[contains(@text, 'Homepage')]";
	String ok = "//android.widget.Button[@text='OK']";
	String Method_Name1 = "LINK MY ACCOUNT" ;
	String Method_Name2 = "UNLINK MY ACCOUNT";
	String BUTTON_MoneyIcon = "//android.widget.Button[@index='0']";
	String BUTTON_AccountRemove = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View";
	String reason = "//android.widget.TextView[@text='Privacy Concern']";
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods(); 
	Base Base = new Base();	
	Data Data = new Data();
	
	
	public void All_Account_Identifier_Management(int RowNumeber) throws IOException, InterruptedException {
		
		String Cat = "ACCOUNT IDENTIFIER MANGAMENET - ";
		link_My_Account	 (Cat+"LINK MY ACCOUNT", RowNumeber);
		UnLink_My_Account(Cat+"UNLINK MY ACCOUNT", RowNumeber+1);

	}
	// ============================================================================
	
	public void link_My_Account(String RportName , int RowNumeber) throws IOException, InterruptedException {

		try {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AccountIcon)).click();

			Thread.sleep(5000);

			try {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_LinkNewAccount)).click();	

			} catch (Exception e) {
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(AppiumBy.androidUIAutomator(command)).click();
			
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Account)).click();

			JOptionPane.showMessageDialog(null, "Please choose account to link the press ok ");


			/*
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Base.Take_SscreenShot(RportName , "");
			driver.findElement(By.xpath(BUTTON_CurrentAccount)).click();
			
			*/

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Identifier)).click();

			Thread.sleep(5000);

			try {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_IdentifierOption1)).click();

			} catch (Exception e) {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_IdentifierOption2)).click();
				
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();


			Thread.sleep(10000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm)).click();
			
			try {

				Methods.MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );

				Methods.Back_To_Home_Screen();

			} catch (Exception e) {

				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			
			}	

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
	}
	// ============================================================================

	public void UnLink_My_Account(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AccountIcon)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_UnlinkMyAccount)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Account)).click();
			
			Thread.sleep(3000);
			
			Methods.action_clickOnPosition(500, 2260);
			Methods.action_clickOnPosition(500, 2260);

			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_UnlinkReason)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_UnlinkReason)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Confirm)).click();
			
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

}

		

