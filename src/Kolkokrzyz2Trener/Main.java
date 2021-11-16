package Kolkokrzyz2Trener;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w grze podaj rozmiar planszy");
        int wymiar = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz czym chcesz grać O czy X?");
        char obecnySymbol = scanner.next().charAt(0);
        Plansza board = new Plansza(wymiar);
        boolean czyWygrana = false;
        while (!czyWygrana) {
            board.drukujPlansze(board.getPlansza());
            Gra gra = new Gra();
            gra.wykonajRuch(board.getPlansza(), obecnySymbol);
            Wygrana wygrana = new Wygrana();
            czyWygrana = wygrana.czyWygrana(board.getPlansza(), obecnySymbol);
            obecnySymbol = obecnySymbol == 'X' ? 'O' : 'X';
        }
    }
}