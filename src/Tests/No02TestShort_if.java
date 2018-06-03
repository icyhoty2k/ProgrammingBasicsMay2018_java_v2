package Tests;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * @author icyhoty2k
 */


public class No02TestShort_if {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);
        String izbor = "0";
        while (true) {
            System.out.println("for Start of  program  = any key/string");
            System.out.println("for Exit type  = 1");
            izbor = scan.nextLine();
            if (izbor.equals("1")) {
                System.out.println("Exiting program ....");
                sleep(250);
                break;
            }
            System.out.print("Enter first int:");
            int x = Integer.parseInt(scan.nextLine());
            System.out.print("Enter second int:");
            int y = Integer.parseInt(scan.nextLine());
//        int x = 5;
//        int y = 2;
            int greater = (x > y) ? x : y;
//        if (x>y){
//            greater =x;
//        }else if(y>x){
//            greater = y;
//        }
            System.out.println("The number \" " + greater + " \" is bigger");
        }
    }
}
