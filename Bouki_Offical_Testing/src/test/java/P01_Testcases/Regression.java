package P01_Testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import P01_Base.Base;
import P03_Screens.AddMoneyScreen;
import P03_Screens.CommenMethods;
import P03_Screens.LoginScreen;
import P03_Screens.LogoutScreen;
import P03_Screens.ProfileScreen;
import P03_Screens.SendMoneyScreen;
import P03_Screens.SettingScreen;
import P03_Screens.WalletScreen;

public class Regression extends Base {
	
	SendMoneyScreen SendMoney = new SendMoneyScreen();
	AddMoneyScreen AddMoney = new AddMoneyScreen();
	SettingScreen Settings  = new SettingScreen(); 
	CommenMethods Methods  = new CommenMethods() ; 
	ProfileScreen Profile =  new ProfileScreen();
	WalletScreen Wallet = new WalletScreen();
	LogoutScreen Logout = new LogoutScreen(); 
	LoginScreen Login =  new LoginScreen();
	Base Base = new Base();
	/*

	@Test 
	(priority = 1)
	public void Open_And_Login_Test() throws IOException, InterruptedException   {
		Login.Login();
	}
		*/
	@Test 
	(priority = 2)
	public void Add_Money_Card_TopUp() throws IOException, InterruptedException   {
		AddMoney.Card_TopUp("ADD MONEY - CARD TOP-UP" , 4);
	}
	
	@Test 
	(priority = 3)
	public void Add_Money_Local_Or_International() throws IOException, InterruptedException   {
		AddMoney.Local_Or_International("ADD MONEY - LOCAL OR INTERNATIONAL BANK" , 5);
	}
	
	@Test 
	(priority = 4)
	public void Add_Money_Sadad_ID() throws IOException, InterruptedException   {
		AddMoney.Sadad_ID("ADD MONEY - SADAD ID" , 6);
	}
	
	@Test 
	(priority = 5)
	public void Send_Money_Bouki_Wallet() throws IOException, InterruptedException   {
		SendMoney.Bouki_Wallet("SEND MONEY - BOUKI WALLET" , 7);
	}
	
	@Test 
	(priority = 6)
	public void Send_Money_Riyad_Bank_Account() throws IOException, InterruptedException   {
		SendMoney.Riyad_Bank_Account("SEND MONEY - RIYAD BANK ACCOUNT" , 8);
	}
	
	@Test 
	(priority = 7)
	public void Send_Money_Other_Local_Banks() throws IOException, InterruptedException   {
		SendMoney.Other_Local_Banks("SEND MONEY - OTHER LOACL BANKS" , 9);
	}
	
	@Test 
	(priority = 8)
	public void Wallet_Show_Wallet_Details() throws IOException, InterruptedException   {
		Wallet.Show_Wallet_Details("WALLET - SHOW WALLET DETAILS" , 10);
	}
	@Test 
	(priority = 9)
	public void Wallet_Show_Card_Details() throws IOException, InterruptedException   {
		Wallet.Show_Card_Details("WALLET - SHOW CARD DETAILS" , 11);
	}
	@Test 
	(priority = 10)
	public void Wallet_Show_Card_Pin() throws IOException, InterruptedException   {
		Wallet.Show_Card_Pin("WALLET - SHOW CARD PIN" , 12);
	}
	@Test 
	(priority = 12)
	public void Manage_Beneficiaries_Bouki_Wallet_Beneficiaries() throws IOException, InterruptedException   {
		Profile.Bouki_Wallet_Beneficiaries("MANAGE BENEFICIARIES - ADD BOUKI WALLET BENFICIARIES" , 14);
	}
	@Test 
	(priority = 13)
	public void Manage_Beneficiaries_Riyad_Bank_Beneficiaries() throws IOException, InterruptedException   {
		Profile.Riyad_Bank_Beneficiaries("ADD RIYAD ACCOUNT BENFICIARIES" , 15);
	}
	
	@Test 
	(priority = 14)
	public void Manage_Beneficiaries_Local_Bank_Beneficiaries() throws IOException, InterruptedException   {
		Profile.Local_Bank_Beneficiaries("ADD LOCAL BANK BENFICIARIES" , 16);
	}
	@Test 
	(priority = 15)
	public void Manage_Beneficiaries_International_Transfer_Beneficiaries() throws IOException, InterruptedException   {
		Profile.International_Transfer_Beneficiaries("ADD INTERNATIONAL TRANSFER BENFICIARIES" , 17);
	}
	

}