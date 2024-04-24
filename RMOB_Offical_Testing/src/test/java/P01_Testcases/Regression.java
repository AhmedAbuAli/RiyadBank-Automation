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
	public void START_AND_LOGIN() throws IOException, InterruptedException   {
		String Method_Name = "LOGIN";
		Login.Login(Method_Name , 3);
	}

	@Test 
	(priority = 2)
	public void ACCOUNTS_AND_CARDS_CHECK_ACCOUNT_DETAILS() throws IOException, InterruptedException   {
		Account.Check_Account_Details("ACCOUNTS AND CARDS - CHECK ACCOUNT DETAILS", 4);
	}
	
	@Test 
	(priority = 3)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_EDIT_POS_LIMIT() throws IOException, InterruptedException   {
		Account.Edit_POS_Limit("ACCOUNTS AND CARDS - DEBIT CARD - EDIT POS LIMIT", 5);
	}

	@Test 
	(priority = 4)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_DEACTIVE_ACTIVE_CONTACTLESS() throws IOException, InterruptedException   {
		Account.Deactive_Active_Contactless("ACCOUNTS AND CARDS - DEBIT CARD - DEACTIVE & ACTIVE CONTACTLESS", 6);
	}
	
	@Test 
	(priority = 5)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_DEACTIVE_ACTIVE_ONLINE_PURCHASING() throws IOException, InterruptedException   {
		Account.Deactive_Active_Online_Purchasing("ACCOUNTS AND CARDS - DEBIT CARD - DEACTIVE & ACTIVE ONLINE PURCHASING", 7);
	}

	@Test 
	(priority = 6)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_SHOW_CARD_PIN() throws IOException, InterruptedException   {
		Account.Show_Card_Pin("ACCOUNTS AND CARDS - DEBIT CARD SHOW CARD PIN", 8);
	}
	
    @Test 
	(priority = 7)
    public void ACCOUNTS_AND_CARDS_CREDIT_CARD_CHECK_CARD_DETAILS() throws IOException, InterruptedException   {
		Account.Check_Credit_Card_Details("ACCOUNTS AND CARDS - CREDIT CARD - CHECK CARD DETAILS", 9);
	}

	@Test 
	(priority = 8)	
	public void ACCOUNTS_AND_CARDS_CREDIT_CARD_LOAD_CARD() throws IOException, InterruptedException   {
		Account.Load_Credit_Card("ACCOUNTS AND CARDS - CREDIT CARD - LOAD CARD", 10);
	}
	
	@Test 
	(priority = 9)
	public void ACCOUNTS_AND_CARDS_CREDIT_CARD_TRANSFER_CARD() throws IOException, InterruptedException   {
		Account.Transfer_Credit_Card("ACCOUNTS AND CARDS - CREDIT CARD - TRANSFER CARD", 11);
	}
	
	@Test 
	(priority = 10)
	public void ACCOUNTS_AND_CARDS_MULTI_CURRENCY_CHECK_DETAILS() throws IOException, InterruptedException   {
		Account.Check_Multi_Currency_Details("ACCOUNTS AND CARDS - MULTI CURRENCY -  CHECK DETAILS", 12);
	}
	

	@Test 
	(priority = 11)
	public void ACCOUNTS_AND_CARDS_MULTI_CURRENCY_LOAN_MONEY() throws IOException, InterruptedException   {
		Account.Loan_Money("ACCOUNTS AND CARDS - MULTI CURRENCY -  LOAN MONEY", 13);
	}
	
	@Test 
	(priority = 12)
	public void ACCOUNTS_AND_CARDS_WAZEN_ACCOUNT_PASUSE_RESUME() throws IOException, InterruptedException   {
		Account.Wazen_Accounts_Pause_Resume("ACCOUNTS AND CARDS - WAZEN ACCOUNTS -  PUASE & RESUME ACCOUNT", 14);
	}
	
	@Test 
	(priority = 13)
	public void ACCOUNTS_AND_CARDS_NET_WORTH_STATMENET_CHECK_CHARTS() throws IOException, InterruptedException   {
		Account.Chcek_Net_Worth_Statment("ACCOUNTS AND CARDS - NET WORTH STATMENT -  CHECK CHARTS", 15);
	}
	
	@Test 
	(priority = 14)
	public void ACCOUNTS_AND_CARDS_WAZEN_ACCOUNT_CHECK_DETAILS() throws IOException, InterruptedException   {
		Account.Check_Wazen_Accounts_Details("ACCOUNTS AND CARDS - WAZEN ACCOUNTS -  CHECK DETAILS ", 16);
	}

	@Test 
	(priority = 17)
	public void MONEY_TRANSFER_BTWEEN_ACCOUNTS() throws IOException, InterruptedException   {
		MoneyTransfer.Between_My_Accounts("MONEY TRANSFER - BETWEEN MY ACCOUNTS", 19);
	}

	@Test 
	(priority = 18)
	public void MONEY_TRANSFER_WITHIN_RIYAD_BANK() throws IOException, InterruptedException   {
		MoneyTransfer.Within_Riyad_Bank("MONEY TRANSFER - WITHIN RIYAD BANK", 20);
	}

	@Test 
	(priority = 19)
	public void MONEY_TRANSFER_LOCAL_TRANSFER() throws IOException, InterruptedException   {
		MoneyTransfer.Local_Transfer("MONEY TRANSFER - LOCAL TRANSFER", 21);
	}

	@Test 
	(priority = 20)
	public void MONEY_TRANSFER_INTERNATIONAL_TRANSFER() throws IOException, InterruptedException   {
		MoneyTransfer.International_Transfer("MONEY TRANSFER - INTERNATIONAL TRANSFER", 22);
	}
	
	@Test 
	(priority = 21)
	public void MONEY_TRANSFER_WU_TRANSFER() throws IOException, InterruptedException   {
		MoneyTransfer.WU_Transfer("MONEY TRANSFER - WU TRANSFER", 23);
	}
	
	@Test 
	(priority = 22)
	public void MONEY_TRANSFER_MONEY_EXPRESS() throws IOException, InterruptedException   {
		MoneyTransfer.Money_Express("MONEY TRANSFER - MONEY EXPRESS", 24);
	}

	@Test 
	(priority = 23)
	public void MONEY_TRANSFER_WITHIN_CHARITY_DONATION() throws IOException, InterruptedException   {
		MoneyTransfer.Charity_Donation("MONEY TRANSFER - CHARITY DONATION", 25);
	}
	
	@Test 
	(priority = 24)
	public void MONEY_TRANSFER_ZAKATY() throws IOException, InterruptedException   {
		MoneyTransfer.Zakaty("MONEY TRANSFER - ZAKATY", 26);
	}
	
	@Test 
	(priority = 25)
	public void MONEY_TRANSFER_REQUEST_TO_PAY() throws IOException, InterruptedException   {
		MoneyTransfer.Request_To_Pay("MONEY TRANSFER - REQUEST TO PAY", 27);
	}

	@Test 
	(priority = 26)
	public void ACCOUNT_IDENTIFIER_MANGAMENET_SERVICE_LINK_MY_ACCOUNT() throws IOException, InterruptedException   {
		AccountIM.link_My_Account("ACCOUNT IDENTIFIER MANGAMENET SERVICE - LINK MY ACCOUNT ", 28);
	}
	
	@Test 
	(priority = 27)
	public void ACCOUNT_IDENTIFIER_MANGAMENET_SERVICE_UNLINK_MY_ACCOUNT() throws IOException, InterruptedException   {
		AccountIM.UnLink_My_Account("ACCOUNT IDENTIFIER MANGAMENET SERVICE - UNLINK MY ACCOUNT ", 29);
	}
		
	@Test 
	(priority = 28)
	public void APPLY_ONLINE_OPEN_CURRENT_ACCOUNT() throws IOException, InterruptedException   {
		Apply.Open_Account("APPLY ONLINE - OPEN CURRECNT ACCOUNT", 30);
	}
		
	@Test 
	(priority = 29)
	public void APPLY_ONLINE_OPEN_SAVING_ACCOUNT_WITHOUT_INCOME() throws IOException, InterruptedException   {
		Apply.Open_Account("APPLY ONLINE - OPEN SAVING ACCOUNT WITHOUT INCOME", 31);
	}
	
	@Test 
	(priority = 30)
    public void APPLY_ONLINE_OPEN_SAVING_ACCOUNT_WITH_INCOME() throws IOException, InterruptedException   {
		Apply.Open_Account("APPLY ONLINE - OPEN SAVING ACCOUNT WITH INCOME", 32);
	}

	@Test 
	(priority = 31)
	public void APPLY_ONLINE_APPLY_FOR_CREDIT_CARD() throws IOException, InterruptedException   {
		Apply.Create_Credit_Card("APPLY ONLINE - APPLY FOR CREDIT CARD", 33);
	}
	
	@Test 
	(priority = 32)
	public void TOKEN_PROGRAM_APPLY_FOR_TOKEN () throws IOException, InterruptedException   {
		Data.Set_Methode_Status(34 , "TOKEN PROGRAM - APPLY FOR A TOKEN " , "NOT APPLICABLE");
		Base.Skip_Method();	
	}

	@Test 
	(priority = 33)
	public void APPLY_ONLINE_APPLY_FOR_VIRTUAL_CARD() throws IOException, InterruptedException   {	
		Data.Set_Methode_Status(35 , "APPLY ONLINE - APPLY FOR VIRTUAL CARD" , "NOT APPLICABLE");
		Base.Skip_Method();	
	}
	
	@Test 
	(priority = 34)
	public void APPLY_ONLINE_APPLY_FOR_PREPAID_CARD() throws IOException, InterruptedException   {
		Apply.Creat_Prepaid_Card("APPLY ONLINE - APPLY FOR PREPAID CARD", 36);
	}

	@Test 
	(priority = 35)
	public void APPLY_ONLINE_APPLY_FOR_SALARY_CARD() throws IOException, InterruptedException   {
		Data.Set_Methode_Status(37 , "APPLY ONLINE - APPLY FOR SALARY CARD" , "NOT APPLICABLE");
		Base.Skip_Method();	
	}
	
	@Test 
	(priority = 36)
	public void APPLY_ONLINE_APPLY_FOR_MULTI_CURRENCY_CARD() throws IOException, InterruptedException   {
		Apply.Creat_Multi_Currency_Card("APPLY ONLINE - APPLY FOR MULTI CURRENCY CARD", 38);
	}
	
	@Test 
	(priority = 37)
	public void APPLY_ONLINE_APPLY_FOR_WAZEN() throws IOException, InterruptedException   {
		Apply.Creat_Wazen("APPLY ONLINE - APPLY FOR WAZEN", 39);
	}
	
	@Test 
	(priority = 38)
	public void ADD_NEW_BENFICIARY_RIYAD_BANK_BENFICIARY() throws IOException, InterruptedException   {
		AddNewBenf.Riyad_Bank_Benf("ADD NEW BENFICIARY - RIYAD BANK BENFICIARY", 40);
	}
	
	@Test 
	(priority = 39)
	public void ADD_NEW_BENFICIARY_LOCAL_BENFICIARY() throws IOException, InterruptedException   {
		AddNewBenf.Local_Bank_Benf("ADD NEW BENFICIARY - LOCAL BANK BENFICIARY", 41);
	}

	@Test 
	(priority = 40)
	public void ADD_NEW_BENFICIARY_INTERNATIONAL_BENFICIARY() throws IOException, InterruptedException   {
		AddNewBenf.International_Bank_Benf("ADD NEW BENFICIARY - INTERNATIONAL BANK BENFICIARYY", 42);
	}
	
	@Test 
	(priority = 41)
	
	public void ADD_NEW_BENFICIARY_MONEY_EXPRESS_BENFICIARY() throws IOException, InterruptedException   {
		AddNewBenf.Money_Express_Benf("ADD NEW BENFICIARY -  MONEY EXPRESS BENFICIARY", 43);
	}
	
	@Test 
	(priority = 42)
	public void ACCOUNTS_AND_CARDS_CREDIT_CARD_STOP_CARD() throws IOException, InterruptedException   {
		Account.Stop_Card("ACCOUNTS AND CARDS - CREDIT CARD - STOP CARD", 44);
	}
	
	@Test 
	(priority = 43)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_STOP_CARD() throws IOException, InterruptedException   {
		Account.Stop_Temporary("ACCOUNTS AND CARDS - DEBIT CARD - STOP CARD", 45);
	}

	@Test 
	(priority = 44)
	public void PERSONAL_FINANCE_MANAGEMENT_CHECK_ACTIVITY() throws IOException, InterruptedException   {
		PMF.PFM_Check_Activity("PERSONAL FINANCE MANAGEMENT - CHECK ACTIVITY ", 45);
	}
	
	@Test 
	(priority = 46)
	public void INSURANCE_CHECK_MOTOR_INSURANCE_DETAILS() throws IOException, InterruptedException   {
		Apply.Insurance_Motor_Details("INSURANCE - CHECK MOTOR INSURANCE DETAILS", 48);
	}
	
	@Test
	(priority = 47)
	public void INVESTMENTS_IPO() throws IOException, InterruptedException {
		Investments.IPO("INVETMENTS - IPO", 49);
	}
	
	@Test
	(priority = 48)
	public void INVESTMENTS_TIME_DEPOSIT() throws IOException, InterruptedException {
		Investments.Time_Deposit("INVETMENTS - TIME DEPOSIT", 50);
	}
	
	@Test
	(priority = 49)
	public void HASSAD_PROGRAM_TRANSFER() throws IOException, InterruptedException {
		Hassad.Hassad_Transfer("HASSAD PROGRAM - TRANSFER", 51);
	}
	
	@Test
	(priority = 50)
	public void GOVERMENT_PAYMENT_ADD_BILL() throws IOException, InterruptedException {
		BillsGovermentPayment.Add_New_Bill("BILLS & GOVERMENT PAYMENT - ADD BILL", 52);
	}
	
	@Test
	(priority = 51)
	public void GOVERMENT_PAYMENT_PAY_BILL() throws IOException, InterruptedException {
		BillsGovermentPayment.Pay_Bill("BILLS & GOVERMENT PAYMENT - PAY BILL", 53);
	}
	
	@Test
	(priority = 55)
	public void LOGOUT() throws IOException, InterruptedException {
		Logout.Logout("LOGOUT", 57);
	}	
	

}
	


