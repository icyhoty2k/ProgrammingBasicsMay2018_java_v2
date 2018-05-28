package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW08MetricConverter {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Double distance = Double.parseDouble(consoleInput.nextLine());
        String inUnitDistance = consoleInput.nextLine();
        String outUnitDistance = consoleInput.nextLine();
        Double cm, mm, mi, in, km, ft, yd;
        cm = 100.0;
        mm = 1000.0;
        mi = 0.000621371192;
        in = 39.3700787;
        km = 0.001;
        ft = 3.2808399;
        yd = 1.0936133;
        switch (inUnitDistance) {
            case "cm":
                distance /= cm;
                break;
            case "mm":
                distance /= mm;
                break;
            case "mi":
                distance /= mi;
                break;
            case "in":
                distance /= in;
                break;
            case "km":
                distance /= km;
                break;
            case "ft":
                distance /= ft;
                break;
            case "yd":
                distance /= yd;
                break;
        }
        switch (outUnitDistance) {
            case "cm":
                distance *= cm;
                break;
            case "mm":
                distance *= mm;
                break;
            case "mi":
                distance *= mi;
                break;
            case "in":
                distance *= in;
                break;
            case "km":
                distance *= km;
                break;
            case "ft":

                distance *= ft;
                break;
            case "yd":
                distance *= yd;
                break;
        }
        System.out.printf("%.8f " + outUnitDistance, distance);
    }
}
