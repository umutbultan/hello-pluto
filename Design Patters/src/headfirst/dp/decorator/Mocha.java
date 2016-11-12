package headfirst.dp.decorator;

public class Mocha extends CondimentDecorator {


	public Mocha(Beverage bev) {
		this.beverage = bev;
	}
	
	@Override
	public String getDescription() {
		return  beverage.getDescription() + ",mocha";
	}

	@Override
	public double cost() {
		double val;
		if(beverage.getSize().equals(BeverageSizes.TALL)){
			val = 0.20;
		} else if(beverage.getSize().equals(BeverageSizes.GRANDE)){
			val = 0.25;
		} else {
			val = 0.30;
		}
		return val + beverage.cost();
	}

}
