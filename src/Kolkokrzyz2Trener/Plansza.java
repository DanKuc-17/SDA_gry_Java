package Kolkokrzyz2Trener;

public class Plansza {
    private int wymiar;
    private final char[][] plansza;
    public Plansza(int wymiar) {
        this.wymiar = wymiar;
        this.plansza = new char[wymiar][wymiar];
    }
    public void drukujPlansze(char[][] plansza) {
        int wymiar = plansza.length;
        // naglowki kolumn
        System.out.print("\t");
        // petla drukajace naglowki kolumn
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        // drukowanie wierszy
        for (int row = 0; row < plansza.length; row++) {
            System.out.print(row + "\t");
            for (int column = 0; column < plansza[row].length; column++) {
                System.out.print(plansza[row][column] + "\t");
            }
            System.out.println();
        }
    }
    public int getWymiar() {
        return wymiar;
    }
    public char[][] getPlansza() {
        return plansza;
    }
}