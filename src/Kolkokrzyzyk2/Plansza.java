package Kolkokrzyzyk2;

public class Plansza {
    private final char[][] plansza;

    public Plansza() {
        this.plansza = new char[3][3];
    }

    public void drukujPlansze(char[][] plansza) {
        int[][] tablica = new int[3][3];
        int numPola = 1;
        for (int row=0; row < tablica.length; row++){
            for( int column=0; column < tablica[row].length; column++){
                tablica[row][column] = numPola;
                plansza[row][column] = Integer.toString(numPola).charAt(0);
                System.out.print("|" + plansza[row][column] + "|");
                numPola++;
            }
            System.out.println();
        }
    }

    public char[][] getPlansza() {
        return plansza;
    }
}