package chapter2;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidiity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidiity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: "+ temperature + 
				"F degrees and " + humidity + "% humidity");
	}
}
