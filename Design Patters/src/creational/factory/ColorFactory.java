package creational.factory;

public class ColorFactory extends AbstractFactory {

	public static final String RED = "red";
	public static final String BLUE = "blue";
	public static final String GREEN = "green";
	public static final String COLOR = "color";
	
	@Override
	Color getColor(String color) {

		if (color == null){
			return null;
		} else if ( color.equals(RED)){
			return new Red();
		} else if(color.equals(BLUE)){
			return new Blue();
		} else if( color.equals(GREEN)){
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
