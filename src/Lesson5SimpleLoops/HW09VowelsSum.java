package Lesson5SimpleLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW09VowelsSum {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int sum = 0;
        String word = consoleInput.nextLine().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
//            System.out.println(word.length()+" - "+i);
            switch (word.charAt(i)) {
//                буква	a	e	i	o	u
//                стойност	1	2	3	4	5

                case 'a': {
                    sum += 1;
                    break;
                }
                case 'e': {
                    sum += 2;
                    break;
                }
                case 'i': {
                    sum += 3;
                    break;
                }
                case 'o': {
                    sum += 4;
                    break;
                }
                case 'u': {
                    sum += 5;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
