package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW01SquareArea {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int x = Integer.parseInt(consoleInput.nextLine());
        int squareArea = x * x;
        System.out.println(squareArea);
    }
}
