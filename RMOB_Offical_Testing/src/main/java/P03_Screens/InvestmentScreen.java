package P03_Screens;

//import org.openqa.selenium.Dimension;
import java.io.IOException;
import java.time.Duration;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//import org.openqa.selenium.interactions.Sequence;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Pause;
//import org.openqa.selenium.interactions.PointerInput;
import P01_Base.Base;
import P04_Utils.Data;
//import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class InvestmentScreen extends Base{
	
	// INVESTMENT SCREEN VARIABLES
    KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
    KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
    KeyEvent keyEvent5 = new KeyEvent(AndroidKey.DIGIT_5);

	String List_AllCompany = "(//android.view.View) [14]";
	String[] Companies = {
			"Al Bilad Bank",
			"Yanbu Petrochimical Company", 
			"Al Marai Diairy Company",
			"Saudi Research & Marketting Group",
			"Saudi Aramco Company - Luberef",
			"Basic Chemical Industries Co",
			"Halwani Bros Co",
			"Saudi Arabian Mining Company",
	} ;
	String BUTTON_Arrow = "//android.widget.Button[@text = '']";
	String uiSelector3 = "new UiSelector().textMatches(\"" +"Investments"+ "\")";
	String command3 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector3 + ");";
	String BUTTON_IPO = "//android.widget.Button[@text ='IPO']";
	String SELECT_Company = "//android.widget.EditText";
	String OPTION_Company = "//android.widget.TextView[@text='']";
	String CheckBox = "//android.widget.CheckBox";
	String BUTTON_Select ="//android.widget.Button[@text='Select arrow round-forward']";
	String[] options2 = {"Individual" , "With dependents"};
	String RADIO_Individual = "//android.widget.RadioButton[@text='Individual']";
	String RADIO_With_dependents = "//android.widget.RadioButton[@text='With dependents']";
	String BUTTON_Save = "//android.widget.Button[@text='Save']";
	String[] options3 = {"Yes" , "No"};
	String INPUT = "//android.widget.EditText";
	String BUTTON_Continue = "//android.widget.Button[@text = \"Continue arrow round-forward\"]";
	String BUTTON_Accept = "//android.widget.Button[@text ='Accept and Subscribe arrow round-forward']";
	String BUTTON_Investments = "//android.widget.Button[@text =' Investments']";
	String BUTTON_TimeDeposit = "//android.widget.Button[@text ='Time deposit']";
	String BUTTON_TimeDeposit2 = "//android.widget.Button[@text='Time Deposit arrow round-forward']";
	String Radio_Capitalize_Profit = "//android.widget.RadioButton[@text='Capitalize profit']";
	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	public void Open_Investments() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		Methods.Open_Side_Bar();
		
		Thread.sleep(5000);

		Methods.Swipe_Down();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_Investments)).click();		
	}
	// ============================================================================
	
	public void IPO(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_Investments();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_IPO)).click();
			
			Thread.sleep(10000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Arrow)).click();
			
			/* 
			String Selected_Option = Methods.Choose_List(Companies, "Company", "Please select a company to continue ");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//android.widget.TextView[@text = '"+Selected_Option+"']")).click();
			*/

			Thread.sleep(10000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CheckBox)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Select)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(RADIO_Individual)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Save)).click();

			/* 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).click();
		*/
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT)).sendKeys("10");
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
            driver.pressKey(keyEvent1);
            driver.pressKey(keyEvent0);

	        JOptionPane.showMessageDialog(null, "Please confirm that the account has enough balance , if not please change manually ");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Accept)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Accept)).click();
			
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

	public void Time_Deposit(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			
			Open_Investments();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_TimeDeposit)).click();
			
			Thread.sleep(5000);
			
	        JOptionPane.showMessageDialog(null, "Please confirm that the account has enough balance , if not please change manually ");			
			
            driver.pressKey(keyEvent5);
            
            for (int i = 1; i < 5; i++) {

				driver.pressKey(keyEvent0);

			}
            
            driver.navigate().back();
             
 			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 			driver.findElement(By.xpath(Radio_Capitalize_Profit)).click();
             
 			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 			driver.findElement(By.xpath(BUTTON_Continue)).click();
 			
 			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 			driver.findElement(By.xpath(CheckBox)).click();
 			
 			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 			driver.findElement(By.xpath(BUTTON_TimeDeposit2)).click();
 			
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
