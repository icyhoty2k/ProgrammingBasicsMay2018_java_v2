package Lesson7AdvancedLoops;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class HW11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =3;
        do {
            System.out.print("Enter even number: ");
            try {
                 n = Integer.parseInt(sc.nextLine());
            }
            catch (Exception ex){
                System.out.println("Invalid number!");
            }
            if (n%2!=0){
                System.out.println("Invalid number!");
            }
        } while ( n % 2 != 0);
        System.out.println("Even number entered: " + n);

    }

}

