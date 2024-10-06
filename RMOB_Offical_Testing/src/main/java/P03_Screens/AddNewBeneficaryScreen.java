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
	String SELECT_BenfCity = "(//android.widget.Button[@text=''])[1]";
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
	String Country  = "UNITED ARAB EMIRATES";
	String Currency = "AED"; 
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
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_NewBenf)).click();

		Thread.sleep(3000);

	}
	// ============================================================================

	public void Riyad_Bank_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_New_Benf();

			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_WithinRiyadBank)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_AccountNumber)).click();
			
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
		    
		    driver.navigate().back();
		    
		    Thread.sleep(3000);
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Relationship)).click();
		    
			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			Methods.Get_OTP();
		    
			Methods.ChcekResult(RportName, RowNumeber);

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		
		}
		

	}
	// ============================================================================

	public void Local_Bank_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_New_Benf();

			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_LocalBank)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_IBAN)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_IBAN)).sendKeys("SA23 3040 0108 0889 2278 0010");
			// SA84 1500 0425 1072 1930 0018
			// SA12 6000 0000 9236 3945 0001
			// SA23 3040 0108 0889 2278 0010
			// SA80 6500 0000 1282 7292 4002

			
			driver.navigate().back();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_BenfName1)).sendKeys("AUTOMATION");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(SELECT_BenfCity)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_BenfCity)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [2]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION_Relationship)).click();
			
			Thread.sleep(5000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			Thread.sleep(10000);
			
			Methods.Get_OTP();
		 
			Methods.ChcekResult(RportName, RowNumeber);

		} catch (Exception e) {
			
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}
		
	
	}
	// ============================================================================

	public void International_Bank_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

		    Actions actions = new Actions(driver);

			Open_New_Benf();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_InternationalBank)).click();
			
			/*
			// SWIFT CODE INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [1]")).sendKeys("JDIBJOAM");
			Base.Take_SscreenShot(RportName , "");
						
			driver.navigate().back();
			
			Thread.sleep(5000);
			*/
						
			Thread.sleep(3000);

			// COUNTRY SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [1]")).click();
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys(Country);
			
			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2+"[@text='" + Country +"']")).click();
			
			Thread.sleep(3000);

			// CURRENCY SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [2]")).click();
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys(Currency);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2+"[@text='" + Currency +"']")).click();
			
			
			// BANK NAME SELECT 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [3]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION)).click();
						
			// IBAN INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [4]")).sendKeys("AE680340001234567891234");
			
			Thread.sleep(3000);
			
			// BENF NAME INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [5]")).sendKeys("AUTOMATION TEST");
			
			// RELATIONSHIP SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT2+") [4]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION)).click();
			
	        actions.moveToElement(driver.findElement(By.xpath(CHECKBOX))).click().sendKeys(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(3000);

	        // ADDRESS INPUT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [last()]")).click();;
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+")  [last()]")).sendKeys("DUBAI");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			Thread.sleep(15000);
			
			Methods.Get_OTP();
			
		 
			Methods.ChcekResult(RportName, RowNumeber);
		
		} catch (Exception e) {
		
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		
		}
		
	}
	// ============================================================================

	public void Money_Express_Benf(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				
				Open_New_Benf();
			
			} catch (Exception e) {
			
				// DO NOTHING
			
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_MoneyExpress)).click();
			
			// COUNTRY SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [1]")).click();
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys("India");
			
			Thread.sleep(3000);
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='India']")).click();
			
			
			// SERVICE SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT3+") [1]")).click();
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='Express Remittance']")).click();
			
	
			// PRODUCT SELECT
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT3+") [2]")).click();
			
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='Credit Beneficiary Account']")).click();
			
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
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + " [@text='ICICI Bank Limited']")).click();
			
			// BRANCH NAME 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [6]")).sendKeys("Azed Market");
			
			// BRANCH CITY 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [7]")).sendKeys("Delhi");
			
			// BENF ACCOUNT NUMBER 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [8]")).sendKeys("62258812194122401120");
			
			// IFSC CODE
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [9]")).sendKeys("ICIC0001023");
			
			try {
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
			
			} catch (Exception e) {
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(AppiumBy.androidUIAutomator(command)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Continue2)).click();
			}
			
			// =================== PAGE 2 ===================
			
			// BENF NAME 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [1]")).sendKeys("AUTOMATION TESTTT");
			
			// RELATIONSHIP
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+SELECT+") [1]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(OPTION2 + "[ @text='Family']")).click();
			
			// BENF MOBILE 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [5]")).sendKeys("0545980075");
			
			// BENF ID 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+INPUT+") [8]")).sendKeys("12345");
			
			// CHECKBOX 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
			// CHECKBOX 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CreateBenf)).click();
			
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

	
	 
	
	

}
