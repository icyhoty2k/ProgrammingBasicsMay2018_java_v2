package Lesson4ComplexLogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW01PersonalTitles {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Double age = Double.parseDouble(consoleInput.nextLine());
        String gender = consoleInput.nextLine();
        if (age < 16) {
            if (gender.equals("f")) {
                System.out.println("Miss");
            } else if (gender.equals("m")) {
                System.out.println("Master");
            }
        } else {
            if (gender.equals("f")) {
                System.out.println("Ms.");
            } else if (gender.equals("m")) {
                System.out.println("Mr.");
            }
        }
    }
}
