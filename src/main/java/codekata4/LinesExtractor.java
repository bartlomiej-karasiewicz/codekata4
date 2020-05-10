package codekata4;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LinesExtractor {

    private final String FILE_NAME = "weather.dat";
    private final String WHITE_SPACE = " ";
    private final String REGEX = "[^0-9.]+";

    public List<String[]> readLinesFromFile() {
        List<String> lines = new ArrayList<>();
        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(FILE_NAME))) {
            String currentLine;
            while ((currentLine = lineNumberReader.readLine()) != null) {
                lines.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String[]> transfomedLines = transformLines(lines);
        return transfomedLines;
    }

    private List<String[]> transformLines(List<String> lines) {
        List<String[]> transformedLines = lines.stream()
                .map(element -> element.trim().replaceAll(REGEX, WHITE_SPACE).split(WHITE_SPACE))
                .collect(Collectors.toList());
        transformedLines.remove(0);
        transformedLines.remove(0);
        transformedLines.remove(transformedLines.size()-1);
        return transformedLines;
    }
}
