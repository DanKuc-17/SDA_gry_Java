package Kwadrad_cw;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        Square square1 = getSquare(scanner,
                "Podaj współrzędne pierwszego kwadratu i długość jego boku:");
        Square square2 = getSquare(scanner,
                "Podaj współrzędne drugiego kwadratu i długość jego boku:");
         */
            Square square1 = new Square(new Square.Point(0, 100), 100);
            Square square2 = new Square(new Square.Point(-90, 1), 100);
            System.out.println(square1.isCovered(square2) && square2.isCovered(square1));
        }
        private static Square getSquare(Scanner scanner, String message) {
            System.out.println(message);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int length = scanner.nextInt();
            return new Square(new Square.Point(x, y), length);
        }
    }
