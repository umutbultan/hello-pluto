package headfirst.dp.simuduck;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
	}
	
	public void performFly(){
		this.flyBehavior.fly();
	}
	public void performQuack(){
		this.quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("Duck is swimming");
	}
	
	public void display(){
		System.out.println("Look its a duck!");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	
}
