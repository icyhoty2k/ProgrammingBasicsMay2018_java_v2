package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW3GreetingsByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
