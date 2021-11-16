package Kolkokrzyzyk2;

public class Wygrana {
    public boolean czyWygrana(char[][] plansza, char symbol) {
        boolean wygrana = (plansza[0][0] == symbol && plansza[1][1] == symbol && plansza[2][2] == symbol) ||
                (plansza[0][0] == symbol && plansza[0][1] == symbol && plansza[0][2] == symbol) ||
                (plansza[0][0] == symbol && plansza[1][0] == symbol && plansza[2][0] == symbol) ||
                (plansza[1][0] == symbol && plansza[1][1] == symbol && plansza[1][2] == symbol) ||
                (plansza[2][0] == symbol && plansza[2][1] == symbol && plansza[2][2] == symbol) ||
                (plansza[0][1] == symbol && plansza[1][1] == symbol && plansza[2][1] == symbol) ||
                (plansza[0][2] == symbol && plansza[1][2] == symbol && plansza[2][2] == symbol) ||
                (plansza[0][2] == symbol && plansza[1][1] == symbol && plansza[2][0] == symbol);
        if (wygrana) {
            System.out.println("Wygrałeś: " + symbol);
            return true;
        }
        return false;
    }
}