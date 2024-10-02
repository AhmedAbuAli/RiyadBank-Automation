package P03_Screens;

import java.io.IOException;
import java.time.Duration;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import P01_Base.Base;
import P04_Utils.Data;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

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
    KeyEvent keyEvent0 = new KeyEvent(AndroidKey.DIGIT_0);
    KeyEvent keyEvent1 = new KeyEvent(AndroidKey.DIGIT_1);
    KeyEvent keyEvent2 = new KeyEvent(AndroidKey.DIGIT_2);
    KeyEvent keyEvent3 = new KeyEvent(AndroidKey.DIGIT_3);
    KeyEvent keyEvent4 = new KeyEvent(AndroidKey.DIGIT_4);
    KeyEvent keyEvent5 = new KeyEvent(AndroidKey.DIGIT_5);
    KeyEvent keyEvent6 = new KeyEvent(AndroidKey.DIGIT_6);
    KeyEvent keyEvent7 = new KeyEvent(AndroidKey.DIGIT_7);
    KeyEvent keyEvent8 = new KeyEvent(AndroidKey.DIGIT_8);
    KeyEvent keyEvent9 = new KeyEvent(AndroidKey.DIGIT_9);

	
	// GENERAL VARIABLES
	String BUTTON_Arabic = "//android.widget.Button[@text = 'عربي']";
	String VIEW_RedDot = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View";
	String BUTTON_Continue2 = "//android.widget.Button[@text[contains(.,'Continue')]]";
	String INPUT_OTP2 = "//android.widget.EditText";
	String OTP_Message = "//android.widget.TextView[@text[contains(.,'كلمة مرور')]]";
	String BUTTON_HomePage = "//android.widget.Button[@text[contains(.,'Homepage')]]";
	String BUTTON_Copy = "//android.widget.TextView[@text ='Copy']";
	String BUTTONPhoneNumbekLink = "//android.widget.Button[@text = 'I confirm my number is linked to NID/Iqama']";
	String BUTTON_Cancel = "//android.widget.Button[@text = 'Cancel']";
	String BUTTON_No = "//android.widget.Button[@text = 'No']";

	String VIEW_LOGO = "//android.widget.Image[@text = 'logo']";
	String BUTTON_PrimaryMobile = "//android.widget.Button[@text = \"Primary Mobile arrow round-forward\"]"; 
	String BUTTON_Back = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
	String BUTTON_SideBar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]";
	String BUTTON_SideBar2 = "//android.widget.Button[@text='']";
	String BUTTON_Continue = "//android.widget.Button[@text = \"Continue arrow round-forward\"]";
	String BUTTON_OK = "//android.widget.Button[@text = \"OK\"]";
	String INPUT_OTP = "//android.widget.EditText[@index = 0]";
	String MW_Alert = "alert-subhdr-0"; // ID;
	String VIEW_Hello = "//android.widget.TextView[@text[contains(.,'Hello')]]";
	Random random = new Random();
	Base Base = new Base();
	Data Data = new Data();
	Boolean Cond = true ; 
	String Back2 = "//android.widget.Button[@text ='']" ;
	
	public String Choose_List(String[] options, String dialogTitle, String additionalText) {
		// Create a JPanel with a JComboBox (select list) and a JLabel containing the options and additional text
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
		JLabel textLabel = new JLabel(additionalText);
		panel.add(textLabel);
	
		JComboBox<String> comboBox = new JComboBox<>(options);
		panel.add(comboBox);
	
		// Show the input dialog with the select list and additional text
		@SuppressWarnings("unused")
		int result = JOptionPane.showConfirmDialog(
			null,
			panel,
			dialogTitle,
			JOptionPane.OK_CANCEL_OPTION,
			JOptionPane.PLAIN_MESSAGE
		);
	
		String selectedOption = (String) comboBox.getSelectedItem();
	
		return selectedOption;
	}
	
	public void Back_To_Home_Screen() throws IOException, InterruptedException {

		if (CheckElement(VIEW_Hello)) {
			
			if (CheckElement(BUTTON_OK)) {
				MW_PopUps();
			}
			
		} else if  (CheckElement(BUTTON_HomePage)){
			
			driver.findElement(By.xpath(BUTTON_HomePage)).click();

		} else if (CheckElement(Back2)) {

			driver.findElement(By.xpath(Back2)).click();

		}else if (CheckElement(BUTTON_Cancel)){

			driver.findElement(By.xpath(BUTTON_Cancel)).click();	

		}else {

			driver.navigate().back();

			if (CheckElement(BUTTON_OK)) {
				MW_PopUps();
			}

			Back_To_Home_Screen();

		}
	}
	
	public void action_clickOnPosition(int pointA_X, int pointA_Y) { 
		
	PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger"); 
	org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1); 
	clickPosition .addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), pointA_X,pointA_Y)) .addAction(finger.createPointerDown(MouseButton.LEFT.asArg())) .addAction(finger.createPointerUp(MouseButton.LEFT.asArg())); 
	driver.perform(Arrays.asList(clickPosition));	
	}

	public void Open_Side_Bar() throws IOException, InterruptedException {
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_SideBar2)).click();
		} catch (Exception e) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_SideBar)).click();		}

	}

	public void MW_PopUps () throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_OK)).click();
		
	}

 	public void OTP() throws IOException, InterruptedException {
 		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		for (int i = 0; i < 4; i++) {
			action_clickOnPosition(405 , 2252);
		}
		driver.findElement(By.xpath(BUTTON_Continue)).click();
	}

	public void Get_OTP() throws InterruptedException, IOException {

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath(BUTTON_PrimaryMobile)).click();
		} catch (Exception e) {
			// DO NOTHING 
		}
	
		String OTP = JOptionPane.showInputDialog(null, "Please enter OTP and press OK or Cancel");
	
		if (OTP != null) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(INPUT_OTP2)).click();
	
			String[] Digits = OTP.split("");
	
			for (String digit : Digits) {
				if (digit.equals("0")) {
					driver.pressKey(keyEvent0);
				} else if (digit.equals("1")) {
					driver.pressKey(keyEvent1);
				} else if (digit.equals("2")) {
					driver.pressKey(keyEvent2);
				} else if (digit.equals("3")) {
					driver.pressKey(keyEvent3);
				} else if (digit.equals("4")) {
					driver.pressKey(keyEvent4);
				} else if (digit.equals("5")) {
					driver.pressKey(keyEvent5);
				} else if (digit.equals("6")) {
					driver.pressKey(keyEvent6);
				} else if (digit.equals("7")) {
					driver.pressKey(keyEvent7);
				} else if (digit.equals("8")) {
					driver.pressKey(keyEvent8);
				} else if (digit.equals("9")) {
					driver.pressKey(keyEvent9);
				}
			}
		} else {

			Back_To_Home_Screen();

		}
	
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath(BUTTON_Continue)).click();
		} catch (Exception e) {
			// DO NOTHING
		}
	}

	public int Generate_Random_App_Passcode () {
		 // Create an instance of the Random class

       // Generate a random 6-digit number
       int min = 100000; // Minimum 6-digit number (inclusive)
       int max = 999999; // Maximum 6-digit number (inclusive)
       int randomNumber = random.nextInt(max - min + 1) + min;
       return randomNumber ;
	}

	public int Generate_Random_Card_Pin () {
        // Create an instance of the Random class

        // Generate a random 4-digit number
        int min = 1000; // Minimum 4-digit number (inclusive)
        int max = 9999; // Maximum 4-digit number (inclusive)
        int randomNumber = random.nextInt(max - min + 1) + min;
		return randomNumber;
	}

	public void Phone_Number_Popup() {
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath(BUTTONPhoneNumbekLink)).isDisplayed();
			action_clickOnPosition(1025, 855);
		} catch (Exception e) {
			// DO NOTHING
		}
	}

	public void Check_Alerts() {
			
			try {
				MW_PopUps();
			} catch (Exception e) {
				// DO NOTHING 
			}
		}
	
	public static int getIndex(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Element found, return the index
            }
        }
        return -1; // Element not found in the array
    }
	
	public void Swipe_Down() {
		Dimension size  = driver.manage().window().getSize();
		 int startX = size.getWidth() / 2;
		    int startY = size.getHeight() / 2;
		    int endX = startX;
		    int endY = (int) (size.getHeight() * 0.25);
		    PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		    Sequence sequence = new Sequence(finger1, 1)
		        .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
		        .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		        .addAction(new Pause(finger1, Duration.ofMillis(200)))
		        .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
		        .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		    driver.perform(Collections.singletonList(sequence));
	}
	
	public boolean CheckElement( String Element ){

		try {
			return driver.findElement(By.xpath(Element)).isDisplayed();
		} catch (Exception e) {
			return false ;
		}
	}

	public void ChcekResult(String RportName , int RowNumeber) throws IOException, InterruptedException{


			if (CheckElement(BUTTON_HomePage)) {
				
				Base.Take_SscreenShot(RportName ,  RportName + "");
				Data.Set_Methode_Status( RowNumeber , RportName , "PASS" );

			} else {

				MW_PopUps();
				Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			}
			
			Back_To_Home_Screen();

		} 
	
	}


	