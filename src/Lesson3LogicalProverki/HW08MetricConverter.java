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
        if (inUnitDistance.equals("cm")) {
            distance /= cm;
            System.out.println("da");
        } else if (inUnitDistance.equals("mm")) {
            distance /= mm;
        } else if (inUnitDistance.equals("mi")) {
            distance /= mi;
        } else if (inUnitDistance.equals("in")) {
            distance /= in;
        } else if (inUnitDistance.equals("km")) {
            distance /= km;
        } else if (inUnitDistance.equals("ft")) {
            distance /= ft;
        } else if (inUnitDistance.equals("yd")) {
            distance /= yd;
        }
        if (outUnitDistance.equals("cm")) {
            distance *= cm;
        } else if (outUnitDistance.equals("mm")) {
            distance *= mm;
        } else if (outUnitDistance.equals("mi")) {
            distance *= mi;
        } else if (outUnitDistance.equals("in")) {
            distance *= in;
        } else if (outUnitDistance.equals("km")) {
            distance *= km;
        } else if (outUnitDistance.equals("ft")) {

            distance *= ft;
        } else if (outUnitDistance.equals("yd")) {
            distance *= yd;
        }
        System.out.printf("%.8f " + outUnitDistance, distance);
    }
}
