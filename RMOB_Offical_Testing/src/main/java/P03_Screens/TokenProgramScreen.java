package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;

public class TokenProgramScreen extends Base {
	
	// TOKEN PROGRAM SCREEN VARIABLES
	String BUTTON_AddChild = "//android.widget.Button[@text='Add Child']";
	String uiSelector2 = "new UiSelector().textMatches(\"" +"I have read and agree the Terms & Conditions for SDB (Social Development Bank)"+ "\")";
	String command2 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector2 + ");";
	String CHECKBOX = "//android.widget.CheckBox";
	String uiSelector = "new UiSelector().textMatches(\"" +"I accept the T&C for Riyad Bank TOKEN Junior Banking"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String INPUT_ChildEmail2 = "(//android.widget.EditText) [5]";
	String INPUT_ChildEmail = "(//android.widget.EditText) [4]";
	String INPUT_ChildNumber2  = "(//android.widget.EditText) [3]";
	String INPUT_ChildNumber  = "(//android.widget.EditText) [2]";
	String INPUT_ChildUsername = "(//android.widget.EditText) [1]";
	String BUTTON_Continue = "//android.widget.Button[@text ='Continue']";
	String INPUT_ChildID = "//android.widget.EditText";
	String BUTTON_AddToken = "//android.widget.Button[@text ='add']";
	String CLOSE__AddFamilyMember = "//android.view.View[@content-desc='']";
	String VIEW_AddFamilyMember = "//android.widget.TextView[@text = 'Add Family Members']";
	String BUTTON_TokenProgram = "//android.widget.Button[@text = ' TOKEN Program']";
	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	

	public void Open_Token_Program() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		
		Methods.Open_Side_Bar();
		
		Base.Take_SscreenShot("APPLY ONLINE", "OPEN APPLY ONLINE");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_TokenProgram)).click();
		Base.Take_SscreenShot("APPLY ONLINE" , "");
			
	}
	
	public void Apply_Token(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Open_Token_Program();

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			try {
				if (driver.findElement(By.xpath(VIEW_AddFamilyMember)).isDisplayed()) {
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.findElement(By.xpath(CLOSE__AddFamilyMember)).click();
					Base.Take_SscreenShot( RportName, "");
				}
			} catch (Exception e) {
				// DO NOTHING 
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AddToken)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildID)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildID)).sendKeys("1181272806");
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot( RportName, "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildUsername)).sendKeys("AhmedMMMM");
			Base.Take_SscreenShot( RportName, "");
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildNumber)).sendKeys("966545980075");
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildNumber2)).sendKeys("966545980075");
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildEmail)).sendKeys("test@gmail.com");
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(INPUT_ChildEmail2)).sendKeys("test@gmail.com");
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.androidUIAutomator(command));
			Base.Take_SscreenShot(RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
			Base.Take_SscreenShot( RportName, "");
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(CHECKBOX)).click();
			Base.Take_SscreenShot( RportName, "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AddChild)).click();
			Base.Take_SscreenShot( RportName, "");
			
			Thread.sleep(3000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_AddChild)).click();
			Base.Take_SscreenShot( RportName, "");
			
			Thread.sleep(3000);

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
	
}
