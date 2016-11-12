package creational.factory;

public class FactoryPatternDeom {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape s1 = factory.getShape( ShapeFactory.CIRCLE);
		s1.draw();
		
		Shape s2 = factory.getShape( ShapeFactory.RECTANGLE);
		s2.draw();
		
		Shape s3Shape = factory.getShape( ShapeFactory.SQUARE);
		s3Shape.draw();

	}

}
