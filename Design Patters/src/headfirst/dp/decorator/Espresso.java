package headfirst.dp.decorator;

public class Espresso extends Beverage {
	
	public Espresso(String size){
		description = "Espresso";
		this.size = size;
	}
	@Override
	public double cost() {
		double val;
		if(this.getSize().equals(BeverageSizes.TALL)){
			val = 1.99;
		} else if(this.getSize().equals(BeverageSizes.GRANDE)){
			val = 2.09;
		} else {
			val = 2.19;
		}
		return val;
	}

}
