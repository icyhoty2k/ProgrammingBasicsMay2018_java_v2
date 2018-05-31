package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW09PasswordGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String checkIn = input.nextLine();
        if (password.equals(checkIn)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
