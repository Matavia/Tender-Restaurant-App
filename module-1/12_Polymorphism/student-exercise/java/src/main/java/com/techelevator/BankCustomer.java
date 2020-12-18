package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BankCustomer implements Accountable{
	
	private String name;
	private String address;
	private String phoneNumber;
	List<Accountable> accounts;
	
		public BankCustomer (String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		accounts = new ArrayList<Accountable>();
		
	}
	
	public BankCustomer() {
		accounts = new ArrayList<Accountable>();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Accountable[] getAccounts() {
		return accounts.toArray(new Accountable[accounts.size()]);
	}

	public int getBalance() {
		return getBalance();
	}
	
	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
		

	}
	
	public boolean isVip() {
		int totalBalance = 0;
		
		for(Accountable accountBalance : accounts) {
			totalBalance += accountBalance.getBalance();
		}
		
		boolean isVip = totalBalance >= 25000;

		return isVip;
			
		}
	}


