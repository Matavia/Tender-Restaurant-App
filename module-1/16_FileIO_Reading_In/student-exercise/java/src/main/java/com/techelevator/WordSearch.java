package com.techelevator;

import java.io.File;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class WordSearch {
	
	// Will ask the user for a search string and a filesystem 
	// path for a text file
	// it searches for the occurrences of the search string 
	// and displays the line number and contents of the line
	// it was found in on the console
	// Line numbers begin with 1
	
	

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// Make sure the input is a string
		
		// Ask for the path name
		System.out.print("What is the file that should be searched? ");
		String providedPath = userInput.nextLine();
		File f = new File(providedPath);
		

		
		//Checks if the file exists
		
		if(f.exists()) {
			System.out.println("\nFile Name: " + f.getName());
			System.out.println("Absolute Path: " + f.getAbsolutePath());
			
			//checks if it is a directory
			if(f.isDirectory()) {
				System.out.println("Type: Directory");
			} else if (f.isFile()) {
				System.out.println("Type: File");
			}	
		} else {
			System.out.println("That file does not exist");
		}
		
		
		System.out.println();
		
		// make sure the file exists
		//make sure the file isn't a directory
		
		// Ask for a string to search for
				System.out.print("What is the search word you are looking for? ");
				String searchWord = userInput.nextLine();
				try(Scanner dataInput = new Scanner(providedPath)) {
				int lineNum = 1;
					
					while(dataInput.hasNext()) {
						
						String line = dataInput.nextLine();
						if (line.contains(searchWord)) {
							System.out.println( ") " + line );
							lineNum++;
							
						}
					}
				}
		
			

				
	}

}
