package headfirst.dp.observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temprature;
	private float humidity;
	Observable observable;
		
	public CurrentConditionsDisplay(Observable ob) {
		this.observable = ob;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if( o instanceof WeatherData ){
			WeatherData wd = (WeatherData)o;
			this.temprature = wd.getTemprature();
			this.humidity = wd.getHumidity();
			display();
		}
		
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + this.temprature + " C degrees and " + this.humidity + " % humidity.");
	}

}
