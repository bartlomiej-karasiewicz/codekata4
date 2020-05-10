package codekata4;

public enum Column {
    DAY(0), MAX(1), MIN(2);

    private int index;

    Column(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
