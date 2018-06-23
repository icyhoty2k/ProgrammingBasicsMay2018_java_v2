package Lesson6DrawingWithLoops;
/**
 * @author icyhoty2k
 */
import java.util.Scanner;

public class HW07ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n+1 ; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <n - i-1; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.print(" | ");
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//
//            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
