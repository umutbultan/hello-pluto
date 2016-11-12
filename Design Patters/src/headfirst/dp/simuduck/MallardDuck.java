package headfirst.dp.simuduck;

public class MallardDuck extends Duck {
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display(){
		System.out.println("Look its a mallard duck!");
	}
	
}
