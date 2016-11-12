package headfirst.dp.simpleFactory;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		
		if(type.equals(Pizza.CHEESE)){
			pizza = new NyStyleCheesePizza();
		} else if(type.equals(Pizza.CLAM)){
			pizza = new NyStyleClamPizza();
		} else if(type.equals(Pizza.PEPPERONI)){
			pizza = new NyStylePepperoniPizza();
		} else if(type.equals(Pizza.VEGGIE)){
			pizza = new NyStyleVeggiePizza();
		} 
		
		return pizza;
	}

}
