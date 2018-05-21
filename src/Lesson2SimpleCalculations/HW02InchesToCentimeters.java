package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW02InchesToCentimeters {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        Double inchesIn = Double.parseDouble(consoleIn.nextLine());
        Double centimetersConvert = 2.54;
        System.out.println(inchesIn * centimetersConvert);
    }
}
