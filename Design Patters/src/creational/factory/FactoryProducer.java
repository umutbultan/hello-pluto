package creational.factory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice == null){
			return null;
		}
		if(choice.equals( ColorFactory.COLOR)){
			return new ColorFactory();
		} else if( choice.equals( ShapeFactory.SHAPE)){
			return new ShapeFactory();
		}
		return null;
	}
}
