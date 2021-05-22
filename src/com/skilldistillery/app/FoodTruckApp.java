package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		String name = "";
		String foodType = "";
		int rating = 0;
		int menuChoice;
		boolean usingMenu = true;
		FoodTruck[] userTrucks;

		System.out.println("Please enter up to five food trucks.");
		System.out.println("If you are done entering trucks, please enter 'quit' for the next name.");

		userTrucks = foodTruckApp.collectUserFoodTrucks(input, name, foodType, rating);
		userTrucks = foodTruckApp.trimArray(userTrucks);
		
		while (usingMenu) {
			
			menuChoice = foodTruckApp.menuChoice(input);
			usingMenu = foodTruckApp.chooseAgain(menuChoice);
			
			if (menuChoice == 1) {
				for(int i = 0; i < userTrucks.length; i++) {
					System.out.println(userTrucks[i].toString());
				}
				System.out.println();
	
			}
			
			else if (menuChoice == 2) {
				//call method for getting average rating
				//will iterate through array 
				
			}
			else if (menuChoice == 3) {
				//call method for displaying highest rated food truck
				
			}
			
			
		}
		

		// TODO create menu method that displays menu options (user story #2)

	}

	public FoodTruck[] collectUserFoodTrucks(Scanner input, String name, String foodType, int rating) {
		// This method will create new instances of FoodTruck objects
		// It will then assign the FoodTruck's instance fields by taking in user input
		// It will then store each FoodTruck in a FoodTruck array
		// It will then return an array of these FoodTruck objects
		
		boolean enteringTrucks = true;
		int counter = 0;
		FoodTruck[] userTrucks = new FoodTruck[5];

		while (enteringTrucks) {
			
			System.out.println("What is the name of this food truck? ");
			name = input.nextLine();

		if (name.equalsIgnoreCase("quit")) {
			enteringTrucks = false;
			// Call menu options method (or method to make array correct length)
		} else {
			
			//Set name field
			FoodTruck foodTruck = new FoodTruck();
			foodTruck.setName(name);
			System.out.println();

			// Set foodType field
			System.out.println("What type of deliciousness does this food truck sell? ");
			foodType = input.nextLine();
			foodTruck.setFoodType(foodType);
			System.out.println();

			// Set rating field
			System.out.println("What overall rating (out of 10) would you give this food truck? ");
			rating = input.nextInt();
			input.nextLine();
			foodTruck.setRating(rating);
			
			userTrucks[counter] = foodTruck;
			counter++;
		}

	}
		return userTrucks;
	}
	
	public FoodTruck[] trimArray (FoodTruck[] userTrucks) {
		FoodTruck[] trimmedArr = userTrucks;
		int counter = 0;
		
		for(int i = 0; i < userTrucks.length; i++) {
			if (userTrucks[i] != null) {
				counter++;
			}
		}
		
		trimmedArr = new FoodTruck[counter];
		counter = 0;
		
		for(int i = 0; i < trimmedArr.length; i++) {
			trimmedArr[counter] = userTrucks[i];
			counter++;
		}
		
		return trimmedArr;
	}
	
	public int menuChoice(Scanner input) {
		int choice;
		
		System.out.println("What would you like to do? (Please enter a number)");
		System.out.println("1. List all existing food trucks");
		System.out.println("2. See the average rating of food trucks");
		System.out.println("3. Display the highest-rated food truck");
		System.out.println("4. Quit the program");
		
		choice = input.nextInt();
		
		return choice;
		
	}
	
	public boolean chooseAgain(int menuChoice) {
		
		if (menuChoice == 4) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	



}
