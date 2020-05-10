package codekata4.football;

import codekata4.commons.Indexer;

enum FootballColumn implements Indexer {
    TEAM_NAME(1), FOR(6), AGAINST(7);

    private int index;

    FootballColumn(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
