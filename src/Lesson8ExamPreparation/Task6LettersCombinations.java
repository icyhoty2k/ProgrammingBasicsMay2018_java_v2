package Lesson8ExamPreparation;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task6LettersCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b, c;
        a = sc.nextLine().charAt(0);
        b = sc.nextLine().charAt(0);
        c = sc.nextLine().charAt(0);
        int start, finish, excluding;
        start = (int) a;
        finish = (int) b;
        excluding = (int) c;
        int counter = 0;
        String str = "";
        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                for (int k = start; k <= finish; k++) {
                    if (k != excluding && i != excluding && j != excluding) {
                        counter++;
                        str = str + ((char) i + "" + (char) j + "" + (char) k + "") + " ";
                    }
                }
            }
        }
        System.out.println(str + counter);

    }

}

