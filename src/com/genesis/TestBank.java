package com.genesis;

public class TestBank {
	public static void main(String ar[]) {
		BankAccounts acc1=new BankAccounts(123123123123l,"Shivam","Saving",0);
		BankAccounts acc2=new BankAccounts();
		acc2.initialize(0, 465564664123l, "Vishnu", "Current");
		acc1.deposit(21312);
		acc2.deposit(123213);
		acc1.deposit(12321);
		if(acc2.withdraw(2131212)) {
			System.out.println("Withdrawal Success. Available balance="+acc2.getBalance());
		}
		else {
			System.out.println("Insufficient Balance. Available balance="+acc2.getBalance());
		}
		System.out.println();
		if(acc1.withdraw(21312)) {
			System.out.println("Withdrawal Success. Available balance="+acc2.getBalance());
		}
		else {
			System.out.println("Insufficient Balance. Available balance="+acc2.getBalance());
		}
		System.out.println();
		acc1.showAccDetails();
		System.out.println();
		acc2.showAccDetails();
		System.out.println();
		BankAccounts.showTotalDeposits();
		BankAccounts.showTotalWithdraws();
	}
}
