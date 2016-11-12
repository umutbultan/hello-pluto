package headfirst.dp.decorator;

public abstract class Beverage {
	String description = "Unknown beverage!";
	String size;
	
	public String getSize(){
		return size;
	}
	
	public String getDescription(){
		return size + " " + description;
	}

	public abstract double cost();
}
