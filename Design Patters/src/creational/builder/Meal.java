package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item i){
		items.add(i);
	}
	
	public float getCost(){
		float cost= 0.0f;
		
		for(Item i:items){
			cost += i.price();
		}
		return cost;
	}
	
	public void showItems(){
		for(Item i:items){
			System.out.print("Item : " + i.name());
			System.out.print(" , Packing : " + i.packing().pack());
			System.out.println(" , Price : " + i.price() );
		}
		
	}
}
