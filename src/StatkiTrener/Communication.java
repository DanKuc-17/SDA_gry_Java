package StatkiTrener;

import java.util.Scanner;

public class Communication {
    private final Scanner scanner = new Scanner(System.in);

    public String getDirection() {
        System.out.println("Podaj kierunek statku down,d/up,u/left,l/right,r: ");
        return scanner.next();
    }
}