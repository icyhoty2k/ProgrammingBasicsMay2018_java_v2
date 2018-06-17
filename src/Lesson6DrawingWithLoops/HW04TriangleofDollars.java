package Lesson6DrawingWithLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW04TriangleofDollars {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int n = Integer.parseInt(consoleInput.nextLine());
        String dollar = "$";
        for (int i = 0; i < n; i++) {
            System.out.println(dollar);
            dollar += " $";
        }
    }
}
