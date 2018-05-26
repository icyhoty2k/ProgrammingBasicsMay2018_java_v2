package ProgrammingBasicsExam;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class TailOringWorkshop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int broiMasi = -1;
        Double masaDaljina = -1.00;
        Double masaShirina = -1.00;
        Double cenaPokrivkiUSD = 7.00;
        Double cenaKaretaUSD = 9.00;
        Double USDtoLV = 1.85;

        while (broiMasi < 0 || broiMasi > 500) {
            System.out.print("Vavedi broi masi : ");
            broiMasi = Integer.valueOf(input.nextLine());
        }
        while (true) {
            if (!(masaDaljina < 0.00) && !(masaDaljina > 3.00)) break;
            System.out.print("Vavedi Daljina na masata : ");
            masaDaljina = Double.valueOf(input.nextLine());
        }
        while ((masaShirina < 0.00) || (masaShirina > 3.00)) {
            System.out.print("Vavedi shirina na masata : ");
            try {
                masaShirina = Double.valueOf(input.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            }
        }
        Double obstom2Pokrivki = broiMasi * (masaDaljina + 2 * 0.30) * (masaShirina + 2 * 0.30);
        System.out.println(obstom2Pokrivki);
        //5 броя * (1.00 + 2 * 0.30) * (0.5 + 2 * 0.30) = 8.80 кв. метра
        Double obstom2Kareta = broiMasi * (masaDaljina / 2) * (masaDaljina / 2);
        System.out.println(obstom2Kareta);
//        Общата площ на каретата  е:
//        5 броя * (1.00 /2 ) * (1.00 / 2) = 1.25 кв. метра
        Double priceDollars = (obstom2Pokrivki * cenaPokrivkiUSD) + (obstom2Kareta * cenaKaretaUSD);
        System.out.printf("%.2f USD", priceDollars);
        System.out.println();
        Double priceLeva = priceDollars * USDtoLV;
        System.out.printf("%.2f BGN", priceLeva);

    }
}
