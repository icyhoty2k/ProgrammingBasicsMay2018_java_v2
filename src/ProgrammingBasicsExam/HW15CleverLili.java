package ProgrammingBasicsExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * @author icyhoty2k
 */


public class HW15CleverLili {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormatSymbols ds = new DecimalFormatSymbols(Locale.ENGLISH);
        DecimalFormat df = new DecimalFormat("#.00", ds);
        int vazrast = Integer.parseInt(br.readLine());
        double cenaPeralnia = Double.parseDouble(br.readLine());
        double cenaIgra4ki = Double.parseDouble(br.readLine());
        int countIgra4ki, countPari;
        countIgra4ki = 0;
        double totalSum = 0.0;
        countPari = 10 - 1;
        for (int i = 1; i <= vazrast; i++) {
            if (i % 2 == 0 && i != 2) {
                totalSum += countPari;
                countPari += 10;

            } else if (i != 2) {
                countIgra4ki++;
            }
        }
//        System.out.println(countPari);
//        System.out.println(countIgra4ki);
//        System.out.println(countIgra4ki*cenaIcra4ki);
//        System.out.println(totalSum);
        totalSum = totalSum + (countIgra4ki * cenaIgra4ki);
        if ((totalSum - cenaPeralnia) >= 0) {
            System.out.println("Yes! " + df.format(totalSum - cenaPeralnia));
        } else {
            System.out.println(("No! " + df.format(cenaPeralnia - totalSum)));
        }

    }
}
