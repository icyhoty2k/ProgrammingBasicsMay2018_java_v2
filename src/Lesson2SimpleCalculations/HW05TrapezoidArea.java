package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW05TrapezoidArea {
    public static void main(String[] args) {
        Double osnovaB1, osnovaB2, height;
        Scanner c = new Scanner(System.in);
        System.out.print("Vavedete osnova  a:");
        osnovaB1 = Double.parseDouble(c.nextLine());
        System.out.print("Vavedete osnova  b:");
        osnovaB2 = Double.parseDouble(c.nextLine());
        System.out.print("Vavedete viso4ina h:");
        height = Double.parseDouble(c.nextLine());
        System.out.println((osnovaB1 + osnovaB2) * height / 2);
    }
}
