package headfirst.dp.observable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	Observable observable;

	public ForecastDisplay(Observable obs) {
		this.observable = obs;
		this.observable.addObserver(this);
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wd = (WeatherData) o;
			this.lastPressure = this.currentPressure;
			this.currentPressure = wd.getPressure();
			display();
		}
	}
}
