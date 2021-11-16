package Kolkokrzyz2Trener;

import java.util.Scanner;
public class Gra {
    public boolean wykonajRuch(char[][] plansza, char symbol) {
        System.out.println(symbol + " Twój ruch");
        System.out.println("Podaj indeks wiersza");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Podaj indeks kolumny");
        int column = new Scanner(System.in).nextInt();
        boolean ruchPoprawny = plansza[row][column] == 0;
        if (!ruchPoprawny) {
            System.out.println("Ruch niepoprawny");
            return false;
        }
        plansza[row][column] = symbol;
        return true;
    }
}