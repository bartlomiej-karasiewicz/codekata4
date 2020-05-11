package codekata4.weather;

import codekata4.commons.LinesExtractor;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class WeatherData {
    private final String FILE_NAME;

    public Map.Entry<Integer, Integer> minimumTemperatureSubtract() {
        List<String> linesFromFile = new LinesExtractor().readLinesFromFile(FILE_NAME);
        List<String[]> linesTransformer = new WeatherLinesTransformer().transformLines(linesFromFile);
        Map.Entry<Integer, Integer> minTemperatureSubtract = linesTransformer
                .stream()
                .map(element -> new Weather(Integer.parseInt(element[WeatherColumn.DAY.getIndex()]),
                        Integer.parseInt(element[WeatherColumn.MAX.getIndex()]),
                        Integer.parseInt(element[WeatherColumn.MIN.getIndex()])))
                .collect(Collectors.toMap(key -> key.getDay(), value -> value.subtractTemperature()))
                .entrySet()
                .stream()
                .min(Comparator.comparing(value -> value.getValue().intValue()))
                .orElseThrow(() -> new NoSuchElementException());
        System.out.println("Day: " + minTemperatureSubtract.getKey() + " Value: " + minTemperatureSubtract.getValue());
        return minTemperatureSubtract;
    }
}
