package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class Hw09CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Vavedete gradusi po Celzii: ");
        Double tempC = Double.parseDouble(scan.nextLine());
        Double tempF = (tempC * 1.8) + 32;
        System.out.printf("%.2f", tempF);
    }
}
