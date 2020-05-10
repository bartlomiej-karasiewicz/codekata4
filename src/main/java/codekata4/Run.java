package codekata4;

import codekata4.football.FootballData;
import codekata4.weather.WeatherData;

public class Run {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.minimumTemperatureSubtract();

        FootballData footballData = new FootballData();
        footballData.minimumBilance();
    }
}

