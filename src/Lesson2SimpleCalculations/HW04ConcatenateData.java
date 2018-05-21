package Lesson2SimpleCalculations;

import java.util.*;

/**
 * @author icyhoty2k
 */


public class HW04ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Fname, Lname, town;
        int age;
        //    System.out.print("Vavedete First name :");
        Fname = scan.nextLine();
        //   System.out.print("Vavedete Last name :");
        Lname = scan.nextLine();
        //    System.out.print("Vavedete age:");
        age = Integer.parseInt(scan.nextLine());
        //    System.out.print("Vavedete town :");
        town = scan.nextLine();


        System.out.printf("You are %s %s, a %d-years old person from %s.", Fname, Lname, age, town);


    }
}
