package FoodProject;

public class FoodObjects {
	
	private String type; 
	private double weight;
	private double cost;
	private double servingSize;
	private int caloriesPerServing;
	
	public void display() {
		
	System.out.println(type);
	System.out.println(weight);
	System.out.println(cost);
	System.out.println(servingSize);
	System.out.println(caloriesPerServing); 
	intcal();
	System.out.println(); 
	System.out.println(); 
		
	}
	
	public void intcal() {
		double cps = cost / servingSize;
	}

	
	//getters and setters
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getServingSize() {
		return servingSize;
	}

	public void setServingSize(double servingSize) {
		this.servingSize = servingSize;
	}

	public int getCaloriesPerServing() {
		return caloriesPerServing;
	}

	public void setCaloriesPerServing(int caloriesPerServing) {
		this.caloriesPerServing = caloriesPerServing;
	}
	

}
