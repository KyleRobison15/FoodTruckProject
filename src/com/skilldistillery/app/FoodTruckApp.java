package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String foodType;
		int rating;
		FoodTruck[] userTrucks;

		System.out.println("Please enter up to five food trucks.");
		System.out.println("If you are done entering trucks, please enter 'quit' for the next name.");
		
		//TODO store the returned array of food trucks in a variable of type FoodTruck []
//		userTrucks = collectUserFoodTrucks();
		
		//TODO create menu method that displays menu options (user story #2)

	}

	public FoodTruck[] collectUserFoodTrucks(Scanner input, String name, String foodType, int rating) {
		//This method will create new instances of FoodTruck objects 
		//It will then assign the FoodTruck's instance fields by taking in user input for each field
		//It will then store each FoodTruck in a FoodTruck array
		//It will then return an array of these FoodTruck objects 
		 
			//TODO Add loop here to run the array collector until user enters name of 'quit'
			//TODO Make sure the array has the same number of indexes as the number of trucks they enter
			
		
			FoodTruck [] userTrucks = new FoodTruck[0]; //initialized this array with 0 indexes 
														//so that the loop below can determine number of indexes 
														//of array to be returned.
		
			//Instantiate a new FoodTruck object (and set unique ID automatically)
			FoodTruck foodTruck = new FoodTruck();
			
			//Set name field
			System.out.print("What is the name of this food truck?");
			name = input.nextLine();
			foodTruck.setName(name);
			System.out.println();
			
			//Set foodType field
			System.out.print("What type of deliciousness does this food truck sell?");
			foodType = input.nextLine();
			foodTruck.setFoodType(foodType);
			System.out.println();
			
			//Set rating field
			System.out.print("What overall rating (out of 10) would you give this food truck?");
			rating = input.nextInt();
			foodTruck.setRating(rating);
			System.out.println();
		
		return userTrucks;
	}

}
