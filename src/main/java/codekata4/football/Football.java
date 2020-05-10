package codekata4.football;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Football {
    private String teamName;
    private int forValue;
    private int againstValue;


    public int bilance() {
        return forValue - againstValue;
    }
}
