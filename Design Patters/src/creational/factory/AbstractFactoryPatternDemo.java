package creational.factory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory( ShapeFactory.SHAPE);
		
		Shape s1 = shapeFactory.getShape( ShapeFactory.CIRCLE);
		s1.draw();
		
		Shape s2 = shapeFactory.getShape( ShapeFactory.RECTANGLE);
		s2.draw();
		
		Shape s3 = shapeFactory.getShape( ShapeFactory.SQUARE);
		s3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory( ColorFactory.COLOR);
		
		Color c1 = colorFactory.getColor( ColorFactory.BLUE );
		c1.fill();
		
		Color c2Color = colorFactory.getColor( ColorFactory.GREEN );
		c2Color.fill();
		
		Color c3 = colorFactory.getColor( ColorFactory.RED);
		c3.fill();
		

	}

}
