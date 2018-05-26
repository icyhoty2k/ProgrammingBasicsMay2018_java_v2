package ProgrammingBasicsExam;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class Birthday01lesson2ExamZad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = 0;
        while (d < 10 || d > 500) {
            //        System.out.print("Vavedete d:");
            d = Integer.valueOf(input.nextLine());
        }
        int s = 0;
        while (s < 10 || s > 300) {
            //      System.out.print("Vavedete s:");
            s = Integer.valueOf(input.nextLine());
        }

        int x = 0;
        while (x < 10 || x > 200) {
            //     System.out.print("Vavedete x:");
            x = Integer.valueOf(input.nextLine());
        }
        double procent = -1.0;
        while (procent < 0.000 || procent > 100.000) {
            //    System.out.print("Vavedete procent:");
            procent = Double.valueOf(input.nextLine());
        }
        Double obem = d * s * x * 0.001;
        Double krai = Double.valueOf(obem) * (1 - procent * 0.01);
        //   System.out.println(obem);
        System.out.printf("%.3f", krai);
    }
}
