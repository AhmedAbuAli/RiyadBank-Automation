package P01_Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	protected FileInputStream InputStream ;
	protected DesiredCapabilities caps ;
	public static AndroidDriver driver ;
	public static ExtentReports Extent ;
	public static ExtentTest Logger ; 
	protected Properties Prop ;
	protected File PropFile ;
	protected File App ;
	int c = 0 ;
	
	
	// TO SEND THE REQUIRED CAPABILITY TO THE SERVER THEN START THE APPLICATION
	@BeforeClass 
	@Parameters ({"deviceName" , "platformName" , "platformVersion"})
	public void BeforeClass	(
			@Optional("AhmedM") String deviceName , 
			@Optional("Android") String platformName , 
			@Optional("13") String platformVersion  ) throws IOException, InterruptedException {

		PropFile = new File("C:\\Users\\DELL\\eclipse-workspace\\Bouki_Offical_Testing\\src\\main\\resources\\Config\\Config.properties");
		InputStream = new FileInputStream(PropFile);
		Prop = new Properties();
		Prop.load(InputStream);
		App = new File(Prop.getProperty("AndroidPath"));
	    caps = new DesiredCapabilities();
	    
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Prop.getProperty("APP_PACKAGE"));
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Prop.getProperty("APP_ACTIVITY"));
		caps.setCapability("noSign", true);
		caps.setCapability("noReset", true);
		caps.setCapability("systemPort", 8200);
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("skipUnlock", true);
		caps.setCapability("clearDeviceLogsOnStart", true);
		caps.setCapability("skipServerInstallation", false);
		caps.setCapability("clearSystemFiles", false);
		caps.setCapability("ignoreHiddenApiPolicyError", true);
		caps.setCapability("automationName", "UiAutomator2");

	    driver  = new AndroidDriver(new URL(Prop.getProperty("AppiumServer")),caps);  

	    }
	
	
	// TO ADD THE MAIN INFO ABOUT THE TEST TO THE REPORT
	@BeforeSuite
	public void BeforeSuite() {
		
		Extent = new ExtentReports("Reports/Report.html");
		Extent.addSystemInfo("Framework Type" , "Appium");
		Extent.addSystemInfo("Author" , "Ahmad Abu-ALI");
		Extent.addSystemInfo("Enviroment" , "Android");
		Extent.addSystemInfo("Application" , "Bouki");
	}
	
	
	// GET THE NAME BEFORE EACH METHOD YOU TEST 
	@BeforeMethod (alwaysRun = true)
	public void BeforeMethod (Method method) throws InterruptedException {
		
		Logger = Extent.startTest(method.getName());
	}
	
	
	// TO BE ABLE TO TAKE A SCREENSHOT FROM ANYWHERE AND ANY SCREEN AT ANT TIME 
	public void Take_SscreenShot(String method  , String Status ) throws IOException, InterruptedException {
		
		// EXTENSTION OF THE SCREENSHOT
		File Image = driver.getScreenshotAs(OutputType.FILE);
		// NAME OF THE SCREENSHOT
		FileUtils.copyFile(Image, new File ("Snapshots/"+method+Integer.toString(c)+".jpg"));
		// PATH OF THE SCREENSHOT 
		String ImagePath = System.getProperty("user.dir") + File.separator +"Snapshots/"+method+Integer.toString(c)+".jpg"; 
		// TO ADD THE SCREENSHOT TO THE REPORT 
		Logger.log(LogStatus.PASS, Status, Logger.addScreenCapture(ImagePath));
		c++ ;
	}

	
	// TO BE ABLE TO TAKE A SCREENSHOT FROM ANYWHERE AND ANY SCREEN AT ANT TIME ( FAIL )
	public void Take_SscreenShot_Fail(String method , String FailReason ) throws IOException, InterruptedException {
		
		// EXTENSTION OF THE SCREENSHOT
		File Image = driver.getScreenshotAs(OutputType.FILE);
		// NAME OF THE SCREENSHOT
		FileUtils.copyFile(Image, new File ("Snapshots/"+method+Integer.toString(c)+".jpg"));
		// PATH OF THE SCREENSHOT 
		String ImagePath = System.getProperty("user.dir") + File.separator +"Snapshots/"+method+Integer.toString(c)+".jpg"; 
		// TO ADD THE SCREENSHOT TO THE REPORT 
		Logger.log(LogStatus.FAIL, FailReason,Logger.addScreenCapture(ImagePath));

		c++ ;
	}
	
	
	// TO END THE TEST AND CLEAR THE REPORT 
	@AfterSuite 
	public void AfterSuite() throws InterruptedException {
		Thread.sleep(2000);
		Extent.flush();
	}
	
	
}
