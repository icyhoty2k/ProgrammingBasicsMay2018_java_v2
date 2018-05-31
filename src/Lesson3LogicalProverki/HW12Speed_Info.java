package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW12Speed_Info {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
//        while (true) {
        Double chislo = Double.parseDouble(consoleInput.nextLine());
        if (chislo <= 10) {
            System.out.println("slow");
        } else if (chislo > 10 && chislo <= 50) {
            System.out.println("average");
        } else if (chislo > 50 && chislo <= 150) {
            System.out.println("fast");
        } else if (chislo > 150 && chislo <= 1000) {
            System.out.println("ultra fast");
        } else if (chislo > 1000) {
            System.out.println("extremely fast");
        }
//            if (chislo == 0){
//                System.out.println("Krai na programata ");
//                break;
//            }
//        }
    }
}
