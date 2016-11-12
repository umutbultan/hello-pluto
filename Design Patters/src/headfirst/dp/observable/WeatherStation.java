package headfirst.dp.observable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(wd);
		ForecastDisplay fd = new ForecastDisplay(wd);
		StatisticsDisplay sd = new StatisticsDisplay(wd);
		HeatIndexDisplay hd = new HeatIndexDisplay(wd);
		
		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.2f);
		wd.setMeasurements(78, 90, 29.2f);

	}

}
