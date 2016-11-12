package headfirst.dp.decorator;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	
	@Override
	public abstract String getDescription();

	@Override
	public String getSize(){
		return beverage.getSize();
	}
	
}
