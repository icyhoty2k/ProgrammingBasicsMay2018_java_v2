package Lesson4ComplexLogicalProverki;

import java.util.Scanner;

/**
 * @author icyhoty2k
 */
//        •	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
//        •	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
//        •	Всички останали са "unknown"


public class HW04FruitOrVegetable {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        String currentType = consoleInput.nextLine().toLowerCase();
        if (currentType.equals("banana") ||
                currentType.equals("apple") ||
                currentType.equals("kiwi") ||
                currentType.equals("cherry") ||
                currentType.equals("lemon") ||
                currentType.equals("grapes")) {
            System.out.println("fruit");
        } else if (currentType.equals("tomato") ||
                currentType.equals("cucumber") ||
                currentType.equals("pepper") ||
                currentType.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}

