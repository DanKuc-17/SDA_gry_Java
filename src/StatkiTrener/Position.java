package StatkiTrener;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void addOneToRow() {
        row++;
    }

    public void addOneToColumn() {
        column++;
    }

    public void minusOneFromRow() {
        row--;
    }

    public void minusOneFromColumn() {
        column--;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}