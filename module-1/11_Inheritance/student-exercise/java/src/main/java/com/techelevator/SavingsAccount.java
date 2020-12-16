package com.techelevator;

public class SavingsAccount extends BankAccount {
	
// CONSTRUCTOR # 1

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountHolderName);
	}
// CONSTRUCTOR # 2
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountHolderName, balance);

	}

// WITHDRAW METHOD OVERRIDE
	
	@Override
	public int withdraw(int amountToWithdraw) {

		if (getBalance() > amountToWithdraw) {
			super.withdraw(amountToWithdraw);
			
			if (getBalance() < 150) {
				super.withdraw(2);
			}
		}
		return getBalance();
	}
}