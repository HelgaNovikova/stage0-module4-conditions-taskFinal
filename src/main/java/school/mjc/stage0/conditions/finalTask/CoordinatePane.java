package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("zero");
        } else {
            String positiveX = "";
            String positiveY = "";
            if (x > 0) {
                positiveX = "1";
            } else positiveX = "0";
            if (y > 0) {
                positiveY = "1";
            } else positiveY = "0";

            switch (positiveX + positiveY) {
                case "10":
                    System.out.println("fourth");
                    break;
                case "11":
                    System.out.println("first");
                    break;
                case "01":
                    System.out.println("second");
                    break;
                case "00":
                    System.out.println("third");
                    break;
            }
        }
    }
}
