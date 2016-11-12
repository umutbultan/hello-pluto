package headfirst.dp.simpleFactory;

public class ChigagoPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		
		if(type.equals(Pizza.CHEESE)){
			pizza = new ChigagoCheesePizza();
		} else if(type.equals(Pizza.CLAM)){
			pizza = new ChigagoClamPizza();
		} else if(type.equals(Pizza.PEPPERONI)){
			pizza = new ChigagoPepperoniPizza();
		} else if(type.equals(Pizza.VEGGIE)){
			pizza = new ChigagoVeggiePizza();
		} 
		
		return pizza;
	}

}
