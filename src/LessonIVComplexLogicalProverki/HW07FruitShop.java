package LessonIVComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW07FruitShop {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fruit, day;
        double quantity;
        fruit = br.readLine().toLowerCase();
        day = br.readLine().toLowerCase();
        quantity = Double.parseDouble(br.readLine());
        boolean weekDay, weekEnd, fruitNotRecognised;
        weekDay = weekEnd = fruitNotRecognised = false;
        //Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday
        if (day.equals("monday")
                || day.equals("tuesday")
                || day.equals("wednesday")
                || day.equals("thursday")
                || day.equals("friday")) {
            weekDay = true;
        } else if (day.equals("saturday") || day.equals("sunday")) {
            weekEnd = true;
        } else {
            weekDay = weekEnd = false;
        }

        long startTime = System.nanoTime();
        switch (fruit) {
            case "banana":
                if (weekDay) {
                    System.out.println(quantity * 2.50);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * 2.70);
                    break;
                }
            case "apple":
                if (weekDay) {
                    System.out.println(quantity * 1.20);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * 1.25);
                    break;
                }
            case "orange":
                if (weekDay) {
                    System.out.println(quantity * .85);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * .90);
                    break;
                }
            case "grapefruit":
                if (weekDay) {
                    System.out.println(quantity * 1.45);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * 1.60);
                    break;
                }
            case "kiwi":
                if (weekDay) {
                    System.out.println(quantity * 2.70);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * 3.00);
                    break;
                }
            case "pineapple":
                if (weekDay) {
                    System.out.println(quantity * 5.50);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * 5.60);
                    break;
                }
            case "grapes":
                if (weekDay) {
                    System.out.println(quantity * 3.85);
                    break;
                } else if (weekEnd) {
                    System.out.println(quantity * 4.20);
                    break;
                }
            default: {
                fruitNotRecognised = true;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("StartTime nanoSecs" + startTime);
        System.out.println("EndTime nanoSecs" + endTime);
        System.out.println("Speed with \"switch-case\" statement:" + (endTime - startTime));
        if (fruitNotRecognised || weekDay && weekEnd) {
            System.out.println("error");
        }
    }
}
