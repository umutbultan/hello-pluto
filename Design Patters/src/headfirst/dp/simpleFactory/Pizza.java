package headfirst.dp.simpleFactory;

public abstract class Pizza {
	
	public static final String CHEESE = "Cheese";
	public static final String VEGGIE = "Veggie";
	public static final String CLAM   = "Clam";
	public static final String PEPPERONI = "Pepperoni";
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Baking our pizza.");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza.");
	}
	
	public void box(){
		System.out.println("Boxing the pizza.");
	}
	
}
