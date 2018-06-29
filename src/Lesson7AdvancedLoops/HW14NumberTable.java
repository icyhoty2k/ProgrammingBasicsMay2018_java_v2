package Lesson7AdvancedLoops;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW14NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n ; col++) {
                int num = row+col+1;
                if (num >n){
                    num = (n*2)-num;
                }
            System.out.print(num+" ");

            }
            System.out.println();
        }



    }

}

