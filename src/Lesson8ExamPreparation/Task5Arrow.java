package Lesson8ExamPreparation;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task5Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        n = n + 5;
        int width = (n - 1) / 2;
        System.out.print(printSymbol("_", width));
        System.out.print("^");
        System.out.print(printSymbol("_", width));
        // red 2
        System.out.println();
        System.out.print(printSymbol("_", width - 1));
        System.out.print("/|\\");
        System.out.print(printSymbol("_", width - 1));
        System.out.println();
        int qty = width - 2;
        int s = 0;
        for (int i = 0; i < (n - 5) / 2; i++) {
            System.out.print(printSymbol("_", qty));
            System.out.print("/");
            System.out.print(printSymbol(".", s));
            System.out.print("|||");
            System.out.print(printSymbol(".", s));
            System.out.print("\\");
            System.out.print(printSymbol("_", qty));
            qty--;
            s++;
            System.out.println();
        }
        int na = n;
        int nb = n - 5;

        System.out.print(printSymbol("_", (na - 9) / 2));
        System.out.print("/..|||..\\");
        System.out.print(printSymbol("_", (na - 9) / 2));
        System.out.println();
        System.out.print(printSymbol("_", (na - 7) / 2));
        System.out.print("/.|||.\\");
        System.out.print(printSymbol("_", (na - 7) / 2));
        System.out.println();
        for (int i = 0; i < n - 5; i++) {
            System.out.print(printSymbol("_", (nb / 2) + 1));
            System.out.print("|||");
            System.out.print(printSymbol("_", (nb / 2) + 1));
            System.out.println();
        }
        System.out.print(printSymbol("_", (nb / 2) + 1));
        System.out.print("~~~");
        System.out.print(printSymbol("_", (nb / 2) + 1));
        System.out.println();
        for (int i = 0; i < nb/2; i++) {
            System.out.print(printSymbol("_",((n-4-1)/2)-i ));
            System.out.print("//");
            System.out.print(printSymbol(".",i));
            System.out.print("!");
            System.out.print(printSymbol(".",i));
            System.out.print("\\\\");
            System.out.print(printSymbol("_",((n-4-1)/2)-i));
            System.out.println();

        }
    }

//    Входът е цяло, четно число n в интервала [4…60].

    static String printSymbol(String Symbol, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + Symbol;
        }
        return text;
    }
}

