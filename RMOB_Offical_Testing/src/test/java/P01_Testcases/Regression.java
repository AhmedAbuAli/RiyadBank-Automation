package P01_Testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import P01_Base.Base;
import P03_Screens.AccountCardsScreen;
import P03_Screens.AccountIdentifierManagementScreen;
import P03_Screens.AddNewBeneficaryScreen;
import P03_Screens.ApplyOnlineScreen;
import P03_Screens.BillsGovermentPaymentScreen;
import P03_Screens.ChatBotScreen;
import P03_Screens.CommenMethods;
import P03_Screens.HassadProgramScreen;
import P03_Screens.InvestmentScreen;
import P03_Screens.LoginScreen;
import P03_Screens.LogoutScreen;
import P03_Screens.MoneyTransferScreen;
import P03_Screens.PersonalFinanceManagementScreen;
import P03_Screens.TokenProgramScreen;
import P04_Utils.Data;

/*
 
 
================================================================


This suite is used for regression test that includes  
all the automated services that are applicable for testing 


================================================================


*/

public class Regression extends Base {
	
	BillsGovermentPaymentScreen BillsGovermentPayment = new BillsGovermentPaymentScreen();
	AccountIdentifierManagementScreen AccountIM = new AccountIdentifierManagementScreen();
	PersonalFinanceManagementScreen PMF = new PersonalFinanceManagementScreen();
	AddNewBeneficaryScreen AddNewBenf = new AddNewBeneficaryScreen();
	MoneyTransferScreen MoneyTransfer  = new MoneyTransferScreen();
	HassadProgramScreen Hassad = new HassadProgramScreen();
	AccountCardsScreen Account = new AccountCardsScreen();
	InvestmentScreen Investments = new InvestmentScreen();
	TokenProgramScreen Token = new TokenProgramScreen();
	ApplyOnlineScreen Apply = new ApplyOnlineScreen();
	CommenMethods Methods  = new CommenMethods() ; 
	ChatBotScreen ChatBot = new ChatBotScreen();
	LogoutScreen Logout = new LogoutScreen();
	LoginScreen Login =  new LoginScreen();
	Base Base = new Base();
	Data Data = new Data();
	
	// REPORT ROW NUMBER START FROM 3 
    // ROW NUMBER  = PRIORITY + 2
	
	
	@Test 
	(priority = 1)
	public void LOGIN() throws IOException, InterruptedException   {

		Login.Login("Login" , 3);
		
	}

	@Test  
	(priority = 2)
	public void CHECK_ACCOUNT_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Account_Details("Check account details", 4);

	}

	@Test 
	(priority = 3)
	public void DEBIT_CARD_EDIT_POS_LIMIT() throws IOException, InterruptedException   {

		Account.Edit_POS_Limit("Edit POS limit", 5);
	
	}

	@Test 
	(priority = 4)
	public void DEBIT_CARD_DEACTIVE_ACTIVE_CONTACTLESS() throws IOException, InterruptedException   {

		Account.Deactive_Active_Contactless("Deactive or active contactless", 6);
	
	}

	@Test 
	(priority = 5)
	public void DEBIT_CARD_DEACTIVE_ACTIVE_ONLINE_PURCHASING() throws IOException, InterruptedException   {

		Account.Deactive_Active_Online_Purchasing("Deactive or active online purchasing", 7);

	}

	@Test 
	(priority = 6)
	public void DEBIT_CARD_SHOW_CARD_PIN() throws IOException, InterruptedException   {

		Account.Show_Card_Pin("Show card pin", 8);

	}
	
	@Test 
	(priority = 7)
    public void CREDIT_CARD_CHECK_CARD_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Credit_Card_Details("Check credit card details", 9);

	}

	@Test 
	(priority = 8)	
	public void CREDIT_CARD_LOAD_CARD() throws IOException, InterruptedException   {

		Account.Load_Credit_Card("Load or Pay credit card", 10);

	}
	
	@Test 
	(priority = 9)
	public void CREDIT_CARD_TRANSFER_CARD() throws IOException, InterruptedException   {

		Account.Transfer_Credit_Card("Transfer from credit card", 11);

	}

	@Test 
	(priority = 10)
	public void MULTI_CURRENCY_CHECK_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Multi_Currency_Details("Check multi currency card details", 12);

	}

	@Test 
	(priority = 11)
	public void MULTI_CURRENCY_LOAN_MONEY() throws IOException, InterruptedException   {

		Account.Loan_Money("Loan money to multi currency card", 13);

	}

	@Test 
	(priority = 12)
	public void WAZEN_ACCOUNT_PASUSE_RESUME() throws IOException, InterruptedException   {

		Account.Wazen_Accounts_Pause_Resume("Pause or resume wazin account", 14);

	}

	@Test 
	(priority = 13)
	public void NET_WORTH_STATMENET_CHECK_CHARTS() throws IOException, InterruptedException   {

		Account.Chcek_Net_Worth_Statment("Check net worth statment chasrts", 15);
		
	}

	@Test 
	(priority = 14)
	public void WAZEN_ACCOUNT_CHECK_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Wazen_Accounts_Details("Check wazin account details ", 16);

	}

	@Test 
	(priority = 15)
	public void BTWEEN_ACCOUNTS_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.Between_My_Accounts("Between my account transfer", 17);
		
	}

	@Test 
	(priority = 16)
	public void WITHIN_RIYAD_BANK_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.Within_Riyad_Bank("Within riyad bank trnasfer", 18);

	}

	@Test 
	(priority = 17)
	public void LOCAL_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.Local_Transfer("Local transfer", 19);

	}

	@Test 
	(priority = 18)
	public void INTERNATIONAL_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.International_Transfer("International transfer", 20);

	}

	@Test 
	(priority = 19)
	public void WU_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.WU_Transfer("WU transfer", 21);

	}

	@Test 
	(priority = 20)
	public void MONEY_EXPRESS_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.Money_Express("Money express transfer", 22);

	}

	@Test 
	(priority = 21)
	public void CHARITY_DONATION_TRANSFER() throws IOException, InterruptedException   {
		
		MoneyTransfer.Charity_Donation("Charity donation transfer", 23);
	
	}

	@Test 
	(priority = 22)
	public void ZAKATY_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.Zakaty("Zakaty transfer", 24);
	
	}

	@Test 
	(priority = 23)
	public void REQUEST_TO_PAY() throws IOException, InterruptedException   {
		
		MoneyTransfer.Request_To_Pay("request to pay transfer", 25);

	}

	@Test 
	(priority = 24)
	public void LINK_MY_ACCOUNT() throws IOException, InterruptedException   {

		AccountIM.link_My_Account("Link my account", 26);

	}

	@Test 
	(priority = 25)
	public void UNLINK_MY_ACCOUNT() throws IOException, InterruptedException   {

		AccountIM.UnLink_My_Account("Unlink my account", 27);

	}

	@Test 
	(priority = 26)
	public void OPEN_CURRENT_ACCOUNT() throws IOException, InterruptedException   {

		Apply.Open_Account("Open current account", 28);

	}

	@Test 
	(priority = 27)
	public void OPEN_SAVING_ACCOUNT_WITHOUT_INCOME() throws IOException, InterruptedException   {

		Apply.Open_Account("Open saving account without income", 29);

	}

	@Test 
	(priority = 28)
	public void OPEN_SAVING_ACCOUNT_WITh_INCOME() throws IOException, InterruptedException   {

		Apply.Open_Account("Open saving account with income", 30);

	}

	@Test 
	(priority = 29)
	public void APPLY_FOR_CREDIT_CARD() throws IOException, InterruptedException   {

		Apply.Create_Credit_Card("Apply for a credit card", 31);
	
	}

	@Test 
	(priority = 30)
	public void APPLY_FOR_TOKEN () throws IOException, InterruptedException   {

		Data.Set_Methode_Status(32 , "Apply for a token" , "SKIP");
		Base.Skip_Method();	

	}
	
	@Test 
	(priority = 31)
	public void APPLY_FOR_VIRTUAL_CARD() throws IOException, InterruptedException   {	

		Data.Set_Methode_Status(33 , "Apply for a virtual card" , "SKIP");
		Base.Skip_Method();	

	}

	@Test 
	(priority = 32)
	public void APPLY_FOR_PREPAID_CARD() throws IOException, InterruptedException   {
		
		Apply.Creat_Prepaid_Card("Apply for a pre-paid", 33);
	
	}

	@Test 
	(priority = 33)
	public void APPLY_FOR_SALARY_CARD() throws IOException, InterruptedException   {

		Data.Set_Methode_Status(35 , "Apply for a salary card" , "SKIP");
		Base.Skip_Method();	

	}

	@Test 
	(priority = 34)
	public void APPLY_FOR_MULTI_CURRENCY_CARD() throws IOException, InterruptedException   {
	
		Apply.Creat_Multi_Currency_Card("Apply for a multi currency card", 36);
	
	}

	@Test 
	(priority = 35)
	public void APPLY_FOR_WAZEN() throws IOException, InterruptedException   {

		Apply.Creat_Wazen("Apply for wazen", 37);

	}

	@Test 
	(priority = 36)
	public void ADD_RIYAD_BANK_BENFICIARY() throws IOException, InterruptedException   {
		
		AddNewBenf.Riyad_Bank_Benf("Add riyad bank beneficiary", 38);
	
	}

	@Test 
	(priority = 37)
	public void ADD_LOCAL_BENFICIARY() throws IOException, InterruptedException   {
	
		AddNewBenf.Local_Bank_Benf("Add local beneficiary", 39);
	
	}

	@Test 
	(priority = 38)
	public void ADD_INTERNATIONAL_BENFICIARY() throws IOException, InterruptedException   {

		AddNewBenf.International_Bank_Benf("Add international beneficiary", 40);

	}

	@Test 
	(priority = 39)
	
	public void ADD_MONEY_EXPRESS_BENFICIARY() throws IOException, InterruptedException   {

		AddNewBenf.Money_Express_Benf("Add money express beneficiary", 41);
	
	}

	@Test 
	(priority = 40)
	public void CREDIT_CARD_STOP_CARD() throws IOException, InterruptedException   {

		Account.Stop_Card("Stop credit card", 42);
	
	}

	@Test 
	(priority = 41)
	public void DEBIT_CARD_STOP_CARD() throws IOException, InterruptedException   {
		
		Account.Stop_Temporary("Stop credit card", 43);
	
	}

	@Test 
	(priority = 42)
	public void PERSONAL_FINANCE_MANAGEMENT_CHECK_ACTIVITY() throws IOException, InterruptedException   {
		
		PMF.PFM_Check_Activity("Check personal finance mangement details", 44);

	}
	
	@Test 
	(priority = 43)
	public void INSURANCE_CHECK_MOTOR_INSURANCE_DETAILS() throws IOException, InterruptedException   {
		
		Apply.Insurance_Motor_Details("Check motor insurance details",45 );
	
	}

	@Test
	(priority = 44)
	public void IPO() throws IOException, InterruptedException {

		Investments.IPO("IPO", 46);
	
	}

	@Test
	(priority = 45)
	public void TIME_DEPOSIT() throws IOException, InterruptedException {

		Investments.Time_Deposit("Time deposit", 47);

	}

	@Test
	(priority = 46)
	public void HASSAD_PROGRAM_TRANSFER() throws IOException, InterruptedException {
	
		Hassad.Hassad_Transfer("Transfer hassad points", 48); //  NOT COMPLETED YET 
	
	}

	@Test
	(priority = 47)
	public void ADD_BILL() throws IOException, InterruptedException {

		BillsGovermentPayment.Add_New_Bill("Add a bill", 49);
	
	}
	
	@Test
	(priority = 48)
	public void PAY_BILL() throws IOException, InterruptedException {
		BillsGovermentPayment.Pay_Bill("Pay a bill", 50);
	}

	@Test 
	(priority = 49)
	public void APPLY_FOR_PERSONAL_LOAN() throws IOException, InterruptedException   {
		
		Apply.Apply_Personal_Loan("Apply for personal loan ",51 );

	}

	@Test 
	(priority = 50)
	public void REFINANCE() throws IOException, InterruptedException   {

		Account.Refinance("Refinance", 52);
	
	}

	@Test
	(priority = 51)
	public void LOGOUT() throws IOException, InterruptedException {

		Logout.Logout("Logout", 53);

	}
	

}
	


