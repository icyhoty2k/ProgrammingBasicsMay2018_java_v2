package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW07SumatorSecundi {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int p1, p2, p3;
        p1 = Integer.valueOf(consoleInput.nextLine());
        p2 = Integer.valueOf(consoleInput.nextLine());
        p3 = Integer.valueOf(consoleInput.nextLine());
        int sumTime = p1 + p2 + p3;
        int min = 0;
        int sec = 0;
        if (sumTime > 59) {
            min = sumTime / 60;
            sec = sumTime % 60;


        } else {
            sec = sumTime;
        }

        if (sec <= 9) {
            System.out.println(min + ":0" + sec);
        } else {
            System.out.println(min + ":" + sec);
        }
    }
}