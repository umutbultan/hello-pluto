package creational.builder;

public class BuilderPatternDeom {

	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVeg = mb.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVeg.showItems();
		System.out.println("Total Cost: " + nonVeg.getCost());
	}

}
