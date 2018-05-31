package Lesson3LogicalProverki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW21HelpUserFindErrors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double excursion = Double.parseDouble(reader.readLine());
        Double puzzle = Double.parseDouble(reader.readLine());
        Double talkingDoll = Double.parseDouble(reader.readLine());
        Double teddyBear = Double.parseDouble(reader.readLine());
        Double minions = Double.parseDouble(reader.readLine());
        Double trucks = Double.parseDouble(reader.readLine());

        Double price = puzzle * 2.60 + talkingDoll * 3 + teddyBear * 4.10 + minions * 8.20 + trucks * 2;
        Double toys = puzzle + talkingDoll + teddyBear + minions + trucks;
        if (toys >= 50) { //gre6ka nomer 1 nqma proverka za ravno na 50
            price = price - price / 4.0;
            double rent = price / 10.0;
            double profit = price - rent;
            double rest = profit - excursion;
            if (rest >= 0) { //eto tuk e gre6ka nomer 2 ne pravish proverka ako e ravno na 0 a samo ako e po-goliamo
                System.out.printf("Yes! %.2f lv left.", rest);
            } else if (rest < 0) {
                rest = excursion - profit;
                System.out.printf("Not enough money! %.2f lv needed.", rest);
            }
        } else if (toys < 50) {
            price = price;
            double rent = price / 10.0;
            double profit = price - rent;
            double rest = profit - excursion;
            if (rest > 0) {
                System.out.printf("Yes! %.2f lv left.", rest);
            } else if (rest < 0) {
                rest = excursion - profit;
                System.out.printf("Not enough money! %.2f lv needed.", rest);
            }
        }
    }
}