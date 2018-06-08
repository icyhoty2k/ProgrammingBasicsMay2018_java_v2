package Lesson4ComplexLogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW5InvalidNumber {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int number = Integer.parseInt(consoleInput.nextLine());
        if (!(number >= 100 && number <= 200 || number == 0)) {
            System.out.println("invalid");
        }
    }
}
