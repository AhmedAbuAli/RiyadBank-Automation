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

	@Test 
	(priority = 1)
	public void START_AND_LOGIN() throws IOException, InterruptedException   {

		Login.Login("Login" , 3);
	}
	/*
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

	@Test 
	(priority = 13)
	public void ACCOUNTS_AND_CARDS_NET_WORTH_STATMENET_CHECK_CHARTS() throws IOException, InterruptedException   {

		Account.Chcek_Net_Worth_Statment("Check net worth statment chasrts", 15);
		
	}

	@Test 
	(priority = 14)
	public void ACCOUNTS_AND_CARDS_WAZEN_ACCOUNT_CHECK_DETAILS() throws IOException, InterruptedException   {

		Account.Check_Wazen_Accounts_Details("Check wazin account details ", 16);

	}

	@Test 
	(priority = 15)
	public void MONEY_TRANSFER_BTWEEN_ACCOUNTS() throws IOException, InterruptedException   {
		MoneyTransfer.Between_My_Accounts("Between my account transfer", 17);
	}

	@Test 
	(priority = 16)
	public void MONEY_TRANSFER_WITHIN_RIYAD_BANK() throws IOException, InterruptedException   {

		MoneyTransfer.Within_Riyad_Bank("Within riyad bank trnasfer", 18);

	}

	@Test 
	(priority = 17)
	public void MONEY_TRANSFER_LOCAL_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.Local_Transfer("Local transfer", 19);

	}

	@Test 
	(priority = 18)
	public void MONEY_TRANSFER_INTERNATIONAL_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.International_Transfer("International transfer", 20);

	}

	@Test 
	(priority = 19)
	public void MONEY_TRANSFER_WU_TRANSFER() throws IOException, InterruptedException   {

		MoneyTransfer.WU_Transfer("WU transfer", 21);

	}

	@Test 
	(priority = 20)
	public void MONEY_TRANSFER_MONEY_EXPRESS() throws IOException, InterruptedException   {

		MoneyTransfer.Money_Express("Money express transfer", 22);

	}

	@Test 
	(priority = 21)
	public void MONEY_TRANSFER_WITHIN_CHARITY_DONATION() throws IOException, InterruptedException   {
		
		MoneyTransfer.Charity_Donation("Charity donation transfer", 23);
	
	}

	@Test 
	(priority = 22)
	public void MONEY_TRANSFER_ZAKATY() throws IOException, InterruptedException   {

		MoneyTransfer.Zakaty("Zakaty transfer", 24);
	
	}

	@Test 
	(priority = 23)
	public void MONEY_TRANSFER_REQUEST_TO_PAY() throws IOException, InterruptedException   {
		
		MoneyTransfer.Request_To_Pay("request to pay transfer", 25);

	}

	@Test 
	(priority = 24)
	public void ACCOUNT_IDENTIFIER_MANGAMENET_SERVICE_LINK_MY_ACCOUNT() throws IOException, InterruptedException   {

		AccountIM.link_My_Account("Link my account", 26);

	}

	@Test 
	(priority = 25)
	public void ACCOUNT_IDENTIFIER_MANGAMENET_SERVICE_UNLINK_MY_ACCOUNT() throws IOException, InterruptedException   {

		AccountIM.UnLink_My_Account("Unlink my account", 27);

	}
	*/
	@Test 
	(priority = 26)
	public void APPLY_ONLINE_OPEN_CURRENT_ACCOUNT() throws IOException, InterruptedException   {

		Apply.Open_Account("Open current account", 28);

	}





}
