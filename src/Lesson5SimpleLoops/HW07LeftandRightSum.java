package Lesson5SimpleLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW07LeftandRightSum {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int sumLeft, sumRight;
        sumLeft = sumRight = 0;
        int n = Integer.parseInt(consoleInput.nextLine());
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                int nums = Integer.parseInt(consoleInput.nextLine());
                sumLeft = sumLeft + nums;
            } else {
                int nums = Integer.parseInt(consoleInput.nextLine());
                sumRight = sumRight + nums;
            }
        }
        if (sumLeft == sumRight) {
            System.out.println("YES, sum = " + sumLeft);
        } else {
            System.out.println("No, diff = " + Math.abs(sumLeft - sumRight));
        }


    }
}
