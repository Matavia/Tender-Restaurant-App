package com.techelevator.services;

import com.techelevator.models.Hotel;
import com.techelevator.models.Recipe;
import com.techelevator.models.Review;

import java.util.Scanner;

import org.json.JSONArray;


public class ConsoleService {

    private Scanner scanner;

    public ConsoleService() {
        scanner = new Scanner(System.in);
    }
    public int printMainMenu() {
        int menuSelection;
        System.out.println("");
        System.out.println("Welcome to Tech Elevator Hotels. Please make a selection: ");
        System.out.println("1: List Hotels");
        System.out.println("2: List Reviews");
        System.out.println("3: Show Details for Hotel ID 1");
        System.out.println("4: List Reviews for Hotel ID 1");
        System.out.println("5: List Hotels with star rating 3");
        System.out.println("6: Public API Query");
        System.out.println("0: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
        // ensures no InputMisMatchException is thrown
        if (scanner.hasNextInt()) {
            menuSelection = scanner.nextInt();
            scanner.nextLine();
        } else {
            menuSelection = 999;
        }
        return menuSelection;
    }

    public void printRecipes(Recipe[] recipes) {
        System.out.println("--------------------------------------------");
        System.out.println("Name Of Recipes");
        System.out.println("--------------------------------------------");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getNameOfRecipe());
        }
    }

    public void printHotel(Hotel hotel) {
        System.out.println(hotel.toString());
    }

    public void printReviews(Review[] reviews) {
        for (Review review : reviews) {
            System.out.println(review.toString());
        }
    }

    public void next() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    public void exit() {
        scanner.close();
        System.exit(0);
    }

}
