package LessonIVComplexLogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */

//град / продукт	coffee	water	beer	sweets	peanuts
//        Sofia	0.50	0.80	1.20	1.45	1.60
//        Plovdiv	0.40	0.70	1.15	1.30	1.50
//        Varna	0.45	0.70	1.10	1.35	1.55


public class HW02SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product, city;
        product = scan.nextLine().toLowerCase();
        city = scan.nextLine().toLowerCase();
        Double quantity = Double.parseDouble(scan.nextLine());
        Double totalPrice = 0.0;
        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                totalPrice = 0.5 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("water")) {
                totalPrice = 0.8 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("beer")) {
                totalPrice = 1.2 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("sweets")) {
                totalPrice = 1.45 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("peanuts")) {
                totalPrice = 1.6 * quantity;
                System.out.println(totalPrice);
            }
        }

        if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                totalPrice = 0.4 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("water")) {
                totalPrice = 0.7 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("beer")) {
                totalPrice = 1.15 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("sweets")) {
                totalPrice = 1.30 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("peanuts")) {
                totalPrice = 1.50 * quantity;
                System.out.println(totalPrice);
            }
        }
        if (city.equals("varna")) {
            if (product.equals("coffee")) {
                totalPrice = 0.45 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("water")) {
                totalPrice = 0.7 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("beer")) {
                totalPrice = 1.10 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("sweets")) {
                totalPrice = 1.35 * quantity;
                System.out.println(totalPrice);
            } else if (product.equals("peanuts")) {
                totalPrice = 1.55 * quantity;
                System.out.println(totalPrice);
            }
        }
    }
}
