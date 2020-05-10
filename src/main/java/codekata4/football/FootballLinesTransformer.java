package codekata4.football;

import java.util.List;
import java.util.stream.Collectors;

class FootballLinesTransformer {

    private final String WHITE_SPACE = " ";
    private final String REGEX = "[^0-9._A-Za-z]+";

    List<String[]> transformLines(List<String> lines) {
        List<String[]> transformedLines = lines.stream()
                .map(element -> element.trim().replaceAll(REGEX, WHITE_SPACE).split(WHITE_SPACE))
                .collect(Collectors.toList());
        transformedLines.remove(0);
        transformedLines.remove(17);
        return transformedLines;
    }
}