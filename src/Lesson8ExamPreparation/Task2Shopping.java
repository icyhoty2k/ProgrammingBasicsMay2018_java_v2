package Lesson8ExamPreparation;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task2Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int chocolateQuantity = Integer.parseInt(sc.nextLine());
        double milkQuantity = Double.parseDouble(sc.nextLine());
        double neededMoney=0;
        double mandarini = Math.floor(chocolateQuantity*0.65);
        neededMoney= (chocolateQuantity*0.65) + (milkQuantity*2.70) + (mandarini*0.20);
        if(neededMoney <= budget){

            System.out.printf(" You got this, %.2f money left!", (budget-neededMoney));
        }
        else {
            System.out.printf("Not enough money, you need %.2f more!" ,(neededMoney-budget));
        }


    }

}

