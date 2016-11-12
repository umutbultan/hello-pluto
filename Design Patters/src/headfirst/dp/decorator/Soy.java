package headfirst.dp.decorator;

public class Soy extends CondimentDecorator {

	
	public Soy(Beverage bev) {
		this.beverage = bev;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", soy";
	}

	@Override
	public double cost() {
		double val;
		if(beverage.getSize().equals(BeverageSizes.TALL)){
			val = 0.15;
		} else if(beverage.getSize().equals(BeverageSizes.GRANDE)){
			val = 0.20;
		} else {
			val = 0.25;
		}
		
		return val+beverage.cost();
	}

}
