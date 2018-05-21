package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW06CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Vavedete radius:");
        Double radius = Double.parseDouble(sc.nextLine());
        System.out.println("Area = " + Math.PI * radius * radius);
        System.out.println("Perimeter = " + 2 * Math.PI * radius);


    }
}
