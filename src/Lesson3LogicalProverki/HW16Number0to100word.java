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
                    wordNum = "zero";
                    break;
                }
                case 1: {
                    wordNum = "one";
                    break;
                }
                case 2: {
                    wordNum = "two";
                    break;
                }
                case 3: {
                    wordNum = "three";
                    break;
                }
                case 4: {
                    wordNum = "four";
                    break;
                }
                case 5: {
                    wordNum = "five";
                    break;
                }
                case 6: {
                    wordNum = "six";
                    break;
                }
                case 7: {
                    wordNum = "seven";
                    break;
                }
                case 8: {
                    wordNum = "eight";
                    break;
                }
                case 9: {
                    wordNum = "nine";
                    break;
                }
                case 10: {
                    wordNum = "ten";
                    break;
                }
                case 11: {
                    wordNum = "eleven";
                    break;
                }
                case 12: {
                    wordNum = "twelve";
                    break;
                }
                case 13: {
                    wordNum = "thirteen";
                    break;
                }
                case 14: {
                    wordNum = "fourteen";
                    break;
                }
                case 15: {
                    wordNum = "fifteen";
                    break;
                }
                case 16: {
                    wordNum = "sixteen";
                    break;
                }
                case 17: {
                    wordNum = "seventeen";
                    break;
                }
                case 18: {
                    wordNum = "eighteen";
                    break;
                }
                case 19: {
                    wordNum = "nineteen";
                    break;
                }
                case 20: {
                    wordNum = "twenty";
                    break;
                }
                default: {
                    wordNum = "invalid number";
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
            wordNum = "invalid number";
        }
        System.out.println(wordNum);
    }
}
