package StatkiTrener;

public class Board {
    private int[][] board;

    public Board(int size) {
        initBoard(size);
    }

    public void addVisitedPosition(Position position) {
        board[position.getRow()][position.getColumn()]++;
    }

    public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

    private void initBoard(int size) {
        board = new int[size][size];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = 0;
            }
        }
    }
}