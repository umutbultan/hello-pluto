package headfirst.dp.simpleFactory;

public class SimplePizzaFactory {
	
	
	public static Pizza createPizza(String type){
		Pizza pizza=null;
		
		if(type.equals(Pizza.CHEESE)){
			pizza = new CheesePizza();
		} else if(type.equals(Pizza.CLAM)){
			pizza = new ClamPizza();
		} else if(type.equals(Pizza.PEPPERONI)){
			pizza = new Pepporoni();
		} else if(type.equals(Pizza.VEGGIE)){
			pizza = new VeggiePizza();
		} 
		
		return pizza;
		
	}
}
