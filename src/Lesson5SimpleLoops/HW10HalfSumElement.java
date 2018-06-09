package Lesson5SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW10HalfSumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int maxN = 0;
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(br.readLine());
            sum += x;
            if (maxN < x) {
                maxN = x;
            }
        }
        if (maxN == sum - maxN) {
            System.out.println("Yes \nSum = " + maxN);
        } else {
            System.out.println("No \nDiff = " + Math.abs((2 * maxN - sum)));
        }
    }
}



