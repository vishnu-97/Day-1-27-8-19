package com.genesis;

public class BankAccounts {
	private long ano;
	private int balance;
	static int totDeposit,totWithdrawal;
	private String name,atype;
	
	public BankAccounts(long ano, String name, String atype,int balance) {
		super();
		this.balance = balance;
		this.ano = ano;
		this.name = name;
		this.atype = atype;
	}
	public BankAccounts() {
		super();
		name=atype="";
		
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public static int getTotDeposit() {
		return totDeposit;
	}
	public static int getTotWithdrawal() {
		return totWithdrawal;
	}
	
	public void initialize(int balance, long ano, String name, String atype) {
		this.balance = balance;
		this.ano = ano;
		this.name = name;
		this.atype = atype;
	}
	@Override
	public String toString() {
		return "Account no=" + ano + "\nBalance=" + balance + "\nName=" + name + "\nAccount Type=" + atype ;
	}
	
	
	public void showAccDetails() {
		System.out.println(this);
	}
	
	public boolean withdraw(int w) {
		if(balance-w<0) {
			return false;
		}
		balance-=w;
		totWithdrawal+=w;
		return true;
	}
	
	public void deposit(int d) {
		balance+=d;
		totDeposit+=d;

	}
	
	public static void showTotalDeposits() {
		System.out.println("Total Deposits= "+totDeposit);
		
	}
	public static void showTotalWithdraws() {
		System.out.println("Total Withdrawn= "+totWithdrawal);
	}
	
	public static int getAvgBalance(BankAccounts...ac) {
		int sum = 0;
		for(BankAccounts a:ac) {
			sum+=a.getBalance();
		}
		return sum/ac.length;
	}
	
	
}
