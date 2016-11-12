package headfirst.dp.observable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	Observable observable;

	public StatisticsDisplay(Observable obs) {
		this.observable = obs;
		this.observable.addObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wd = (WeatherData) o;
			tempSum += wd.getTemprature();
			numReadings++;
			if (wd.getTemprature() > maxTemp) {
				maxTemp = wd.getTemprature();
			}
			if (wd.getTemprature() < minTemp) {
				minTemp = wd.getTemprature();
			}
			display();
		}
	}
}
