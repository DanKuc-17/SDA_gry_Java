package StatkiTrener;

import java.util.Random;

public class Main {
    public static final int INITIAL_POSITION = 2;
    public static final int INITIAL_SIZE = 5;

    public static void main(String[] args) {
        Board board = new Board(INITIAL_SIZE);
        Position boat = new Position(INITIAL_POSITION, INITIAL_POSITION);
        Position treasure = getTreasurePosition(INITIAL_POSITION);
        Movement movement = new Movement();
        while (true) {
            board.addVisitedPosition(boat);
            board.printBoard();
            movement.moveBoat(boat);
            if (boatOutsideBoard(boat)) {
                System.out.println("Statek poza planszą :(");
                break;
            } else if (isOnTreasure(boat, treasure)) {
                System.out.println("Gratulacje! Znalazłeś ukryty skarb :)");
                break;
            }
        }
    }

    private static boolean isOnTreasure(Position boat, Position treasure) {
        return boat.getRow() == treasure.getRow() && boat.getColumn() == treasure.getColumn();
    }

    private static boolean boatOutsideBoard(Position boat) {
        return boat.getRow() < 0 || boat.getColumn() > 4 ||
                boat.getColumn() < 0 || boat.getRow() > 4;
    }

    private static Position getTreasurePosition(int startPosition) {
        int treasureRow = getRandomValue();
        int treasureColumn = getRandomValue();
        while (treasureRow == startPosition && treasureColumn == startPosition) {
            treasureRow = getRandomValue();
            treasureColumn = getRandomValue();
        }
        return new Position(treasureRow, treasureColumn);
    }

    private static int getRandomValue() {
        return new Random().nextInt(5) + 1;
    }
}