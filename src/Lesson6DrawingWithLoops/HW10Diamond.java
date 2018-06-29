package Lesson6DrawingWithLoops;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW10Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int leftRight = (n - 1) / 2;
        for (int i = 1; i <= (n - 1) / 2; i++) {
            // Draw the top part
            System.out.print(repeatStr("-", leftRight));
            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }
            System.out.println(repeatStr("-", leftRight));
            leftRight--;
        }

        int leftRight2 = 0;
        for (int i = 1; i <= (n +1) / 2; i++) {
            System.out.print(repeatStr("-", leftRight2));
            System.out.print("*");
            int mid = n - 2 * leftRight2 - 2;
            if (mid >= 0) {
                System.out.print(repeatStr("-", mid));
                System.out.print("*");
            }
            System.out.println(repeatStr("-", leftRight2));
            leftRight2++;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }

}

