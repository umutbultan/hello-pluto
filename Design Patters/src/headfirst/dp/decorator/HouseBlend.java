package headfirst.dp.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend(String size) {
		description = "House Blend Coffee";
		this.size = size;
	}
	
	@Override
	public double cost() {
		double val;
		if(this.getSize().equals(BeverageSizes.TALL)){
			val = 0.99;
		} else if(this.getSize().equals(BeverageSizes.GRANDE)){
			val = 1.09;
		} else {
			val = 1.19;
		}
		return val;
	}

}
