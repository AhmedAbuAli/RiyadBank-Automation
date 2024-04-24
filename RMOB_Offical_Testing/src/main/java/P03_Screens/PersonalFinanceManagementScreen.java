package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;

public class PersonalFinanceManagementScreen extends Base{

	// PERSONAL FINANCE MANAGEMENT SCREEN VARIABLES
	String BUTTON_PFM = "//android.widget.Button[@text[contains(.,'Personal Finance Management')]]";
	String BUTTON_Expenses = "//android.widget.Button[@text ='EXPENSES']";
	String BUTTON_Incomes = "//android.widget.Button[@text ='INCOMES']";
	String BUTTON_Activity = "//android.widget.Button[@text ='ACTIVITY']";
	String BUTTON_ViewMore = "//android.widget.TextView[@text[contains(.,'View more')]]";

	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	
	public void Open_PFM() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
				
		Base.Take_SscreenShot("PERSONAL FINANCE MANAGEMENT", "OPEN PERSONAL FINANCE MANAGEMENT");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_PFM)).click();
		Base.Take_SscreenShot("PERSONAL FINANCE MANAGEMENT" , "");
	}
	// ============================================================================

	
	public void PFM_Check_Activity(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			try {
				Open_PFM();
			} catch (Exception e) {
				// DO NOTHING 
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Expenses)).click();
			Base.Take_SscreenShot( RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Incomes)).click();
			Base.Take_SscreenShot( RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Activity)).click();
			Base.Take_SscreenShot( RportName , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath( BUTTON_ViewMore)).click();
			Base.Take_SscreenShot( RportName , "");
			
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
