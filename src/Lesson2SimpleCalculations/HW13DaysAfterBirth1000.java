package Lesson2SimpleCalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW13DaysAfterBirth1000 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthday;
        birthday = LocalDate.parse(input.nextLine(), formatter);
        birthday = birthday.plusDays(999);
        System.out.println(birthday.format(formatter));
    }
}
