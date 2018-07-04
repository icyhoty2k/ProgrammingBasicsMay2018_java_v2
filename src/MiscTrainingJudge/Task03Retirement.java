package MiscTrainingJudge;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task03Retirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender;
        gender = sc.nextLine();
        int age, trudStaj;
        age = Integer.parseInt(sc.nextLine());
        trudStaj = Integer.parseInt(sc.nextLine());
        switch (gender) {
            case "male": {
                if (age >= 64 && trudStaj >= 38) {
                    System.out.println("Ready to retire at " + age + " and " + trudStaj + " years of experience!");
                } else if (age < 64 && trudStaj >= 38) {
                    System.out.println("Worked enough, but not old enough. Years left to retirement: " + (64 - age) + ".");
                } else if (age >= 64 && trudStaj < 38) {
                    System.out.println("Old enough, but haven't worked enough. Work experience left to retirement: " + (38 - trudStaj) + ".");
                }
                break;
            }
            case "female": {
                if (age >= 61 && trudStaj >= 35) {
                    System.out.println("Ready to retire at " + age + " and " + trudStaj + " years of experience!");
                } else if (age < 61 && trudStaj >= 35) {
                    System.out.println("Worked enough, but not old enough. Years left to retirement: " + (61 - age) + ".");
                } else if (age >= 61 && trudStaj < 35) {
                    System.out.println("Old enough, but haven't worked enough. Work experience left to retirement: " + (35 - trudStaj) + ".");
                }
                break;
            }
            default: {
                System.out.println("Invalid input.");
            }
        }

    }

}

