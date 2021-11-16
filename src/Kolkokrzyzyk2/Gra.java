package Kolkokrzyzyk2;

import java.util.Scanner;

public class Gra {
    public boolean wykonajRuch(char[][] plansza, char symbol) {
        System.out.println(symbol + " Twój ruch");
        System.out.println("Podaj pozycje");
        int pozycja = new Scanner(System.in).nextInt();
        boolean ruchPoprawny = false;
        if (!ruchPoprawny) {
            System.out.println("Ruch niepoprawny");
            return false;
        }
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                if (pozycja == plansza[i][j]) {
                    plansza[i][j] = symbol;
                }
            }
        }
        return true;
    }
}