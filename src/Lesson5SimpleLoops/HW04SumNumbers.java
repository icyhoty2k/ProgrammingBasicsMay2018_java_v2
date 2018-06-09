package Lesson5SimpleLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW04SumNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean parsable = true;
        int nums, sum;
        nums = sum = 0;
        do {
            try

            {

                nums = Integer.parseInt(br.readLine());

            } catch (NumberFormatException | IOException exeption) {
                System.out.println(exeption);
                System.out.println("Грешно въведено число ,опитайте отново");
                parsable = false;
            }
        } while (parsable == false);
        for (int i = 0; i < nums; i++) {
            int chislo = Integer.parseInt(br.readLine());
            sum += chislo;

        }
        System.out.println(sum);

    }
}