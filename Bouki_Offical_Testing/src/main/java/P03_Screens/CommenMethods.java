package P03_Screens;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;

import P01_Base.Base;

public class CommenMethods extends Base {
	
	// OTP & PASSWORD VARIABLES
	String BUTTON_NUM0 = "com.emcrey.riyadbank.cert:id/btn0";
	String BUTTON_NUM1 = "com.emcrey.riyadbank.cert:id/btn1"; 
	String BUTTON_NUM2 = "com.emcrey.riyadbank.cert:id/btn2";
	String BUTTON_NUM3 = "com.emcrey.riyadbank.cert:id/btn3"; 
	String BUTTON_NUM4 = "com.emcrey.riyadbank.cert:id/btn4"; 
	String BUTTON_NUM5 = "com.emcrey.riyadbank.cert:id/btn5"; 
	String BUTTON_NUM6 = "com.emcrey.riyadbank.cert:id/btn6"; 
	String BUTTON_NUM7 = "com.emcrey.riyadbank.cert:id/btn7"; 
	String BUTTON_NUM8 = "com.emcrey.riyadbank.cert:id/btn8";
	String BUTTON_NUM9 = "com.emcrey.riyadbank.cert:id/btn9"; 
	String VIEW_TITLE = "com.emcrey.riyadbank.cert:id/textView_title";
	
	// POPUPS VARIABLES
	String VIEW_LogInOptions = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView";
	String BUTTON_ThisDevice = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]";
	String VIEW_BalanceInfo = "com.emcrey.riyadbank.cert:id/textView_title";
	String BUTON_Okey = "com.emcrey.riyadbank.cert:id/button_primary";
	String VIEW_Bio = "com.emcrey.riyadbank.cert:id/textView_title";
	String BUTTON_MaybeLater = "com.emcrey.riyadbank.cert:id/textView_negative";
	String BUTTON_Back = "com.emcrey.riyadbank.cert:id/imageView_back";
	String BUTTON_Home = "//android.widget.FrameLayout[@content-desc=\"Home\"]";
		
 	public void OTP() {
		if (driver.findElement(By.id(VIEW_TITLE)).getText().contains("We've sent you a code")) {
			for (int j = 0; j < 4; j++) {
				driver.findElement(By.id(BUTTON_NUM0)).click();
			}	
		}
	}
	
	public void InternalOTP() {
		for (int j = 0; j < 4; j++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id(BUTTON_NUM0)).click();
		}
		
	}
	
	public void Devic_PopUps () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		if (driver.findElement(By.xpath(VIEW_LogInOptions)).getText().contains("You can only be connected to one device")) {
			driver.findElement(By.xpath(BUTTON_ThisDevice)).click();
		}	
	}
	
	public void Bio_PopUps() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
		if (driver.findElement(By.id(VIEW_Bio)).getText().equals("Keep your account secure")) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id(BUTTON_MaybeLater)).click();
		}
	}
	
	public void Passowrd () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id(BUTTON_NUM1)).click();
		driver.findElement(By.id(BUTTON_NUM4)).click();
		driver.findElement(By.id(BUTTON_NUM2)).click();
		driver.findElement(By.id(BUTTON_NUM5)).click();
		driver.findElement(By.id(BUTTON_NUM3)).click();
		driver.findElement(By.id(BUTTON_NUM6)).click();
	}
	
	public void CardPin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_NUM2)).click();
		driver.findElement(By.id(BUTTON_NUM1)).click();
		driver.findElement(By.id(BUTTON_NUM1)).click();
		driver.findElement(By.id(BUTTON_NUM1)).click();
	}	
	
	public void Back_To_Home_Screen() {
		boolean cond = false ; 
		/*
		driver.navigate().back();
		try {
			for (int i = 0; i < 1000; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.id(BUTTON_Back)).click();;				
			}
		} catch (Exception e) {
			// DO NOTHING
		}*/
		while (cond == false) {
			try {
				Thread.sleep(5000);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath(BUTTON_Home)).click();
				cond = true ; 
			} catch (Exception e) {
				driver.navigate().back();
			}
		}	
	}

	public static void Click_On_Point(int pointA_X, int pointA_Y) { 
		
	PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger"); 
	org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1); 
	clickPosition .addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), pointA_X,pointA_Y)) .addAction(finger.createPointerDown(MouseButton.LEFT.asArg())) .addAction(finger.createPointerUp(MouseButton.LEFT.asArg())); 
	driver.perform(Arrays.asList(clickPosition));	
	}




}
