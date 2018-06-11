package Lesson5SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


// Ako nqkoi iska da stane po trudnia na4in tova e ! -
// ------------zada4a 12,lesson5,loops----------------

public class HW12EqualPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        int nxn = Integer.parseInt(bRead.readLine());
        if (nxn == 1) {
            int num = Integer.parseInt(bRead.readLine());
            num = Integer.parseInt(bRead.readLine());
            System.out.println("Yes, value=" + 2 * num);
            return;
        } else if (nxn == 0) {
            return;
        }
        int nextNum = 0;
        int sum1, sum2, enteredSecond, maxDiff, maxDiffTest;
        sum1 = sum2 = maxDiff = enteredSecond = 0;
        maxDiffTest = Integer.MIN_VALUE;
        int counter = 0;
        boolean found = false;
        for (int i = 0; i < 2 * nxn; i++) {
            if (counter == 2 && enteredSecond == 1) {
                sum2 = 0;
            }
            nextNum = Integer.parseInt(bRead.readLine());
            if (counter == 0 || counter == 1) {
                sum1 += nextNum;
                counter++;
                if (counter == 2 && enteredSecond == 1) {
                    if (sum1 > sum2) {
                        maxDiff = sum1 - sum2;
                    } else {
                        maxDiff = sum2 - sum1;
                    }
                    if (maxDiff > maxDiffTest) {
                        maxDiffTest = maxDiff;
                    }

                }
            } else if (counter == 2 || counter == 3) {
                enteredSecond = 1;
                sum2 += nextNum;
                counter++;
            }
            if (counter == 4 && sum1 != sum2) {
                found = true;
                if (sum1 > sum2) {
                    maxDiff = sum1 - sum2;
                } else {
                    maxDiff = sum2 - sum1;
                }
                counter = 0;
                sum1 = 0;
                if (maxDiff > maxDiffTest) {
                    maxDiffTest = maxDiff;
                }
            }
            if (counter == 4 && 2 * nxn != 4) {
                counter = 0;
                sum1 = 0;

            }

        }
        if (found) {
            System.out.println("No maxdiff=" + maxDiffTest);
        } else {
            System.out.println("Yes value=" + sum2);
        }
    }
}
