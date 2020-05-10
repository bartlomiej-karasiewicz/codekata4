package codekata4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class WeatherData {
    private List<String[]> linesFromFile = new LinesExtractor().readLinesFromFile();

    public Map.Entry<Integer, Integer> minimumTemperatureSubtract() {
        Map.Entry<Integer, Integer> minTemperatureSubtract = linesFromFile
                .stream()
                .map(element -> new Weather(Integer.parseInt(element[Column.DAY.getIndex()]),
                        Integer.parseInt(element[Column.MAX.getIndex()]),
                        Integer.parseInt(element[Column.MIN.getIndex()])))
                .collect(Collectors.toMap(key -> key.getDay(), value -> value.subtractTemperature()))
                .entrySet()
                .stream()
                .min(Comparator.comparing(value -> value.getValue().intValue()))
                .orElseThrow(() -> new NoSuchElementException());
        System.out.println("Day: " + minTemperatureSubtract.getKey() + " Value: " + minTemperatureSubtract.getValue());
        return minTemperatureSubtract;
    }
}
