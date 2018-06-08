package Lesson4ComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW11Cinema {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type = br.readLine().toLowerCase();
        int rows, cols;
        rows = Integer.parseInt(br.readLine());
        cols = Integer.parseInt(br.readLine());
//        •	Premiere – премиерна прожекция, на цена 12.00 лева.
//        •	Normal – стандартна прожекция, на цена 7.50 лева.
//        •	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        switch (type) {
            case "premiere": {
                System.out.printf("%.2f leva", rows * cols * 12.00);
                break;
            }
            case "normal": {
                System.out.printf("%.2f leva", rows * cols * 7.50);
                break;
            }
            case "discount": {
                System.out.printf("%.2f leva", rows * cols * 5.00);
                break;
            }
        }

    }
}
