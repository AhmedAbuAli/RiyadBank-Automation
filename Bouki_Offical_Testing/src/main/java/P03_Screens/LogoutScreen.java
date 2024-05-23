package P03_Screens;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;
import io.appium.java_client.AppiumBy;

public class LogoutScreen extends Base{
	
	String BUTTON_Profile = "com.emcrey.riyadbank.cert:id/menuProfile" ;
	String BUUTON_Logout = "com.emcrey.riyadbank.cert:id/textView_logout";
	String VIEW_PasswordTitle = "com.emcrey.riyadbank.cert:id/textView_subtitle";
	String BUTTON_Back = "com.emcrey.riyadbank.cert:id/imageView_back";
	String uiSelector = "new UiSelector().textMatches(\"" +"Logout"+ "\")";
	String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+ uiSelector + ");";
	String VIEW_LogoutTitle = "//android.widget.TextView[@text=\"Logout from Bouki?\"]";
	String BUTTON_Logout= "com.emcrey.riyadbank.cert:id/button_primary";
	Base Base = new Base();	
	String Mehtod_Name = "Logout";

	public void Logout() throws InterruptedException, IOException {
		// driver.navigate().back();
		try {
			for (int i = 0; i < 1000; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.id(BUTTON_Back)).click();;				
			}
		} catch (Exception e) {
			// DO NOTHING
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_Profile)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "LOGOUT TEST START");

		
		driver.findElement(AppiumBy.androidUIAutomator(command)).click();
		Base.Take_SscreenShot(Mehtod_Name , "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id(BUTTON_Logout)).click();;
		Base.Take_SscreenShot(Mehtod_Name , "LOGOUT TEST IS PASSED");

	}
}
