package MiscTrainingJudge;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Training01_Hearthstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int restTime = Integer.parseInt(sc.nextLine());
        double packPrice = Double.parseDouble(sc.nextLine());
        double questPrice = Double.parseDouble(sc.nextLine());
        double coffeePrice = Double.parseDouble(sc.nextLine());
        double totalPrice = (packPrice*3)+(questPrice*2)+coffeePrice;
        System.out.printf("%.2f",totalPrice);
        System.out.println();
        restTime=restTime-5;
        restTime=restTime-((3*2)+(2*2));
        System.out.println(restTime);
    }

}

