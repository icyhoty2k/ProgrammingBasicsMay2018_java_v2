package Lesson8ExamPreparation;

/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task1PCStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double processorUSD =Double.parseDouble(sc.nextLine());
        double vgaUSD =Double.parseDouble(sc.nextLine());
        double ramUSD =Double.parseDouble(sc.nextLine());
        int ramQuantity = Integer.parseInt(sc.nextLine());
        double discountPercentage =Double.parseDouble(sc.nextLine()); //0.01-0.1
        double dollarChange=1.57;
        double sum =0.0;
        sum=processorUSD+vgaUSD;
            sum=sum*(1-discountPercentage);
                sum=sum+(ramUSD*ramQuantity);
                                sum=sum*dollarChange;
        System.out.printf("Money needed - %.2f leva." , sum );
    }

}

