package Lesson7AdvancedLoops;/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW05Sequence2k_plus_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num =1;
        int k =1;
        while (k<=n){
            System.out.println(k);
            k=2*k+1;
        }
    }

}

