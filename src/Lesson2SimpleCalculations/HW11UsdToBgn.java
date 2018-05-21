package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW11UsdToBgn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vavedete dolari za obrastane v levove: ");
        Double USD = Double.parseDouble(input.nextLine());
        Double lv = USD * 1.79549;

        System.out.printf("%.2f BGN", lv);
    }
}
