package codekata4.weather;

import codekata4.commons.Indexer;

enum WeatherColumn implements Indexer {
    DAY(0), MAX(1), MIN(2);

    private int index;

    WeatherColumn(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
