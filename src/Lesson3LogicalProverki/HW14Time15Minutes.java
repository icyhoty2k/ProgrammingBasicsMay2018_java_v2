package Lesson3LogicalProverki;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW14Time15Minutes {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int chas, minuti;

        chas = Integer.parseInt(consoleInput.nextLine());
        minuti = Integer.parseInt(consoleInput.nextLine());
        minuti += 15;
        if (minuti > 59) {
            chas = chas + 1;
            minuti = minuti - 60;
            if (chas > 23) {
                chas = 0;
            }
        }
        if (minuti >= 0 && minuti <= 9) {
            System.out.println(chas + ":0" + minuti);
        } else {
            System.out.println(chas + ":" + minuti);
        }
    }
}
