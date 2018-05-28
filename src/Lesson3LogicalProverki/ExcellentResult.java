package Lesson3LogicalProverki;
//Zada4a 1 ot urok 3

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class ExcellentResult {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Double ocenka = Double.valueOf(consoleInput.nextLine());
        if (ocenka >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
