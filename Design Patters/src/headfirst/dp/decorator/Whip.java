package headfirst.dp.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage bev) {
		this.beverage = bev;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ",whip";
	}

	@Override
	public double cost() {
		double val;
		if(beverage.getSize().equals(BeverageSizes.TALL)){
			val = 0.10;
		} else if(beverage.getSize().equals(BeverageSizes.GRANDE)){
			val = 0.15;
		} else {
			val = 0.20;
		}
		return val+beverage.cost();
	}

}
