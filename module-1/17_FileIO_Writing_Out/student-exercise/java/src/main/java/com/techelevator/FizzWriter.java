package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		File fizzWriter = new File("FizzBuzz.txt");

		try (PrintWriter fizzBuzzWriter = new PrintWriter(fizzWriter)) {

			for (int i = 1; i <= 300; i++) {

				boolean multipleOfThree = i % 3 == 0;
				boolean multipleOfFive = i % 5 == 0;

				if (multipleOfThree && multipleOfFive) {
					fizzBuzzWriter.println("FizzBuzz");
				} else if (multipleOfThree) {
					fizzBuzzWriter.println("Fizz");
				} else if (multipleOfFive) {
					fizzBuzzWriter.println("Buzz");
				} else {
					fizzBuzzWriter.println(i);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.print("Couldn't find the file!");
			System.exit(1);
			e.printStackTrace();
		}
		System.out.println(" \n FizzBuzz.txt has been created. \n");
	}

}