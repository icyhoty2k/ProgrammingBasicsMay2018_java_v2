package Lesson3LogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */


public class HW16Number0to100word {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        int number = Integer.parseInt(consoleInput.nextLine());
        String wordNum = "";
        if (number < 20) {
            switch (number) {
                case 0: {
                    System.out.println("zero");
                    break;
                }
                case 1: {
                    System.out.println("one");
                    break;
                }
                case 2: {
                    System.out.println("two");
                    break;
                }
                case 3: {
                    System.out.println("three");
                    break;
                }
                case 4: {
                    System.out.println("four");
                    break;
                }
                case 5: {
                    System.out.println("five");
                    break;
                }
                case 6: {
                    System.out.println("six");
                    break;
                }
                case 7: {
                    System.out.println("seven");
                    break;
                }
                case 8: {
                    System.out.println("eight");
                    break;
                }
                case 9: {
                    System.out.println("nine");
                    break;
                }
                case 10: {
                    System.out.println("ten");
                    break;
                }
                case 11: {
                    System.out.println("eleven");
                    break;
                }
                case 12: {
                    System.out.println("twelve");
                    break;
                }
                case 13: {
                    System.out.println("therteen");
                    break;
                }
                case 14: {
                    System.out.println("fourteen");
                    break;
                }
                case 15: {
                    System.out.println("fifteen");
                    break;
                }
                case 16: {
                    System.out.println("sixteen");
                    break;
                }
                case 17: {
                    System.out.println("seventeen");
                    break;
                }
                case 18: {
                    System.out.println("eighteen");
                    break;
                }
                case 19: {
                    System.out.println("nineteen");
                    break;
                }
                default: {
                    System.out.println("invalid number");
                }
            }
        } else if (number > 20) {
            int tens = number / 10;
            switch (tens) {
                case 20: {
                    wordNum = "twenty";
                    break;
                }
                case 2: {
                    wordNum = "twenty";
                    break;
                }
                case 3: {
                    wordNum = "thirty";
                    break;
                }
                case 4: {
                    wordNum = "forty";
                    break;
                }
                case 5: {
                    wordNum = "fifty";
                    break;
                }
                case 6: {
                    wordNum = "sixty";
                    break;
                }
                case 7: {
                    wordNum = "seventy";
                    break;
                }
                case 8: {
                    wordNum = "eighty";
                    break;
                }
                case 9: {
                    wordNum = "ninety";
                    break;
                }
                case 10: {
                    wordNum = "one hundred";
                    break;
                }
            }
            int ones = number % 10;
            switch (ones) {
                case 1:
                    wordNum = wordNum + " one";
                    break;
                case 2:
                    wordNum = wordNum + " two";
                    break;
                case 3:
                    wordNum = wordNum + " three";
                    break;
                case 4:
                    wordNum = wordNum + " four";
                    break;
                case 5:
                    wordNum = wordNum + " five";
                    break;
                case 6:
                    wordNum = wordNum + " six";
                    break;
                case 7:
                    wordNum = wordNum + " seven";
                    break;
                case 8:
                    wordNum = wordNum + " eight";
                    break;
                case 9:
                    wordNum = wordNum + " nine";
                    break;
            }
        } else {
            System.out.println("invalid number");
        }
        System.out.println(wordNum);
    }
}
