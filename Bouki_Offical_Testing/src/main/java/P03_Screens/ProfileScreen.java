package P03_Screens;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.AppiumBy;

public class ProfileScreen extends Base {
	
	String BUTTON_Profile = "com.emcrey.riyadbank.cert:id/menuProfile" ;
	String BUTTON_ManageBenf = "//android.widget.TextView[@text= \"Manage Beneficiaries\"]";
	
	String BUTTON_BoukiWalletBenf = "//android.widget.TextView[@text= \"Bouki wallet Beneficiaries\"]";
	String BUTTON_BoukiAccountNumber = "//android.widget.TextView[@text = \"Bouki account number\"]";
	String INPUT_IBANNumber = "//android.widget.EditText[@text = \"IBAN Number\"]";
	String SELECT_RelationshipToBenf = "//android.widget.TextView[@text = \"Relationship to beneficiary\"]";
	String OPTION_Family = "//android.widget.TextView[@text = \"Family\"]";
	String INNPUT_Alias = "//android.widget.EditText[@text = \"Alias\"]";
	String CHECKBOX = "com.emcrey.riyadbank.cert:id/imageView_checkbox";
	String BUTTON_Next = "//android.widget.Button[@text = \"Next\"]";
	String BUTTON_SkipActiv = "//android.widget.TextView[@text = \"Skip without activiation\"]";
	String BUTTON_ReceiveCall = "//android.widget.TextView[@text = \"Receive an automated call from Bouki\"]";
	String BUTTON_MobileNumber = "//android.widget.TextView[@text ='Mobile number']";
	String BUTTON_Back = "com.emcrey.riyadbank.cert:id/imageView_back";
	String INPUT = "//android.widget.EditText";
	
	String BUTTON_RBBenf = "//android.widget.TextView[@text= \"Riyad Bank Beneficiaries\"]";
	String BUTTON_LocalBanksBenf = "//android.widget.TextView[@text= \"Local banks Beneficiaries\"]";
	String BUTTON_InternationalBenf  = "//android.widget.TextView[@text = \"International transfer Beneficiaries\"]";
	String BUTTON_Add = "//android.widget.TextView[@text = \"Add\"]";
	String BUTTON_RBAccountNumber = "//android.widget.TextView[@text = \"Riyad Bank account\"]";
	String INPUT_RBAccountNumber = "//android.widget.EditText[@text = \"Riyad Bank account\"]";
	String INPUT_FullName = "//android.widget.EditText[@text = \"Full Name\"]";
	String SELECT_City = "//android.widget.TextView[@text = \"City\"]";
	String OPTION_SAMTAH = "//android.widget.TextView[@text = \"SAMTAH\"]";
	String uiSelector = "new UiSelector().textMatches(\"" +"Next"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String BUTTON_BankName = "//android.widget.EditText[@text = \"Bank Name\"]";
	String BUTTON_BankCountry = "//android.widget.TextView[@text = \"Bank Country\"]";
	String INPUT_CustomerName = "//android.widget.EditText[@text = \"Customer Name\"]";
	String BUTTON_Cur = "//android.widget.TextView[@text = \"SAR\"]";
	String INPUT_Swift = "//android.widget.EditText[@text = \"SWIFT code\"]";
	String INPUT_BenfAddress = "//android.widget.EditText[@text = \"Beneficiary address\"]";
	String INPUT_BenfCity = "//android.widget.EditText[@text = \"Branch City\"]";
	
	String BUTTON_AliasManagmenet = "//android.widget.TextView[@text = \"Alias Account Management\"]";
	String BUTTON_RemoveAlias = "//android.widget.TextView[@text = \"Remove\"]";
	String BUTTON_Yes = "//android.widget.Button[@text = \"Yes, I am sure\"]";
	String Mehtod_Name = "Profile";
	CommenMethods Methods  = new CommenMethods(); 
	Base Base = new Base();
	Data Data = new Data();

	
	public void Open_Profile() throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_Profile)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

	}
	
	public void Open_Alias_Management() throws IOException, InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_AliasManagmenet)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

	}
	
	public void Remove_Alias() {
		Methods  = new CommenMethods();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_RemoveAlias)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_Yes)).click();
		
		Methods.InternalOTP();
		
		assertTrue(false);
		
		
	}
	
	public void Confirm_Add() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(CHECKBOX)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_Next)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_SkipActiv)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		
	}
	
	public void Open_Manage_Beneficiaries() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_ManageBenf)).click();
	}
	
	public void Bouki_Wallet_Beneficiaries(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			try {
				Open_Profile();
			} catch (Exception e) {
				// DO NOTHGING
			}
			
			try {
				Open_Manage_Beneficiaries();
			} catch (Exception e) {
				// DO NOTHGING
			}

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_BoukiWalletBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_Add)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_MobileNumber)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("("+INPUT+") [1]")).sendKeys("966545980075");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(SELECT_RelationshipToBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(OPTION_Family)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INNPUT_Alias)).sendKeys("TEST1");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			Confirm_Add();
			
			Methods.Back_To_Home_Screen();
			
			Open_Profile();
			
			Open_Manage_Beneficiaries();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_BoukiWalletBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
					
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
		
	}

	public void Riyad_Bank_Beneficiaries(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			try {
				Open_Profile();
			} catch (Exception e) {
				// DO NOTHGING
			}
			
			try {
				Open_Manage_Beneficiaries();
			} catch (Exception e) {
				// DO NOTHGING
			}
			
			// SA7920000001031853069940
			// 3030922459940
			// 1102976584
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_RBBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_Add)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_RBAccountNumber)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_RBAccountNumber)).sendKeys("3030922459940");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(SELECT_RelationshipToBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(OPTION_Family)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INNPUT_Alias)).sendKeys("TEST2");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			/*
			Confirm_Add();
			
			Methods.Back_To_Home_Screen();
			
			Open_Profile();
			
			Open_Manage_Beneficiaries();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_RBBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			*/
																		
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
				
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
		
	}

	public void Local_Bank_Beneficiaries(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			try {
				Open_Profile();
			} catch (Exception e) {
				// DO NOTHGING
			}
			
			try {
				Open_Manage_Beneficiaries();
			} catch (Exception e) {
				// DO NOTHGING
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_LocalBanksBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_Add)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_IBANNumber)).sendKeys("SA8980000429608010018227");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_FullName)).sendKeys("TEST8");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(SELECT_RelationshipToBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(OPTION_Family)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(SELECT_City)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(OPTION_SAMTAH)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.findElement(AppiumBy.androidUIAutomator(command));
			Base.Take_SscreenShot(Mehtod_Name , "");

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INNPUT_Alias)).sendKeys("TEST8");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			/*
			Confirm_Add();
			
			Methods.Back_To_Home_Screen();
			
			Open_Profile();
			
			Open_Manage_Beneficiaries();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_LocalBanksBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			*/
						
			Base.Take_SscreenShot(RportName ,  RportName + " TEST IS PASSED ");
			Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );
		
		} catch (Exception e) {
			Base.Take_SscreenShot_Fail(RportName ,  " ERROR " + RportName +  " TEST " + '\n' +e);
			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
		}
		Methods.Back_To_Home_Screen();
		
	}
	
	public void International_Transfer_Beneficiaries(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {
			
			Base.Take_SscreenShot(RportName, RportName + "TEST START");

			try {
				Open_Profile();
			} catch (Exception e) {
				// DO NOTHGING
			}
			
			try {
				Open_Manage_Beneficiaries();
			} catch (Exception e) {
				// DO NOTHGING
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_InternationalBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_Add)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_IBANNumber)).sendKeys("BH63BBME00001321546001");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_BankName)).sendKeys("STANDARD CHARTERED BANK");;
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_BankCountry)).click();;
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_CustomerName)).sendKeys("ASEL");;
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(SELECT_RelationshipToBenf)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(OPTION_Family)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_Cur)).click();
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			Thread.sleep(5000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_Swift)).sendKeys("SCBLBHBMXXX");;
			Base.Take_SscreenShot(Mehtod_Name , "");
				
			driver.findElement(AppiumBy.androidUIAutomator(command));
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_BenfAddress)).sendKeys("Bahrain");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INPUT_BenfCity)).sendKeys("BAHRAIN");
			Base.Take_SscreenShot(Mehtod_Name , "");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(INNPUT_Alias)).sendKeys("TEST5");
			Base.Take_SscreenShot(Mehtod_Name , "");
			
			Confirm_Add();
			
			Methods.Back_To_Home_Screen();
			
			Open_Profile();
			
			Open_Manage_Beneficiaries();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(BUTTON_InternationalBenf)).click();
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
