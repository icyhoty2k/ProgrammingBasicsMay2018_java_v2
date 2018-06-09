package Lesson5SimpleLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW05MaxNumber {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int numN, maxN;
        numN = maxN = Integer.MIN_VALUE;
        numN = Integer.parseInt(consoleInput.nextLine());
        for (int i = 0; i < numN; i++) {
            int nums = Integer.parseInt(consoleInput.nextLine());

            if (nums > maxN) {
                maxN = nums;
            }
        }
        System.out.println(maxN);
    }
}
