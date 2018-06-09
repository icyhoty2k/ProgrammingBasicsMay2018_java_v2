package Lesson5SimpleLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW06MinNumber {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int numN, minN;
        numN = minN = Integer.MAX_VALUE;
        numN = Integer.parseInt(consoleInput.nextLine());
        for (int i = 0; i < numN; i++) {
            int nums = Integer.parseInt(consoleInput.nextLine());

            if (nums < minN) {
                minN = nums;
            }
        }
        System.out.println(minN);
    }
}
