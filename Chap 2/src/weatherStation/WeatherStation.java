package weatherStation;

import object.CurrentConditionsDisplay;
import subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 70, 29.2f);
        weatherData.setMeasurements(78, 70, 29.2f);

    }
}
