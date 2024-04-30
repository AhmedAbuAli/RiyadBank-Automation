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
import P03_Screens.InvestmentScreen;
import P03_Screens.LoginScreen;
import P03_Screens.MoneyTransferScreen;
import P03_Screens.PersonalFinanceManagementScreen;
import P03_Screens.TokenProgramScreen;
import P04_Utils.Data;

/*
 
 
================================================================


This suite is used for indivisual tasks 


================================================================

*/


public class Tasks extends Base {
	
	BillsGovermentPaymentScreen BillsGovermentPayment = new BillsGovermentPaymentScreen();
	AccountIdentifierManagementScreen AccountIM = new AccountIdentifierManagementScreen();
	PersonalFinanceManagementScreen PMF = new PersonalFinanceManagementScreen();
	AddNewBeneficaryScreen AddNewBenf = new AddNewBeneficaryScreen();
	MoneyTransferScreen MoneyTransfer  = new MoneyTransferScreen();
	AccountCardsScreen Account = new AccountCardsScreen();
	InvestmentScreen Investment = new InvestmentScreen();
	TokenProgramScreen Token = new TokenProgramScreen();
	ApplyOnlineScreen Apply = new ApplyOnlineScreen();
	CommenMethods Methods  = new CommenMethods() ; 
	ChatBotScreen ChatBot = new ChatBotScreen();
	LoginScreen Login =  new LoginScreen();
	Base Base = new Base();
	Data Data = new Data();
	/*
	@Test 
	(priority = 1)
	public void START_AND_LOGIN() throws IOException, InterruptedException   {

		Login.Login("Login" , 3);
	}

	@Test 
	(priority = 2)
	public void ACCOUNTS_AND_CARDS_CHECK_ACCOUNT_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Account_Details("Check account details", 4);

	}

	@Test 
	(priority = 3)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_EDIT_POS_LIMIT() throws IOException, InterruptedException   {

		Account.Edit_POS_Limit("Edit POS limit", 5);
	
	}

	@Test 
	(priority = 4)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_DEACTIVE_ACTIVE_CONTACTLESS() throws IOException, InterruptedException   {

		Account.Deactive_Active_Contactless("Deactive or active contactless", 6);
	
	}

	@Test 
	(priority = 5)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_DEACTIVE_ACTIVE_ONLINE_PURCHASING() throws IOException, InterruptedException   {

		Account.Deactive_Active_Online_Purchasing("Deactive or active online purchasing", 7);

	}

	@Test 
	(priority = 6)
	public void ACCOUNTS_AND_CARDS_DEBIT_CARD_SHOW_CARD_PIN() throws IOException, InterruptedException   {

		Account.Show_Card_Pin("Show card pin", 8);

	}
	
	@Test 
	(priority = 7)
    public void ACCOUNTS_AND_CARDS_CREDIT_CARD_CHECK_CARD_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Credit_Card_Details("Check credit card details", 9);

	}

	@Test 
	(priority = 8)	
	public void ACCOUNTS_AND_CARDS_CREDIT_CARD_LOAD_CARD() throws IOException, InterruptedException   {

		Account.Load_Credit_Card("Load or Pay credit card", 10);

	}
	
	@Test 
	(priority = 9)
	public void ACCOUNTS_AND_CARDS_CREDIT_CARD_TRANSFER_CARD() throws IOException, InterruptedException   {

		Account.Transfer_Credit_Card("Transfer from credit card", 11);

	}

	@Test 
	(priority = 10)
	public void ACCOUNTS_AND_CARDS_MULTI_CURRENCY_CHECK_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Multi_Currency_Details("Check multi currency card details", 12);

	}

	@Test 
	(priority = 11)
	public void ACCOUNTS_AND_CARDS_MULTI_CURRENCY_LOAN_MONEY() throws IOException, InterruptedException   {

		Account.Loan_Money("Loan money to multi currency card", 13);

	}

	@Test 
	(priority = 12)
	public void ACCOUNTS_AND_CARDS_WAZEN_ACCOUNT_PASUSE_RESUME() throws IOException, InterruptedException   {

		Account.Wazen_Accounts_Pause_Resume("Pause or resume wazin account", 14);

	}
	*/
	@Test 
	(priority = 13)
	public void ACCOUNTS_AND_CARDS_NET_WORTH_STATMENET_CHECK_CHARTS() throws IOException, InterruptedException   {

		Account.Chcek_Net_Worth_Statment("Check net worth statment chasrts", 15);
		
	}


}
