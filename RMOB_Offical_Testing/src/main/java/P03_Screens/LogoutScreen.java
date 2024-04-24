package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;

public class LogoutScreen extends Base {
	
	String BUTTON_Logout = "//android.widget.Button[@text='Logout']";
	String BUTTON_Yes = "//android.widget.Button[@text='Yes']";
	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods(); 
	Base Base = new Base();	
	Data Data = new Data();
	
	public void Logout(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			Methods.Open_Side_Bar();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Logout)).click();
			Base.Take_SscreenShot(RportName , "");
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Yes)).click();
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
	

}
