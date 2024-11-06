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


This suite is used for indivisual tasks 


================================================================

*/

public class Tasks extends Base {
	
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

	/* 
	@Test 
	(priority = 1)
	public void LOGIN() throws IOException, InterruptedException   {

		Login.Login("Login" , 3);
		
	}

	@Test 
	(priority = 3)
	public void DEBIT_CARD_EDIT_POS_LIMIT() throws IOException, InterruptedException   {

		Account.Edit_POS_Limit("Edit POS limit", 5);
	
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
	(priority = 26)
	public void OPEN_CURRENT_ACCOUNT() throws IOException, InterruptedException   {

		Apply.Open_Account("Open current account", 28);

	}

	@Test 
	(priority = 29)
	public void APPLY_FOR_CREDIT_CARD() throws IOException, InterruptedException   {

		Apply.Create_Credit_Card("Apply for a credit card", 31);
			

	}


	@Test 
	(priority = 32)
	public void APPLY_FOR_PREPAID_CARD() throws IOException, InterruptedException   {
		
		Apply.Creat_Prepaid_Card("Apply for a pre-paid", 33);
	
	}


	@Test 
	(priority = 34)
	public void APPLY_FOR_MULTI_CURRENCY_CARD() throws IOException, InterruptedException   {
	
		Apply.Creat_Multi_Currency_Card("Apply for a multi currency card", 36);
	
	}

	*/
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
	(priority = 51)
	public void LOGOUT() throws IOException, InterruptedException {

		Logout.Logout("Logout", 53);

	}

}
