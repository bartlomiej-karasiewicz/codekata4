package codekata4.weather;

import java.util.List;
import java.util.stream.Collectors;

class WeatherLinesTransformer {

    private final String WHITE_SPACE = " ";
    private final String REGEX = "[^0-9.]+";

    List<String[]> transformLines(List<String> lines) {
        List<String[]> transformedLines = lines.stream()
                .map(element -> element.trim().replaceAll(REGEX, WHITE_SPACE).split(WHITE_SPACE))
                .collect(Collectors.toList());
        transformedLines.remove(0);
        transformedLines.remove(0);
        transformedLines.remove(transformedLines.size() - 1);
        return transformedLines;
    }
}
