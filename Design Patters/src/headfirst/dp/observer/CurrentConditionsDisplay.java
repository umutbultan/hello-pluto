package headfirst.dp.observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temprature;
	private float humidity;
	private Subject weatherData;
	
	
	
	public CurrentConditionsDisplay(Subject wd) {
		this.weatherData = wd;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float huidity, float pressure) {
		this.temprature = temp;
		this.humidity = huidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + this.temprature + " C degrees and " + this.humidity + " % humidity.");

	}

}
