package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW10RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Vavedete radiani : ");
        Double rad = Double.parseDouble(scan.nextLine());
        Double deg = rad * 57.29578;
        Math.round(deg);
        System.out.printf("%.2f", deg);
    }
}
