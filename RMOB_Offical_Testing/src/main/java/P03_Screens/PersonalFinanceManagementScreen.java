package P03_Screens;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import P01_Base.Base;
import P04_Utils.Data;

public class PersonalFinanceManagementScreen extends Base{

	// PERSONAL FINANCE MANAGEMENT SCREEN VARIABLES
	String BUTTON_PFM = "//android.widget.Button[@text[contains(.,'Personal Finance Management')]]";
	String BUTTON_Expenses = "//android.widget.Button[@text ='EXPENSES']";
	String BUTTON_Incomes = "//android.widget.Button[@text ='INCOMES']";
	String BUTTON_Activity = "//android.widget.Button[@text ='ACTIVITY']";
	String BUTTON_ViewMore = "//android.widget.TextView[@text[contains(.,'View more')]]";

	
	// GENERAL VARIABLES
	CommenMethods Methods = new CommenMethods();
	Base Base = new Base();	
	Data Data = new Data();
	
	
	public void Open_PFM() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(BUTTON_PFM)).click();

	}
	// ============================================================================

	
	public void PFM_Check_Activity(String RportName , int RowNumeber) throws IOException, InterruptedException {
		
		try {

			Open_PFM();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Expenses)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Incomes)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath(BUTTON_Activity)).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath( BUTTON_ViewMore)).click();
			
			Methods.ChcekResult(RportName, RowNumeber);

		} catch (Exception e) {

			Data.Set_Methode_Status( RowNumeber , RportName , " FAIL " );
			Methods.Back_To_Home_Screen();

		}

	}
	// ============================================================================

	
}
