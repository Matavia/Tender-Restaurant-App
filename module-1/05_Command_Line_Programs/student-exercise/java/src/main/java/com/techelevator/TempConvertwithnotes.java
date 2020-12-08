package com.techelevator;
import java.util.Scanner;


public class TempConvert {

	
	// I need to initiate the scanner operation
	// A welcome message
	//Input the temperature
	//Accept the input
	// Convert the input
	//Make the output
	// I need an array for both the input and the conversion information
	//
	public static void main(String[] args) {
		
		//initiates the scanner function to allow for input
	Scanner scanner = new Scanner(System.in);
	
	// Displays welcome message
	System.out.println("Welcome to the Temperature Converter \n");
	
	// Prompts to enter a temperature
	System.out.println("Enter a temperature: ");
	
	//Reads the input string from the command line
	//(note nextLine() only works with Strings
	String tempString = scanner.nextLine();
	
	// Convert the input string into a double
	double numTemp = Double.parseDouble(tempString);
	
	// Temperature Conversions
	double CFTempConversion = numTemp * 1.8 + 32;
	double FCTempConversion = (numTemp - 32) / 1.8;
	
	// Text on screen to Specify the type of temp
	System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit? ");
	
	//Prompt for user input
	String  tempType = scanner.nextLine();
	
	
	//Algorithm to decide which conversion to do
	
	if(tempType.toUpperCase().contains("F")){
		System.out.println((int)numTemp + "F" + " is " + (int)FCTempConversion + "C");
	}
		else if( tempType.toUpperCase().contains("C")) {
			System.out.println((int)numTemp + "C" + " is " + (int)FCTempConversion + "F");
		}

			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		

	}


