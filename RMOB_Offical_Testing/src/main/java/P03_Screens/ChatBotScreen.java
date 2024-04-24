package P03_Screens;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;

public class ChatBotScreen extends Base {
	
	// CHATBOT SCREEN VARIABLES
	String BUTTON_ChatBot ="//android.widget.Button[@text ='']";
	String INPUT = "//android.widget.EditText";	

	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	
	public void Chatbot_Chceck(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath( BUTTON_ChatBot)).click();
			Base.Take_SscreenShot( RportName , "");
			
			Thread.sleep(3000);
			
			Methods.action_clickOnPosition(600, 2300);
			Methods.action_clickOnPosition(600, 2300);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath( INPUT)).sendKeys("Hi");
			Base.Take_SscreenShot( RportName , "");
			
			Thread.sleep(3000);

			Methods.action_clickOnPosition(85, 1500);
			Methods.action_clickOnPosition(85, 1500);

			
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
