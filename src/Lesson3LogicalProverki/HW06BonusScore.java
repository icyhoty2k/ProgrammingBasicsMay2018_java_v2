package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW06BonusScore {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int points = Integer.parseInt(consoleInput.nextLine());
        Double bonus = 0.0;
        if (points <= 100) {
            bonus = 5.0;
        } else if (points > 100 && points < 1000) {
            bonus = points * 0.2;
        } else if (points > 1000) {
            bonus = points * 0.1;

        }
        if (points % 2 == 0) {
            bonus += 1;
        }
        if (points % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(points + bonus);
    }


}
