package SoftUniExam7_7_18;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class ExamTask05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    static String repeatChar(String sym, int times) {
        String text = "";
        for (int i = 0; i < times; i++) {
            text=text+sym;
        }
        return text;
    }
}

