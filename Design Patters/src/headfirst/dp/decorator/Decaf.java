package headfirst.dp.decorator;

public class Decaf extends Beverage {

	public Decaf(String size) {
		description = "Decaf";
		this.size = size;
	}
	@Override
	public double cost() {
		double val;
		if(this.getSize().equals(BeverageSizes.TALL)){
			val = 1.05;
		} else if(this.getSize().equals(BeverageSizes.GRANDE)){
			val = 1.15;
		} else {
			val = 1.25;
		}
		return val;
	}

}
