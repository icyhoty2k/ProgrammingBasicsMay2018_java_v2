package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW11EqualWords {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String word1 = consoleInput.nextLine().toLowerCase();
        String word2 = consoleInput.nextLine().toLowerCase();
        if (word1.equals(word2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
