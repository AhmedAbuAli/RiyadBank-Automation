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


}
