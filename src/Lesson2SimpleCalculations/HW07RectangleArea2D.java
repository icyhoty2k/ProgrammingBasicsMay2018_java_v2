package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW07RectangleArea2D {
    public static void main(String[] args) {
        Scanner cw = new Scanner(System.in);
        Double x1, x2, y1, y2;
        System.out.print("vavedete x1:");
        x1 = Double.parseDouble(cw.nextLine());
        System.out.print("vavedete y1:");
        y1 = Double.parseDouble(cw.nextLine());
        System.out.print("vavedete x2:");
        x2 = Double.parseDouble(cw.nextLine());
        System.out.print("vavedete y2:");
        y2 = Double.parseDouble(cw.nextLine());
        Double hline = Math.abs(x1 - x2);
        Double vline = Math.abs(y1 - y2);

        System.out.println(hline * vline);
        System.out.println(2 * (hline + vline));
    }
}
