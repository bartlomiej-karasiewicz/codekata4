package codekata4.commons;

import lombok.RequiredArgsConstructor;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class LinesExtractor {

    private final String FILE_NAME;

    public List<String> readLinesFromFile() {
        List<String> lines = new ArrayList<>();
        try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(FILE_NAME))) {
            String currentLine;
            while ((currentLine = lineNumberReader.readLine()) != null) {
                lines.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
