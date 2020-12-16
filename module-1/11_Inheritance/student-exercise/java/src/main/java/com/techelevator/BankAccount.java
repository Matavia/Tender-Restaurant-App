package com.techelevator;


public class BankAccount {

	//instance variables
	
	private String accountHolderName;
	private String accountNumber;
	private int balance;

	//GETTERS & SETTERS
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	//CONSTRUCTORS
	
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = 0;

	}

	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	// METHODS
	
	public int deposit(int amountToDeposit) {
		balance += amountToDeposit;
		return balance;
	}

	public int withdraw(int amountToWithdraw) {

		balance -= amountToWithdraw;
		return balance;
	}

}
