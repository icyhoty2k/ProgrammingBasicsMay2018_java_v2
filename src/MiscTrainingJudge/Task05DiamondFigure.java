package MiscTrainingJudge;
/**
 * @author icyhoty2k
 */

//https://judge.softuni.bg/Contests/Practice/Index/233#4

//Задача 5. Диамант
//        Да се напише програма, която прочита от конзолата цяло число N и чертае диамант,
//        като в примерите по-долу. Диамантът има ширина – 5 * n колони и височина – 3 * n + 2 реда.

import java.util.Scanner;

public class Task05DiamondFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //draw the header
        System.out.print(drawFig(".", n));
        System.out.print(drawFig("*", n * 3));
        System.out.print(drawFig(".", n));
        System.out.println();

        for (int i = 1; i < n; i++) {
            System.out.print(drawFig(".",n-i));
            System.out.print(drawFig("*",1));
            System.out.print(drawFig(".",(3*n)-2+(2*i)));
            System.out.print(drawFig("*",1));
            System.out.print(drawFig(".",n-i));
            System.out.println();
        }
        System.out.print(drawFig("*" , 5*n));
        System.out.println();
        for (int i = 1; i < (2*n)+2; i++) {
            System.out.print(drawFig("." ,i ));
            if (i==(2*n)+1) {
                System.out.print(drawFig("*" ,n-2 ));
            }else{
            System.out.print(drawFig("*" ,1 ));
            System.out.print(drawFig("." ,(5*n)-((2*i)+2) ));
            System.out.print(drawFig("*" ,1 ));}
            System.out.print(drawFig("." ,i ));
            System.out.println();
        }
    }

    static String drawFig(String sym, int f) {
        String text ="";
        for (int i = 0; i < f; i++) {
            text = text + sym;
        }
        return  text;
    }

}

