package P03_Screens;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;

public class SettingScreen extends Base{
	
	CommenMethods Methods  = new CommenMethods();
	LoginScreen Login = new LoginScreen();
	String BUTTON_AppSetting = "//android.widget.TextView[@text=\"App Settings\"]";
	String BUTTON_PassCode = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
	String BUTTON_EnableBio = "com.emcrey.riyadbank.cert:id/scSmartLogin";
	String BUTTON_AppLang = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
	String BUTTON_NotificationLang = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView";
	String BUTTON_EnableTouchOrFace = "//android.widget.Button[@text = \"Enable Touch/ Face ID\"]";
	String BUTTON_ArabicLang = "//android.widget.TextView[@text = \"العربية\"]";
	String BUTTON_EditInfo = "com.emcrey.riyadbank.cert:id/imageView_edit";
	String BUTTON_ChangeMobileNumber = "com.emcrey.riyadbank.cert:id/ivChangeMobile";
	Base Base = new Base();
	String Mehtod_Name = "Settings" ;
	public void Open_App_Setting() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_AppSetting)).click();;
	}
	
	public void Change_Passcode() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_PassCode)).click();

		Methods.Passowrd();
		
		Methods.Passowrd();

		Methods.Passowrd();
	}
	
	public void Enable_Bio () throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_EnableBio)).click();
		
		Methods.Passowrd();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_EnableTouchOrFace)).click();
		
		Thread.sleep(5000);	
	}
	
	public void App_Lang() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_AppLang)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_ArabicLang)).click();
	}
	
	public void Notification_Lang() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_NotificationLang)).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(BUTTON_ArabicLang)).click();
	}
	
	public void Open_Edit_Info() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_EditInfo)).click();
		Base.Take_SscreenShot(Mehtod_Name , "OPEN EDIT USER INFO");

	}
	
	public void Change_Mobile_Number () throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_ChangeMobileNumber)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		Login.InputNumber();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		Login.Input_New_Number();
		
		Methods.InternalOTP();
		Base.Take_SscreenShot(Mehtod_Name , "");

		
		
	}
	
}


