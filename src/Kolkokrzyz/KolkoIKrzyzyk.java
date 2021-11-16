package Kolkokrzyz;

import java.util.Random;
import java.util.Scanner;

public class KolkoIKrzyzyk {
    public static class Board {
        int[][] board = new int[3][3];
        String[][] boardString = new String[3][3];
        String initialMessage = "\nHej! Zagrajmy w kółko i krzyżyk :) Jaki znak wybierasz (kółko to @, a krzyżyk to X)?";
        String playMessage = "\nNa którym polu chcesz postawić swój znak?";
        String chosenSign;
        String computerSign;
        int computerSignRow;
        int computerSignColumn;
        Scanner scanner = new Scanner(System.in);
        boolean endOfGame = false;
        int numberOfSignsInLine = 0;
        //int numberOfSignsInColumn = 0;
        public String[][] makeBoard() {
            int fieldNumber = 1;
            for (int row = 0; row < board.length; row++) {
                for (int column = 0; column < board[row].length; column++) {
                    board[row][column] = fieldNumber;
                    boardString[row][column] = Integer.toString(fieldNumber);
                    System.out.print("[" + boardString[row][column] + "]");
                    fieldNumber++;
                }
                System.out.println();
            }
            return boardString;
        }
        public String signChoice() {
            System.out.println(initialMessage);
            chosenSign = scanner.next();
            return chosenSign;
        }
        public String setComputerSign() {
            if (chosenSign.equals("X") || chosenSign.equals("x")) {
                computerSign = "@";
            } else {
                computerSign = "X";
            }
            return computerSign;
        }
        public String[][] wherePlayersSign() {
            System.out.println(playMessage);
            String signPosition = scanner.next();
            for (int row = 0; row < board.length; row++) {
                for (int column = 0; column < board[row].length; column++) {
                    if (signPosition.equals(boardString[row][column])) {
                        boardString[row][column] = chosenSign;
                    }
                }
            }
            return boardString;
        }
        public void putPlayersSign() {
            for (int row = 0; row < board.length; row++) {
                for (int column = 0; column < board[row].length; column++) {
                    System.out.print("[" + boardString[row][column] + "]");
                }
                System.out.println();
            }
        }
        public String[][] computersMove() {
            while (true) {
                computerSignRow = new Random().nextInt(3);
                computerSignColumn = new Random().nextInt(3);
                if (!boardString[computerSignRow][computerSignColumn].equals(chosenSign) &&
                        !boardString[computerSignRow][computerSignColumn].equals(computerSign)) {
                    break;
                }
            }
            boardString[computerSignRow][computerSignColumn] = computerSign;
            return boardString;
        }
        public void putComputersSign() {
            for (int row = 0; row < board.length; row++) {
                for (int column = 0; column < board[row].length; column++) {
                    System.out.print("[" + boardString[row][column] + "]");
                }
                System.out.println();
            }
        }
        public void playerWins() {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < board.length; i++) {
                    if (boardString[j][i].equals(chosenSign)) {
                        numberOfSignsInLine++;
                    }
                }
                if (numberOfSignsInLine == 3) {
                    endOfGame = true;
                } else {
                    numberOfSignsInLine = 0;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (boardString[j][i].equals(chosenSign)) {
                        numberOfSignsInLine++;
                    }
                }
                if (numberOfSignsInLine == 3) {
                    endOfGame = true;
                } else {
                    numberOfSignsInLine = 0;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (boardString[i][i].equals(chosenSign)) {
                    numberOfSignsInLine++;
                }
            }
            if (numberOfSignsInLine == 3) {
                endOfGame = true;
            } else {
                numberOfSignsInLine = 0;
            }
            for (int i = 0; i < 3; i++) {
                if (boardString[i][2 - i].equals(chosenSign)) {
                    numberOfSignsInLine++;
                }
            }
            if (numberOfSignsInLine == 3) {
                endOfGame = true;
            } else {
                numberOfSignsInLine = 0;
            }
            if (endOfGame) {
                System.out.print("Koniec gry! Wygrałeś :)");
            }
        }
        public boolean computerWins() {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < board.length; i++) {
                    if (boardString[j][i].equals(computerSign)) {
                        numberOfSignsInLine++;
                    }
                }
                if (numberOfSignsInLine == 3) {
                    return true;
                } else {
                    numberOfSignsInLine = 0;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (boardString[j][i].equals(computerSign)) {
                        numberOfSignsInLine++;
                    }
                }
                if (numberOfSignsInLine == 3) {
                    return true;
                } else {
                    numberOfSignsInLine = 0;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (boardString[i][i].equals(computerSign)) {
                    numberOfSignsInLine++;
                }
            }
            if (numberOfSignsInLine == 3) {
                return true;
            } else {
                numberOfSignsInLine = 0;
            }
            for (int i = 0; i < 3; i++) {
                if (boardString[i][2 - i].equals(computerSign)) {
                    numberOfSignsInLine++;
                }
            }
            if (numberOfSignsInLine == 3) {
                return true;
            } else {
                numberOfSignsInLine = 0;
            }
            return false;
        }
    }
}