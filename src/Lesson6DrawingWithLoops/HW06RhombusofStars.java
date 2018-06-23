package Lesson6DrawingWithLoops;
/**
 * @author icyhoty2k
 */
        import java.util.Scanner;

public class HW06RhombusofStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nZvezdi = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nZvezdi; i++) {
            for (int j = 0; j < nZvezdi-1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 1; i < nZvezdi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int q = 0; q <nZvezdi-i ; q++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
