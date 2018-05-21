package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW08TriagleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double side, height;
        System.out.print("Vavedete Strana :");
        side = Double.parseDouble(scan.nextLine());
        System.out.print("Vavedete Viso4ina :");
        height = Double.parseDouble(scan.nextLine());
        System.out.printf("Triangle area = %.2f", (side * height) / 2);
    }
}
