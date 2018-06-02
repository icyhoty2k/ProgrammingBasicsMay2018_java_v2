package LessonIVComplexLogicalProverki;

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
        switch (currentType) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes": {
                System.out.println("fruit");
                break;
            }
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot": {
                System.out.println("vegetable");
                break;
            }
            default: {
                System.out.println("unknown");
            }
        }
    }
}
