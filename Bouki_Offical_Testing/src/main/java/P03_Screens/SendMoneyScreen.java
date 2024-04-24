package P03_Screens;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;

public class SendMoneyScreen extends Base {

	// SEND MONEY OPTION VARIABLES
	String BUTTON_BoukiWallet = "//android.widget.TextView[@text=\"Bouki wallet\"]";
	String BUTTON_RBAccounts = "//android.widget.TextView[@text=\"Riyad Bank accounts\"]";
	String BUTTON_OtherLocalBanks = "//android.widget.TextView[@text=\"Other local banks\"]";
	String BUTTON_InternationalTransfer = "//android.widget.TextView[@text=\"International transfer\"]"; 
	//GENERAL VARIABLES
	CommenMethods Methods  = new CommenMethods(); 
	String ALERT_ERROR = "com.emcrey.riyadbank.cert:id/tvText";
	String BUTTON_SendMoney = "com.emcrey.riyadbank.cert:id/textView_send_money";
	String BUTTON_Back = "com.emcrey.riyadbank.cert:id/imageView_back";
	String BUTTON_Contact = "//android.view.ViewGroup";
	String INPUT_SendAmmount = "com.emcrey.riyadbank.cert:id/editText_amount";
	String BUTTON_Next = "//android.widget.TextView[@text = \"Next\"]";
	String BUTTON_TransferReason = "//android.widget.TextView[@text = \"Personal expenses\"]";
	String BUTTON_ConfirmSend = "com.emcrey.riyadbank.cert:id/button_send_money";
	String VIEW_ConfirmMessage = "//android.widget.TextView[@text = \"Transfer successful!\"]";
	String BUTTON_Done  = "com.emcrey.riyadbank.cert:id/button_done";
	String BUTTON_SavedBenfList = "//android.widget.TextView[@text = \"Saved Beneficiaries list\"]";
	String Mehtod_Name = "Send Momey";	
	Base Base = new Base();
	Data Data = new Data();


	public void Open_Send_Money () throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_SendMoney)).click();
		Base.Take_SscreenShot(Mehtod_Name , "OPEN SEND MONEY SERVICES");

	}
	
	public void Bouki_Wallet(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Send_Money();
			} catch (Exception e) {
				// DO NOTHING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_BoukiWallet)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+BUTTON_Contact+") [5]")).click();	
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(INPUT_SendAmmount)).sendKeys("10");
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Next)).click();	
			Base.Take_SscreenShot(Mehtod_Name , "");

			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_TransferReason)).click();	
				Base.Take_SscreenShot(Mehtod_Name , "");

				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Next)).click();
				Base.Take_SscreenShot(Mehtod_Name , "");

			} catch (Exception e) {
				// DO NOTHING 
			}

			ConfirmSend();
			
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		 catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
	}
	
	public void Riyad_Bank_Account(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Send_Money();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_RBAccounts)).click();
			Base.Take_SscreenShot(Mehtod_Name  , "");

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+BUTTON_Contact+") [5]")).click();	
			Base.Take_SscreenShot(Mehtod_Name  , "");

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(INPUT_SendAmmount)).sendKeys("10");
			Base.Take_SscreenShot(Mehtod_Name  , "");

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Next)).click();	
			Base.Take_SscreenShot(Mehtod_Name  , "");

			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_TransferReason)).click();	
				Base.Take_SscreenShot(Mehtod_Name , "");

				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Next)).click();
				Base.Take_SscreenShot(Mehtod_Name , "");

			} catch (Exception e) {
				// DO NOTHING 
			}

			ConfirmSend();
			
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		 catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
		}
	
	public void Other_Local_Banks(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Send_Money();
			} catch (Exception e) {
				// DO NOTHING
			}
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_OtherLocalBanks)).click();	
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_SavedBenfList)).click();	
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("("+BUTTON_Contact+") [5]")).click();	
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(INPUT_SendAmmount)).sendKeys("10");
			Base.Take_SscreenShot(Mehtod_Name , "");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Next)).click();	
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_TransferReason)).click();	
				Base.Take_SscreenShot(Mehtod_Name , "");

				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Next)).click();
				Base.Take_SscreenShot(Mehtod_Name , "");

			} catch (Exception e) {
				// DO NOTHING 
			}

			ConfirmSend();
			
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
			}	
		 catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
		}

	public void ConfirmSend() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_ConfirmSend)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		
		Methods.InternalOTP();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Base.Take_SscreenShot(Mehtod_Name , "");
		driver.findElement(By.id(BUTTON_Done)).click();
		}
		
}










