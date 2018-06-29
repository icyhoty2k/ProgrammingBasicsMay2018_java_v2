package Lesson6DrawingWithLoops;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW09House {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int stars = 1;
        if (n % 2 == 0) stars++;
        for (int i = 0; i < (n + 1) / 2; i++) { // Draw the roof
            int padding = ((n - stars) / 2);
            System.out.print(repeatString("-", padding));
            System.out.print(repeatString("*", stars));
            System.out.println(repeatString("-", padding));
            stars = stars + 2;
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print(repeatString("|" , 1));
            System.out.print(repeatString("*" , n-2));
            System.out.print(repeatString("|" , 1));
            System.out.println();
        }


    }

    static String repeatString(String symbol, int n) {
        String text = "";
        for (int i = 0; i < n; i++) {
            text = text + symbol;
        }
        return text;
    }

}

