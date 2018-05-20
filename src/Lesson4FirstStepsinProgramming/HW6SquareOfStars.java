package Lesson4FirstStepsinProgramming;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW6SquareOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine());
        System.out.println(new String(new char[x]).replace("\0", "*"));
        for (int i = 0; i < x - 2; i++) {
            System.out.print("*");
//        System.out.print(new String(new char[1]).replace("\0", "*"));
            System.out.print(new String(new char[x - 2]).replace("\0", " "));
//        System.out.println(new String(new char[1]).replace("\0", "*"));
            System.out.println("*");

        }

        System.out.println(new String(new char[x]).replace("\0", "*"));
    }
}
