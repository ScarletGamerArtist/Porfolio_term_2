package FoodProject;

import FoodProject.FoodObjects;

/*
 * Alanna Botscharow
 * 12/18
 */
public class FoodItems {
	public static void main(String[] args) {
		
		
		FoodObjects salmon = new FoodObjects(); 
		FoodObjects chocolateMilk = new FoodObjects(); 
		FoodObjects peanutButter = new FoodObjects(); 
		FoodObjects coffee = new FoodObjects(); 
		FoodObjects pizza = new FoodObjects(); 
		FoodObjects sushi = new FoodObjects(); 
		
		salmon.setType("Seafood"); 
		salmon.setWeight(5); //ounces
		salmon.setServingSize(0.5); // half of a fillet
		salmon.setCaloriesPerServing(198); //grams
		salmon.setCost(14.00); //dollars
		
		chocolateMilk.setType("Dairy");
		chocolateMilk.setWeight(4.8); //pounds
		chocolateMilk.setServingSize(1); // cup
		chocolateMilk.setCaloriesPerServing(250); //grams
		chocolateMilk.setCost(2.98); //dollars
	 
		peanutButter.setType("Proteins");
		peanutButter.setWeight(16); //ounces
		peanutButter.setServingSize(2); //tbsp
		peanutButter.setCaloriesPerServing(32); //grams
		peanutButter.setCost(2.37); //dollars
		
		coffee.setType("Drink");
		coffee.setWeight(60); //kilograms
		coffee.setServingSize(1); //cup
		coffee.setCaloriesPerServing(237); //grams
		coffee.setCost(8.64); //dollars
		
		pizza.setType("Other");
		pizza.setWeight(45); //kilograms
		pizza.setServingSize(1); //slice
		pizza.setCaloriesPerServing(107); //grams
		pizza.setCost(10.00); //dollars
		
		sushi.setType("Seafood");
		sushi.setWeight(5); //ounces
		sushi.setServingSize(6); //pieces
		sushi.setCaloriesPerServing(116); //grams
		sushi.setCost(12.00); //dollars
		
		
		
		
		
		salmon.display();
		chocolateMilk.display(); 
		peanutButter.display(); 
		coffee.display(); 
		pizza.display(); 
		sushi.display(); 
		
	}
}
