package Lesson2SimpleCalculations;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW12CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double sum = Double.parseDouble(input.nextLine());
        String Valuta1, Valuta2;
        Valuta1 = input.nextLine().toUpperCase();
        Valuta2 = input.nextLine().toUpperCase();
        if (Valuta1.contentEquals("USD")) {
            sum = sum * 1.79549;
        } else if (Valuta1.contentEquals("EUR")) {
            sum = sum * 1.95583;
        } else if (Valuta1.contentEquals("GBP")) {
            sum = sum * 2.53405;
        }
        if (Valuta2.contentEquals("USD")) {
            sum = sum / 1.79549;
        } else if (Valuta2.contentEquals("EUR")) {
            sum = sum / 1.95583;
        } else if (Valuta2.contentEquals("GBP")) {
            sum = sum / 2.53405;
        }
        System.out.println(sum);
    }
}
