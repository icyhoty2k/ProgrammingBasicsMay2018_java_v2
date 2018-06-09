package Tests;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class Test02CharsAtString {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String s = consoleInput.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }
    }
}
