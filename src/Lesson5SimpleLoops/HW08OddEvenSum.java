package Lesson5SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW08OddEvenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int evenSum, oddSum;
        evenSum = oddSum = 0;
        for (int i = 0; i < nums; i++) {
            int nextNum = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                oddSum += nextNum;
            } else {
                evenSum += nextNum;
            }

        }
        if (oddSum == evenSum) {
            System.out.println("Yes \nSum = " + oddSum);
        } else {
            System.out.println("No \ndiff = " + Math.abs(oddSum - evenSum));
        }

    }
}
