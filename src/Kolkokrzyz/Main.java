package Kolkokrzyz;

public class Main {
    public static void main(String[] args) {
        // write your code here
        KolkoIKrzyzyk game = new KolkoIKrzyzyk();
        KolkoIKrzyzyk.Board superGame = new KolkoIKrzyzyk.Board();
        superGame.signChoice();
        superGame.setComputerSign();
        superGame.makeBoard();
        while (superGame.endOfGame==false ) {
            superGame.wherePlayersSign();
            superGame.putPlayersSign();
            System.out.println();
            superGame.playerWins();
            if (superGame.endOfGame){
                break;
            }
            superGame.computersMove();
            superGame.putComputersSign();
            if (superGame.computerWins()) {
                System.out.print("Koniec gry! Przegrałeś :(");
            }
        }
    }
}
