package Lesson4ComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW12Volleyball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String typeYear = br.readLine().toLowerCase();
        int praznik = Integer.parseInt(br.readLine());
        int goneToTheWildWest = Integer.parseInt(br.readLine());
        double gamesPlayed = 48;
        gamesPlayed = gamesPlayed - goneToTheWildWest;
        gamesPlayed = gamesPlayed * 0.75;
        double playPraznik = praznik * 2.0 / 3.0;
        gamesPlayed = gamesPlayed + playPraznik + goneToTheWildWest;
        //   System.out.println(gamesPlayed);
        if (typeYear.equals("leap")) {
            gamesPlayed *= 1.15;
            System.out.println(Math.floor(gamesPlayed));
        } else if (typeYear.equals("normal")) {
            System.out.println(Math.floor(gamesPlayed));

        }


    }
}
