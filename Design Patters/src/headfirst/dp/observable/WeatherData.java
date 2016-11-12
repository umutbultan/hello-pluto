package headfirst.dp.observable;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float hum,float pres){
		this.temprature = temp;
		this.humidity = hum;
		this.pressure = pres;
		measurementsChanged();
	}

	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public float getTemprature() {
		return temprature;
	}




	
	
}
