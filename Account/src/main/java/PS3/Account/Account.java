package PS3.Account;

import java.util.Date;
 
public class Account {
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated; 
		
		public Account() {
			this(0,0);
		}
		
		
		public Account(int id, double balance) {
			this.id=id;
			this.balance=balance;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public double getBalance() {
			return balance; 
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		
		public void setAnuualInterestRate() {
			this.annualInterestRate = annualInterestRate;
		}
		
		public Date dateCreated() {
			Date dateCreated = new Date();
			return dateCreated;
		}
		
		public double getMonthlyInterestRate() {
			return annualInterestRate/12;
		}
		
		
		
		public double withdraw(double depositAmount) throws Exception {
			balance = this.getBalance();
			if (depositAmount < balance) {
				this.setBalance(balance - depositAmount);
				return this.getBalance();
			}
			else {
				throw new Exception();
			}
		}
		
		public void deposit(double depositAmount) {
			this.balance = (balance + depositAmount);
		}


		public void setAnnualInterestRate(double d) {
			// TODO Auto-generated method stub
			
		}

	}

