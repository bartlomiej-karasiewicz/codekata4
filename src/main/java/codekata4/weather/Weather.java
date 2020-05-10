package codekata4.weather;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
class Weather {
    private int day;
    private int maxTemperature;
    private int minTemperature;

    public int subtractTemperature(){
        return maxTemperature - minTemperature;
    }
}
