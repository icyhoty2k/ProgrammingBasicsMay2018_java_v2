package Lesson5SimpleLoops;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW11OddEvenPositions {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int numbs = Integer.parseInt(consoleInput.nextLine());
        // pinpong - o for ODD ; e - for EVEN ;
        if (numbs == 0) {
            //OddSum=0, OddMin=No, OddMax=No, EvenSum=0, EvenMin=No, EvenMax=No
            System.out.println("OddSum=0,\nOddMin=No,\nOddMax=No,\nEvenSum=0,\nEvenMin=No,\nEvenMax=No");
            return; // return in a main Method ends a program , other option if not in a main method is System.exit() or System.exit(0) or System.exit(whatever)
        }

        double oddSum, oddMin, oddMax, evenSum, evenMin, evenMax;
        if (numbs == 1) {
            double number = Double.parseDouble(consoleInput.nextLine());
            oddSum = oddMax = oddMin = number;
            System.out.println("OddSum=" + oddSum + ",\nOddMin=" + oddMin + ",\nOddMax=" + oddMax + ",\nEvenSum=0,\nEvenMin=No,\nEvenMax=No");
            return;
        }
        oddSum = evenSum = 0;
        oddMin = evenMin = Integer.MAX_VALUE;
        oddMax = evenMax = Integer.MIN_VALUE;

        boolean pinpong = true;

        //Test for 0 or 1 number

        for (int i = 0; i < numbs; i++) {
            double currentNum = Double.parseDouble(consoleInput.nextLine());
            //boolean to string ,  because switch cannot work with boolean directly
            switch (pinpong + "") {
                case "true": {
                    oddSum += currentNum;
                    if (oddMin > currentNum) {
                        oddMin = currentNum;
                    }
                    if (oddMax < currentNum) {
                        oddMax = currentNum;
                    }
                    break;
                }
                case "false": {
                    evenSum += currentNum;
                    if (evenMin > currentNum) {
                        evenMin = currentNum;
                    }
                    if (evenMax < currentNum) {
                        evenMax = currentNum;
                    }
                    break;
                }
            }
            //jumping from odd to even PinPong-ing around;
            pinpong = (pinpong) ? false : true;
        }
        System.out.println("OddSum=" + oddSum + ",\nOddMin=" + oddMin + ",\nOddMax=" + oddMax + ",\nEvenSum=" + evenSum + ",\nEvenMin=" + evenMin + ",\nEvenMax=" + evenMax);
    }
}
