package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Linear Converter \n");

		System.out.println("Please enter the length: ");

		String lengthString = scanner.nextLine();

		double numLength = Double.parseDouble(lengthString);

		double meterToFeet = numLength * 3.2808399;
		double feetToMeter = numLength * 0.3048;

		System.out.println("Is the measurement in (m)eter, or (f)eet? ");

		String type = scanner.nextLine();

		if (type.toLowerCase().contains("m")) {
			System.out.println((int) numLength + "m" + " is " + (int) meterToFeet + "f");
		} else if (type.toLowerCase().contains("f")) {
			System.out.println((int) numLength + "f" + " is " + (int) feetToMeter + "m");
		}

	}

}
