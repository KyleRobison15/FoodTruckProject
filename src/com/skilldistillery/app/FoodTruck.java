package com.skilldistillery.app;

public class FoodTruck {

	private static int nextTruckId = 1;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [truckId=").append(truckId).append(", name=").append(name).append(", foodType=")
				.append(foodType).append(", rating=").append(rating).append("]");
		return builder.toString();
	}

}
