package Lesson8ExamPreparation;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task3SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        int a1 = Integer.parseInt(sc.nextLine());
        int sumA = a1 + (int) a;
        char b = sc.nextLine().charAt(0);
        int b1 = Integer.parseInt(sc.nextLine());
        int sumB = b1 + (int) b;
     //   System.out.println(sumB);
        char c = sc.nextLine().charAt(0);
        int c1 = Integer.parseInt(sc.nextLine());
        int sumC = c1 + (int) c;
        String winCondition = "777";
        String lossCondition = "@@@";
        String result = (char) sumA + "" + (char) sumB + "" + (char) sumC;
        if (result.equals(winCondition)) {
            System.out.println(result);
            System.out.println("*** JACKPOT ***");
        } else if (result.equals(lossCondition)) {
            System.out.println(result);
            System.out.println("!!! YOU LOSE EVERYTHING !!!");
        } else {

            System.out.println((char) sumA + "" + (char) sumB + "" + (char) sumC);
        }
    }

}

