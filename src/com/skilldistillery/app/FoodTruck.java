package com.skilldistillery.app;

public class FoodTruck {

	private static int nextTruckId;
	private int truckId;
	private String name;
	private String foodType;
	private int rating;

	public FoodTruck() {
		this.name = null;
		this.foodType = null;
		this.rating = 0;
		this.truckId = nextTruckId;
		nextTruckId++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
