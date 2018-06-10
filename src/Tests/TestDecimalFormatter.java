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
//    Symbol	Location	Localized?	Meaning
//        0	Number	Yes	Digit
//        #	Number	Yes	Digit, zero shows as absent
//        .	Number	Yes	Decimal separator or monetary decimal separator
//        -	Number	Yes	Minus sign
//        ,	Number	Yes	Grouping separator
//        E	Number	Yes	Separates mantissa and exponent in scientific notation. Need not be quoted in prefix or suffix.
//        ;	Subpattern boundary	Yes	Separates positive and negative subpatterns
//        %	Prefix or suffix	Yes	Multiply by 100 and show as percentage
//        \u2030	Prefix or suffix	Yes	Multiply by 1000 and show as per mille value
//        ¤ (\u00A4)	Prefix or suffix	No	Currency sign, replaced by currency symbol. If doubled, replaced by international currency symbol. If present in a pattern, the monetary decimal separator is used instead of the decimal separator.
//        '	Prefix or suffix	No	Used to quote special characters in a prefix or suffix, for example, "'#'#" formats 123 to "#123". To create a single quote itself, use two in a row: "# o''clock".