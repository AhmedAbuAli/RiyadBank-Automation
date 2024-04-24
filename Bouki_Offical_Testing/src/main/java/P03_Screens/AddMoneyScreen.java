package P03_Screens;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;

public class AddMoneyScreen  extends Base{
	
	// CARD TOP-UP VARIABLES
	String BUTTON_CardTopUp = "//android.widget.TextView[@text=\"Card Top-Up\"]"; 
	String BUTTON_SavedCard = "com.emcrey.riyadbank.cert:id/container_saved_card";
	String INPUT_AMOUNT = "com.emcrey.riyadbank.cert:id/editText_amount";
	String BUTTON_AddToWallet = "com.emcrey.riyadbank.cert:id/button_add_to_wallet";
	String VIEW_ACSEmulator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView";
	String ALERT_MoneyAdded = "com.emcrey.riyadbank.cert:id/tvText";
	// LOCAL OR INTERNATIONAL VARIABLES
	String BUTTON_LocalOrInternational = "com.emcrey.riyadbank.cert:id/listItemView_bank_transfer";
	String VIEW_LcalBank = "com.emcrey.riyadbank.cert:id/textView_local_banks"; 
	String VIEW_Inernational = "com.emcrey.riyadbank.cert:id/textView_international_banks";
	String BUTTON_WallentAcountCopy = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView";
	String ALERT_WalletAccountOption = "com.emcrey.riyadbank.cert:id/tvText";
	// SADAD VARIABLES
	String BUTTON_SadadID = "//android.widget.TextView[@text=\"Using your own unique SADAD ID\"]" ;
	String BUTTON_SadadIDCopy = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView";
	String ALERT_SadadIDOption = "com.emcrey.riyadbank.cert:id/tvText";
	// GENERAL VARIABLES 
	String BUTTON_AddMoney = "com.emcrey.riyadbank.cert:id/textView_add_money";
	String BUTTON_Back = "com.emcrey.riyadbank.cert:id/imageView_back";
	String Mehtod_Name = "Add Momey";	
	CommenMethods Methods = new CommenMethods(); 
	Base Base = new Base();	
	Data Data = new Data();

	
	public void Open_Add_Money() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_AddMoney)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");
		
	}
	
	public void Card_TopUp(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Add_Money();
			} catch (Exception e) {
				// DO NOTHING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_CardTopUp)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));		
			driver.findElement(By.id(BUTTON_SavedCard)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
			driver.findElement(By.id(INPUT_AMOUNT)).sendKeys("10");
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(BUTTON_AddToWallet)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			Thread.sleep(15000);
			
			Methods.Click_On_Point(458, 1144);
			
			Thread.sleep(3000);

			Methods.Click_On_Point(350, 1400);
			Methods.Click_On_Point(350, 1400);
			
			Thread.sleep(3000);

			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
	}

	public void Local_Or_International(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_Add_Money();
			} catch (Exception e) {
				// DO NOTHING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(BUTTON_LocalOrInternational)).click();
			Base.Take_SscreenShot(Mehtod_Name , "LOCAL OR INTERNATIONAL TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_WallentAcountCopy)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
	}
	
	public void Sadad_ID(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			try {
				Open_Add_Money();
			} catch (Exception e) {
				// DO NOTHING
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_SadadID)).click();
			Base.Take_SscreenShot(Mehtod_Name , "SADAD ID TEST START");


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_SadadIDCopy)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
	}
}
	


