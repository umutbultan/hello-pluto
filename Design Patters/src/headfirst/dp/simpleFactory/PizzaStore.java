package headfirst.dp.simpleFactory;

public abstract class PizzaStore {
	
	public final Pizza orderPizza( String type){
		
		Pizza p = createPizza(type);
		p.prepare();
		p.bake();
		p.cut();
		p.box();
		return p;
		
	}
	
	public abstract Pizza createPizza(String type);
}
