package com.techelevator;

public class CheckingAccount extends BankAccount {


// CONSTRUCTOR # 1
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountNumber, accountNumber);
	}
// CONSTRUCTOR # 2
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountNumber, accountNumber, balance);
	}

// WITHDRAW OVERRIDE METHOD
	public int withdraw(int amountToWithdraw) {

		if (getBalance() - amountToWithdraw > -100) {
			super.withdraw(amountToWithdraw);

			if (getBalance() < 0) {
				super.withdraw(10);
			}
		}

		return getBalance();

	}

}
