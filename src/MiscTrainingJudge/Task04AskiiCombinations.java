package MiscTrainingJudge;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task04AskiiCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char na;
        int sumazMalki, sumAZglavni, digits, symbols;
        sumazMalki = sumAZglavni = digits = symbols = 0;
        String sMalki, sGlavni, sDigits, sSymbols;
        sMalki = sGlavni = sDigits = sSymbols = "";
        for (int i = 0; i < n; i++) {
            na = sc.nextLine().charAt(0);
            if (na >= 'a' && na <= 'z') {
                sumazMalki = sumazMalki + (int) na;
                sMalki = sMalki + na;
            } else if (na >= 'A' && na <= 'Z') {
                sumAZglavni = sumAZglavni + (int) na;
                sGlavni = sGlavni + na;
            } else if (na >= '0' && na <= '9') {
                digits = digits + (int) na;
                sDigits = sDigits + na;
            } else {
                symbols = symbols + (int) na;
                sSymbols = sSymbols + na;
            }

        }
        int max = 0;
        if (max <= sumazMalki) {
            max = sumazMalki;
            if (max <= sumAZglavni) {
                max = sumAZglavni;
            }
            if (max <= digits) {
                max = digits;
            }
            if (max <= symbols) {
                max = symbols;
            }
        }
        if (max == sumazMalki){
            System.out.println("Biggest ASCII sum is:"+max);
            System.out.println("Combination of characters is:"+sMalki);}
        else if (max == sumAZglavni){
            System.out.println("Biggest ASCII sum is:"+max);
            System.out.println("Combination of characters is:"+sGlavni);}
        else if (max == digits){
            System.out.println("Biggest ASCII sum is:"+max);
            System.out.println("Combination of characters is:"+sDigits);}
        else {
            System.out.println("Biggest ASCII sum is:"+max);
            System.out.println("Combination of characters is:"+sSymbols);
        }
    }

}

