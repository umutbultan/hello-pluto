package headfirst.dp.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		int i = observers.indexOf(ob);
		if(i>=0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o: observers){
			o.update(temprature, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp,float hum,float pres){
		this.temprature = temp;
		this.humidity = hum;
		this.pressure = pres;
		measurementsChanged();
	}
}
