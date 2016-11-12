package headfirst.dp.simpleFactory;

public class TryPizzaStore {

	public static void main(String[] args) {
		
		PizzaStore ps = new ChigagoPizzaStore();
		
		ps.orderPizza(Pizza.CHEESE);
		
		ps = new NyPizzaStore();
		ps.orderPizza(Pizza.PEPPERONI);

	}

}
