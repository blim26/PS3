package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PS3.Account.Account;
import PS3.Account.InsufficientFundsException;

import java.io.*;

public class AccountTest {

	public static Account obj;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new Account(1122,20000);
		obj.withdraw(2500);
		obj.deposit(3000);
		obj.setAnnualInterestRate(4.5);
		System.out.println("The balance is: $" + obj.getBalance());
		System.out.println("THe monthly interest rate is: " + obj.getMonthlyInterestRate());
		System.out.println("The date the account was created is: " + obj.getDateCreated());
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		assertEquals(1122, obj.getId(), 0);
		assertEquals(20500, obj.getBalance(),0);
		assertEquals(4.5, obj.getAnnualInterestRate(),0);
	}
	
	private void assertEquals(double d, double annualInterestRate, int i) {
		// TODO Auto-generated method stub
		
	}

	@Test(expected = InsufficientFundsException.class)
	public void testInsufficientFunds() throws InsufficientFundsException {
		Account a = new Account(111112,20);
		a.deposit(200);
		a.withdraw(4000);
	}
	