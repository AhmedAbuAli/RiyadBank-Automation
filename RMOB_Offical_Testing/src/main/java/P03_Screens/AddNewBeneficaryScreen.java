package P03_Screens;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddNewBeneficaryScreen extends Base {
	
	// ADD NEW BENFICARY SCREEN VARIABLES
	String BUTTON_MoneyExpress = "//android.widget.Button[@index ='7']";
	String INPUT = "//android.widget.EditText";
	String BUTTON_InternationalBank = "//android.widget.Button[@index = '5']";
	String OPTION_BenfCity = "//android.widget.TextView[@text = 'TABUK']";
	String SELECT_BenfCity = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[6]/android.view.View/android.widget.Button";
	String INPUT_BenfName1 = "(//android.widget.EditText) [4]";
	String INPUT_IBAN = "//android.widget.EditText[@text= 'SA']";
	String BUTTON_LocalBank = "//android.widget.Button[@index = '3']";
	String BUTTON_NewBenf = "//android.widget.Button[@text = ' New Beneficiary']";
	String BUTTON_WithinRiyadBank = "//android.widget.Button[@index = '1']";
	String INPUT_AccountNumber = "//android.widget.EditText[@text = 'Account Number']";
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
	String AccountNumber = "3030850959940" ;
	String CHECKBOX = "//android.widget.CheckBox";
	String SELECT = "//android.widget.Button[@text ='']";
	String SELECT2 = "//android.widget.TextView[@text ='']";
	String SELECT3 = "//android.widget.TextView[@text ='']";
	String OPTION = "(//android.widget.TextView[@index ='0']) [5]";
	String OPTION2 = "//android.widget.TextView";
	String OPTION_Relationship = "//android.widget.TextView[@text ='Family']";
	String BUTTON_CreateBenf = "//android.widget.Button[@text ='Create Beneficiary arrow round-forward']";
	String[] options = { "All Services", "Within Riyad Bank Beneficiary" };
	String Selected_Option = ""; 
	String uiSelector = "new UiSelector().textMatches(\"" +"Continue arrow round-forward"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String BUTTON_Continue2 = "//android.widget.Button[@text ='Continue arrow round-forward']";
    
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	public void ChooseScript(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		Open_New_Benf();
		
		Selected_Option = Methods.Choose_List(options, "Add New Beneficiary", "Please Choose The Type Of The Beneficiary You Want To Add ");
		
		if (Selected_Option == options[1]) {
			
			RportName = RportName + " - RIYAD BANK BENEFICIARY" ;
			Riyad_Bank_Benf(RportName, RowNumeber);
		}
		else {
			System.out.println("NOTHING YET");
		}
	}
	// ============================================================================

	public void Open_New_Benf() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
				
		Base.Take_SscreenShot("ADD NEW BENFICIARY", "OPEN NEW BENFICIARY");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_NewBenf)).click();
		Base.Take_SscreenShot("ADD NEW BENFICIARY" , "");
	}
	// ============================================================================

	public void Riyad_Bank_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_New_Benf();
			} catch (Exception e) {
				// DO NOTHING 
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_WithinRiyadBank)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_AccountNumber)).click();
			Base.Take_SscreenShot(RportName , "");
			
		    driver.pressKey(keyEvent3);
		    driver.pressKey(keyEvent0);
		    driver.pressKey(keyEvent3);
		    driver.pressKey(keyEvent0);
		    driver.pressKey(keyEvent8);
		    driver.pressKey(keyEvent5);
		    driver.pressKey(keyEvent0);
		    driver.pressKey(keyEvent9);
		    driver.pressKey(keyEvent5);
		    driver.pressKey(keyEvent9);
		    driver.pressKey(keyEvent9);
		    driver.pressKey(keyEvent4);
		    driver.pressKey(keyEvent0);
		    // 3030850959940
		    
		    driver.navigate().back();
		    
		    Thread.sleep(3000);
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Relationship)).click();
			Base.Take_SscreenShot(RportName , "");
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
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

	public void Local_Bank_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_New_Benf();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_LocalBank)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_IBAN)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_IBAN)).sendKeys("SA12 6000 0000 9236 3945 0001");
			Base.Take_SscreenShot(RportName , "");
			// 10 4500 0000 0011 5416 0001
			
			driver.navigate().back();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_BenfName1)).sendKeys("AUTOMATION");
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_BenfCity)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_BenfCity)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [2]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Relationship)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(10000);
			
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

	public void International_Bank_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

		    Actions actions = new Actions(driver);

			try {
				Open_New_Benf();
			} catch (Exception e) {
				// DO NOTHING 
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_InternationalBank)).click();
			Base.Take_SscreenShot(RportName , "");
			
			/*
			// SWIFT CODE INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [1]")).sendKeys("JDIBJOAM");
			Base.Take_SscreenShot(RportName , "");
						
			driver.navigate().back();
			
			Thread.sleep(5000);
			*/
						
			
			// COUNTRY SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [1]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys("UNITED ARAB EMIRATES");
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
		
			// CURRENCY SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [2]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys("AED");
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			// BANK NAME SELECT 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [3]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION)).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			
			// IBAN INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [4]")).sendKeys("AE680340001234567891234");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			// BENF NAME INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [5]")).sendKeys("AUTOMATION TEST");
			Base.Take_SscreenShot(RportName , "");
			
			// RELATIONSHIP SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [4]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION)).click();
			Base.Take_SscreenShot(RportName , "");
			
	        actions.moveToElement(driver.findElement(By.xpath(CHECKBOX))).click().sendKeys(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(3000);

	        // ADDRESS INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [last()]")).click();;
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+")  [last()]")).sendKeys("DUBAI");
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(15000);
			
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

	public void Money_Express_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_New_Benf();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_MoneyExpress)).click();
			Base.Take_SscreenShot(RportName , "");
			
			// COUNTRY SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [1]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys("India");
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='India']")).click();
			Base.Take_SscreenShot(RportName , "");
			
			
			// SERVICE SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT3+") [1]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='Express Remittance']")).click();
			Base.Take_SscreenShot(RportName , "");
			
	
			// PRODUCT SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT3+") [2]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='Credit Beneficiary Account']")).click();
			Base.Take_SscreenShot(RportName , "");
			
			Thread.sleep(3000);
			
			// CLICK NO TO SWIFT CODE 
			Methods.action_clickOnPosition(700, 1650);
			Methods.action_clickOnPosition(700, 1650);
			
			try {
				Methods.MW_PopUps();
			} catch (Exception e) {
				// DO NOTHING 
			}
			
			Thread.sleep(3000);
 
			// BANK NAME 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [3]")).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + " [@text='ICICI Bank Limited']")).click();
			Base.Take_SscreenShot(RportName , "");
			
			// BRANCH NAME 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [6]")).sendKeys("Azed Market");
			Base.Take_SscreenShot(RportName , "");
			
			// BRANCH CITY 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [7]")).sendKeys("Delhi");
			Base.Take_SscreenShot(RportName , "");
			
			// BENF ACCOUNT NUMBER 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [8]")).sendKeys("62258812194122401120");
			Base.Take_SscreenShot(RportName , "");
			
			// IFSC CODE
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [9]")).sendKeys("ICIC0001023");
			Base.Take_SscreenShot(RportName , "");
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
				Base.Take_SscreenShot(RportName , "");
			} catch (Exception e) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(AppiumBy.androidUIAutomator(command)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
				Base.Take_SscreenShot(RportName , "");
			}
			
			// =================== PAGE 2 ===================
			
			// BENF NAME 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [1]")).sendKeys("AUTOMATION TESTTT");
			Base.Take_SscreenShot(RportName , "");
			
			// RELATIONSHIP
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [1]")).click();
			Base.Take_SscreenShot(RportName , "");	
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='Family']")).click();
			Base.Take_SscreenShot(RportName , "");
			
			// BENF MOBILE 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [5]")).sendKeys("0545980075");
			Base.Take_SscreenShot(RportName , "");
			
			// BENF ID 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [8]")).sendKeys("12345");
			Base.Take_SscreenShot(RportName , "");	
			
			// CHECKBOX 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			Base.Take_SscreenShot(RportName , "");
			
			// CHECKBOX 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
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

	
	 
	
	

}
