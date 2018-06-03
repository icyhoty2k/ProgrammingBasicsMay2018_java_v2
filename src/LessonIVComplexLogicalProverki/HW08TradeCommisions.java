package LessonIVComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW08TradeCommisions {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city = br.readLine().toLowerCase();
        double profit = Double.parseDouble(br.readLine());
        double commision = 0.0;
        boolean unknownCity = false;
        switch (city) {
            case "sofia": {
                if (profit >= 0 && profit <= 500) {
                    commision = profit * .05;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 500 && profit <= 1000) {
                    commision = profit * .07;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 1000 && profit <= 10000) {
                    commision = profit * .08;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 10000) {
                    commision = profit * .12;
                    System.out.printf("%.2f", commision);
                    break;
                }

            }
            case "varna": {
                if (profit >= 0 && profit <= 500) {
                    commision = profit * .045;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 500 && profit <= 1000) {
                    commision = profit * .075;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 1000 && profit <= 10000) {
                    commision = profit * .1;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 10000) {
                    commision = profit * .13;
                    System.out.printf("%.2f", commision);
                    break;
                }
            }
            case "plovdiv": {
                if (profit >= 0 && profit <= 500) {
                    commision = profit * .055;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 500 && profit <= 1000) {
                    commision = profit * .08;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 1000 && profit <= 10000) {
                    commision = profit * .12;
                    System.out.printf("%.2f", commision);
                    break;
                } else if (profit > 10000) {
                    commision = profit * .145;
                    System.out.printf("%.2f", commision);
                    break;
                }
            }
            default: {
                unknownCity = true;
                break;
            }
        }
        if (profit < 0 || unknownCity) {
            System.out.println("error");
        }

    }
}

