package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruck[] userTrucks;
		FoodTruck bestTruck;
		String name = "";
		String foodType = "";
		double averageRating;
		boolean usingMenu = true;
		int rating = 0;
		int menuChoice;

		Scanner input = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		
		System.out.println("---- Welcome to the Food Truck App ----");
		System.out.println("Please enter up to five food trucks.");
		System.out.println("If you are done entering trucks, please enter 'quit' for the next name.\n");

		userTrucks = foodTruckApp.collectUserFoodTrucks(input, name, foodType, rating);
		userTrucks = foodTruckApp.trimArray(userTrucks);

		while (usingMenu) {

			menuChoice = foodTruckApp.menuChoice(input);
			usingMenu = foodTruckApp.chooseAgain(menuChoice);

			if (menuChoice == 1) {
				foodTruckApp.printToString(userTrucks);
				System.out.println();
			}

			else if (menuChoice == 2) {
				averageRating = foodTruckApp.getAverageRating(userTrucks);
				System.out.println("The average rating of these food trucks is " + averageRating);
				System.out.println();
			} 
			
			else if (menuChoice == 3) {
				bestTruck = foodTruckApp.findHighestRatedTruck(userTrucks);

				System.out.println("The highest rated food truck is " + bestTruck.getName() + ": ");
				System.out.println(bestTruck.toString());
				System.out.println();
			}

		}

	}

	public FoodTruck[] collectUserFoodTrucks(Scanner input, String name, String foodType, int rating) {

		boolean enteringTrucks = true;
		int counter = 0;
		FoodTruck[] userTrucks = new FoodTruck[5];

		while (enteringTrucks) {

			System.out.print("What is the name of this food truck? ");
			name = input.nextLine();

			if (name.equalsIgnoreCase("quit")) {
				System.out.println();
				enteringTrucks = false;
			
			} else {

				// Set name field
				FoodTruck foodTruck = new FoodTruck();
				foodTruck.setName(name);
				System.out.println();

				// Set foodType field
				System.out.print("What type of deliciousness does this food truck sell? ");
				foodType = input.nextLine();
				foodTruck.setFoodType(foodType);
				System.out.println();

				// Set rating field
				System.out.print("What overall rating would you give this food truck? ");
				rating = input.nextInt();
				input.nextLine();
				foodTruck.setRating(rating);
				System.out.println();

				userTrucks[counter] = foodTruck;
				counter++;
			}

		}
		return userTrucks;
	}

	public FoodTruck[] trimArray(FoodTruck[] userTrucks) {
		FoodTruck[] trimmedArr = userTrucks;
		int counter = 0;

		for (int i = 0; i < userTrucks.length; i++) {
			if (userTrucks[i] != null) {
				counter++;
			}
		}

		trimmedArr = new FoodTruck[counter];
		counter = 0;

		for (int i = 0; i < trimmedArr.length; i++) {
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
		System.out.println();

		return choice;

	}

	public boolean chooseAgain(int menuChoice) {

		if (menuChoice == 4) {
			System.out.println("Thanks for using the Food Truck App! Goodbye.");
			return false;
		} else {
			return true;
		}

	}

	public void printToString(FoodTruck[] userTrucks) {
		System.out.println("Here are all the food trucks: ");

		for (int i = 0; i < userTrucks.length; i++) {
			System.out.println(userTrucks[i].toString());
		}

	}

	public double getAverageRating(FoodTruck[] userTrucks) {
		int ratingSum = 0;
		double averageRating = 0.0;

		for (int i = 0; i < userTrucks.length; i++) {
			ratingSum += userTrucks[i].getRating();
		}

		averageRating = ratingSum / userTrucks.length;

		return averageRating;
	}

	public FoodTruck findHighestRatedTruck(FoodTruck[] userTrucks) {
		FoodTruck highestRating = userTrucks[0];

		for (int i = 0; i < userTrucks.length; i++) {
			if (userTrucks[i].getRating() > highestRating.getRating()) {
				highestRating = userTrucks[i];
			}
		}

		return highestRating;
	}

}
