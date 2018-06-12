package ProgrammingBasicsExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author icyhoty2k
 */


public class HW13Lesson8Histograma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNums = Integer.parseInt(br.readLine());
        DecimalFormatSymbols ds = new DecimalFormatSymbols();
        ds.setDecimalSeparator('.');
        // ds.setGroupingSeparator('-');
//, - grouping separator
        DecimalFormat df = new DecimalFormat("#0.00%", ds);
        int currentNum;
        double pTo199, pTo399, pTo599, pTo799, p800Plus, counter;
//        int cto199 , cTo399,cTo599 , cTo799 , c800Plus;
//        cto199=cTo399=cTo599=cTo799=c800Plus=0;
        pTo199 = pTo399 = pTo599 = pTo799 = p800Plus = counter = 0.0;
        for (int i = 0; i < inputNums; i++) {
            currentNum = Integer.parseInt(br.readLine());
            if (currentNum > 0 && currentNum <= 199) {
                pTo199++;
                //        cto199++;
            } else if (currentNum >= 200 && currentNum <= 399) {
                pTo399++;
//                cTo399++;
            } else if (currentNum >= 400 && currentNum <= 599) {
                pTo599++;
//                cTo599++;
            }
            if (currentNum >= 600 && currentNum <= 799) {
                pTo799++;
//                cTo799++;
            } else if (currentNum >= 800) {
                p800Plus++;
//                c800Plus++;
            }
            counter++;
        }

        System.out.println(df.format(pTo199 / counter));
        System.out.println(df.format(pTo399 / counter));
        System.out.println(df.format(pTo599 / counter));
        System.out.println(df.format(pTo799 / counter));
        System.out.println(df.format(p800Plus / counter));
    }
}
