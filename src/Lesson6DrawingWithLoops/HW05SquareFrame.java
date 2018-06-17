package Lesson6DrawingWithLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW05SquareFrame {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int n = Integer.parseInt(consoleInput.nextLine());
//          This is top
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");
        System.out.println();
        for (int j = 0; j < n - 2; j++) {
            System.out.print("|");
            for (int q = 0; q < n - 2; q++) {
                System.out.print(" -");
            }
            System.out.print(" |");
            System.out.println();
        }
        //          This is bottom
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");
    }
}
