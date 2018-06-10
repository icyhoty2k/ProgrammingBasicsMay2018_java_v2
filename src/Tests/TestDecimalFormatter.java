package Tests;

import java.text.DecimalFormat;

/**
 * @author icyhoty2k
 */


public class TestDecimalFormatter {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");
        DecimalFormat df2 = new DecimalFormat("##,##.#");
        double d = 3.1415;
        double e = 1215.1;
        System.out.println(df.format(d));
        System.out.println(df.format(e));
        System.out.println(df2.format(e));
    }
}
