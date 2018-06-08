package Lesson4ComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

/**
 * @author icyhoty2k
 */


public class HW10AnimalType {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String animal = br.readLine().toLowerCase();
//•	dog -> mammal
//•	crocodile, tortoise, snake -> reptile
//•	others -> unknown

        switch (animal) {
            case "dog": {
                System.out.println("mammal");
                break;
            }
            case "crocodile": {
                // System.out.println("reptile");
            }
            case "tortoise": {
                //  System.out.println("reptile");
            }
            case "snake": {
                System.out.println("reptile");
                break;
            }
            default: {
                System.out.println("unknown");
            }

        }
    }
}
