package Tests;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class TestIvan {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("vavedi X: ");


        int x = Integer.parseInt(consoleInput.nextLine());

        System.out.println();


        System.out.print("vavedi Y: ");
        int y = Integer.parseInt(consoleInput.nextLine());
        System.out.println("rezultata e  = " + (x + y));
    }

}
