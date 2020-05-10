package codekata4;

public class Weather {
    private int day;
    private int maxTemperature;
    private int minTemperature;

    public Weather(int day, int maxTemperature, int minTemperature) {
        this.day = day;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public int subtractTemperature(){
        return maxTemperature - minTemperature;
    }

    public int getDay() {
        return day;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "day=" + day +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';
    }
}
