package codekata4.football;

import codekata4.commons.LinesExtractor;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class FootballData {

    private final String FILE_NAME = "football.dat";
    private List<String> linesFromFile = new LinesExtractor(FILE_NAME).readLinesFromFile();

    public Map.Entry<String, Integer> minimumBilance() {
        List<String[]> linesTransformer = new FootballLinesTransformer().transformLines(linesFromFile);
        Map.Entry<String, Integer> minimumBilance = linesTransformer.stream().map(element -> new Football(element[FootballColumn.TEAM_NAME.getIndex()],
                Integer.parseInt(element[FootballColumn.FOR.getIndex()]),
                Integer.parseInt(element[FootballColumn.AGAINST.getIndex()])))
                .collect(Collectors.toMap(key -> key.getTeamName(), value -> value.bilance()))
                .entrySet()
                .stream()
                .min(Comparator.comparing(value -> value.getValue().intValue()))
                .orElseThrow(() -> new NoSuchElementException());
        System.out.println("Team with lowest bilance: " + minimumBilance.getKey() + " Bilance: " + minimumBilance.getValue());
        return minimumBilance;
    }
}

