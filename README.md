# Food Truck Project
### Overview of Program
This program allows a user to enter the name, food type, and rating of up to 5 food trucks.
The user can then choose from different menu options:
*Display all the food trucks
*View the average rating of the food trucks
*View the food truck with the highest rating

### Object Oriented Programming (OOP)
This program focuses on OOP by using a FoodTruck class that serves as the blueprint for creating new FoodTruck objects.
The FoodTruckApp allows the user to call different FoodTruck methods to construct new FoodTruck objects and set their instance fields (name, foodType, and rating).

*Data Abstraction:
In this program, I took a look at what a food truck is in the real world, and modeled a very simple version in my FoodTruck class.
My abstraction of a food truck included instance fields for its name, food type and rating as well as a static field for a unique ID.

*Data Encapsulation:
As part of the design process of the FoodTruck class, I made the visibilty of the instance fields private.
The user cannot directly change each FoodTruck object's fields. Instead they must do so by accessing its methods through the FoodTruckApp.

*Getters and Setters (Accessors and Mutators):
The FoodTruck class has several getters and setters for each of the fields.
The user can change the instance fields of the their FoodTruck objects using the setters.
The FoodTruckApp utilizes the getters and a toString method to display the different bits of information the user requests via the menu options.

### Other Technologies and Concepts Used
*Java: The entire program is written in java.

*Arrays: As the user creates new food trucks, each of those new objects is stored in an array.
In this program, the array can only hold up to 5 FoodTruck objects.
If the user enters less than 5 food trucks, there is a method that iterates through the array and finds any null index positions.
The method will then create a new array of the correct length (excluding any null positions).
Storing data and objects in arrays is immensely useful! And being able to iterate through them to pull out different bits of information is critical.

*Loops: There are 2 main loops used in the FoodTruckApp.
1. To continue allowing the user to create new food trucks until they enter the word 'quit'.
2. To choose different menu options that displays information about the food trucks until they quit the app.

### Potential Future Updates
*Error Handling: The app does what it's supposed to do, but only if the user enters everything correctly.
I could add some other methods with conditionals to display error messages if the user does something wrong (ie. enters more than 5 food trucks, or chooses an invalid menu option)

*Better modulization of the code using more methods.

*Creation of a separate class that prints messages.
There are a lot of user prompts and display messages that could all be handled by a separate class with methods for printing each thing.
