package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW05NumberToTextFrom_1_10 {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int NumToText = Integer.parseInt(consoleInput.nextLine());
        if (NumToText == 0) {
            System.out.println("zero");
        } else if (NumToText == 1) {
            System.out.println("one");
        } else if (NumToText == 2) {
            System.out.println("two");
        } else if (NumToText == 3) {
            System.out.println("three");
        } else if (NumToText == 4) {
            System.out.println("four");
        } else if (NumToText == 5) {
            System.out.println("five");
        } else if (NumToText == 6) {
            System.out.println("six");
        } else if (NumToText == 7) {
            System.out.println("seven");
        } else if (NumToText == 8) {
            System.out.println("eight");
        } else if (NumToText == 9) {
            System.out.println("nine");
        } else {
            System.out.println("number too big");
        }
    }
}
