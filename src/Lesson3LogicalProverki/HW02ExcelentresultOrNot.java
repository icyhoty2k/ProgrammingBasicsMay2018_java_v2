package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW02ExcelentresultOrNot {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Double ocenka = Double.valueOf(consoleInput.nextLine());
        if (ocenka >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent.");
        }
    }
}