package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW13AreaofFigures {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String geoFigure = consoleInput.nextLine();
        if (geoFigure.equals("square")) {
            Double side = Double.parseDouble(consoleInput.nextLine());
            System.out.println(side * side);
        } else if (geoFigure.equals("rectangle")) {
            Double x = Double.parseDouble(consoleInput.nextLine());
            Double y = Double.parseDouble(consoleInput.nextLine());
            System.out.println(x * y);
        } else if (geoFigure.equals("circle")) {
            Double r = Double.parseDouble(consoleInput.nextLine());
            System.out.println(Math.PI * r * r);
        } else if (geoFigure.equals("triangle")) {
            Double a = Double.parseDouble(consoleInput.nextLine());
            Double ha = Double.parseDouble(consoleInput.nextLine());
            Double sqSize = ((a * ha) * 0.5);
            System.out.printf("%.3f", sqSize);
        }
    }
}
