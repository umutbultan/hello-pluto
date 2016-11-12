package headfirst.dp.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		
		Beverage bev1  = new Espresso(BeverageSizes.GRANDE);
		print(bev1);
		
		Beverage bev2 = new DarkRoast(BeverageSizes.VENTI);
		bev2 = new Mocha(bev2);
		bev2 = new Mocha(bev2);
		bev2 = new Whip(bev2);
		print(bev2);
		
		Beverage bev3 = new HouseBlend(BeverageSizes.TALL);
		bev3 = new Soy(bev3);
		bev3 = new Mocha(bev3);
		bev3 = new Whip(bev3);
		print(bev3);
		
		Beverage bev4 = new Whip(new Mocha(new Soy(new HouseBlend(BeverageSizes.GRANDE))));
		print(bev4);
	}
	
	
	public static void print(Beverage be){
		System.out.println(be.getDescription() + " $ "+ be.cost());
		
	}

}
