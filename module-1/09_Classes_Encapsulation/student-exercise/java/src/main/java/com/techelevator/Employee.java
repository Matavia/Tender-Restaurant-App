package com.techelevator;

//class declaration
public class Employee {

	
	//constant variables
	
	
	// instance variables
	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;

	
	//getters/setters
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	

	
	//derivative getters 
	public String getFullName() {
		fullName = lastName + ", " + firstName;
		return fullName;
		
	}
	 
	
	//constructors
	public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}
	
	//methods
	public void raiseSalary(double percent ) {
		double annualSalaryRaise = annualSalary * (percent * .01) + annualSalary;
		annualSalary = annualSalaryRaise;
		
	}
}
