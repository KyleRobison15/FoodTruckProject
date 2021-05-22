package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		String name;
		String foodType;
		int rating;
		FoodTruck[] userTrucks;

		System.out.println("Please enter up to five food trucks.");
		System.out.println("If you are done entering trucks, please enter 'quit' for the next name.");

		// TODO store the returned array of food trucks in a variable of type FoodTruck
		// []
//		userTrucks = collectUserFoodTrucks();

		// TODO create menu method that displays menu options (user story #2)

	}

	public FoodTruck[] collectUserFoodTrucks(Scanner input, String name, String foodType, int rating) {
		// This method will create new instances of FoodTruck objects
		// It will then assign the FoodTruck's instance fields by taking in user input
		// for each field
		// It will then store each FoodTruck in a FoodTruck array
		// It will then return an array of these FoodTruck objects

		// TODO Add loop here to run the array collector until user enters name of
		// 'quit'
		// TODO Make sure the array has the same number of indexes as the number of
		// trucks they enter
		boolean enteringTrucks = true;
		int index = 0;
		FoodTruck[] userTrucks = new FoodTruck[index];

		// Instantiate a new FoodTruck object (and set unique ID automatically)

		// Create FoodTruck object and set name field if not 'quit'. If 'quit' then do
		// not create new FoodTruck.
		while (enteringTrucks) {
			
			System.out.print("What is the name of this food truck?");
			name = input.nextLine();

		if (name.equalsIgnoreCase("quit")) {
			enteringTrucks = false;
			// Call menu options method
		} else {

			FoodTruck foodTruck = new FoodTruck();
			foodTruck.setName(name);
			System.out.println();

			// Set foodType field
			System.out.print("What type of deliciousness does this food truck sell?");
			foodType = input.nextLine();
			foodTruck.setFoodType(foodType);
			System.out.println();

			// Set rating field
			System.out.print("What overall rating (out of 10) would you give this food truck?");
			rating = input.nextInt();
			foodTruck.setRating(rating);
			System.out.println();
			
			userTrucks[index] = foodTruck;
			
			index++;

		}

	}
		return userTrucks;
	}

//	public boolean keepEnteringTrucks(String name) {
//		
//		String keepEntering = name;
//		if (keepEntering.equalsIgnoreCase("quit")) {
//			return false;
//		}
//		else {
//			return true;
//		}
//		
//	}

}
