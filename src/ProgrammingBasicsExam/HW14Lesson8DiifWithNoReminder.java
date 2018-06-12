package ProgrammingBasicsExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author icyhoty2k
 */


public class HW14Lesson8DiifWithNoReminder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormatSymbols ds = new DecimalFormatSymbols();
        ds.setDecimalSeparator('.');
        DecimalFormat dec = new DecimalFormat("#0.00%", ds);
        int num = Integer.parseInt(br.readLine());
        double count, current, modTwo, modThree, modFour;
        count = modFour = modThree = modTwo = 0;
        for (int i = 0; i < num; i++) {
            current = Integer.parseInt(br.readLine());
            if (current % 2 == 0) {
                modTwo++;
            }
            if (current % 3 == 0) {
                modThree++;
            }
            if (current % 4 == 0) {
                modFour++;
            }
            count++;
        }

        System.out.println(dec.format(modTwo / count));
        System.out.println(dec.format(modThree / count));
        System.out.println(dec.format(modFour / count));
    }
}
