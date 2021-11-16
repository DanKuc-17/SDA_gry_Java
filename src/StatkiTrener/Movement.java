package StatkiTrener;

public class Movement {
    private final Communication communication= new Communication();
    public void moveBoat(Position boat){
        switch (communication.getDirection()) {
            case "down":
            case "d":
                System.out.println("v");
                boat.addOneToRow();
                break;
            case "up":
            case "u":
                System.out.println("^");
                boat.minusOneFromRow();
                break;
            case "left":
            case "l":
                System.out.println("<");
                boat.minusOneFromColumn();
                break;
            case "right":
            case "r":
                System.out.println(">");
                boat.addOneToColumn();
                break;
            default:
                System.out.println("Błąd");
        }
    }
}