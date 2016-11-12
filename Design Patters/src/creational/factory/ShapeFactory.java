package creational.factory;

public class ShapeFactory extends AbstractFactory{
	
	public static final String CIRCLE = "circle";
	public static final String RECTANGLE = "rectangle";
	public static final String SQUARE = "square";
	public static final String SHAPE = "shape";
	
	@Override
	public Shape getShape(String shapeType){
		
		if(shapeType == null){
			return null;
		} else if( shapeType.equalsIgnoreCase( CIRCLE )){
			return new Circle();
		} else if( shapeType.equals(RECTANGLE)) {
			return new Rectangle();
		} else if( shapeType.equals( SQUARE)) {
			return new Square();
		} 
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
	
	
}
