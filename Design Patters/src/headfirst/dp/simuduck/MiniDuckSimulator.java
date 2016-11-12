package headfirst.dp.simuduck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.swim();
		duck.display();
		
		System.out.println("");
		duck.flyBehavior = new FlyNoWay();
		duck.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
	}

}
