package com.techelevator;
import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 
 //Discover you weight on Mars
 //Input your weight
 //Accept the input
 //do the calculation
 //  
 */
public class MartianWeight2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Mars, find out your weight here");
		System.out.println("Enter a series of earth weights (space separated)");
		String weightOnEarth = scanner.nextLine();
		String[] weightAsIndividualStrings = weightOnEarth.split(" ");
		
		double[] earthWeights = new double[weightAsIndividualStrings.length];
		
		for(int i = 0; i < weightAsIndividualStrings.length; i++) {
			
			String stringToParse = weightAsIndividualStrings[i];
			
			double weight = Double.parseDouble(stringToParse); 
			
			weight = weight * 0.378;
			
			earthWeights[i] = weight;
		}
			
			System.out.println("Yay! We figured out your weight! Your weights are: ");
			
			for(int x = 0; x < earthWeights.length; x++){
				
				double weight = earthWeights[x];
				double  = earthWeights[x];
				System.out.print(weight + " mars pounds " + earthWeights);
			}
			System.out.println();
		}
		
		

	}

