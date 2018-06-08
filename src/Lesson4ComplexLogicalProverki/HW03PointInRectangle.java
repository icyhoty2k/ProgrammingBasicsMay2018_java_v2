package Lesson4ComplexLogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW03PointInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double x1, x2, y1, y2, x, y;
        x1 = Double.parseDouble(scan.nextLine());
        y1 = Double.parseDouble(scan.nextLine());
        x2 = Double.parseDouble(scan.nextLine());
        y2 = Double.parseDouble(scan.nextLine());
        x = Double.parseDouble(scan.nextLine());
        y = Double.parseDouble(scan.nextLine());
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
