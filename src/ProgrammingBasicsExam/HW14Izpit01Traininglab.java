package ProgrammingBasicsExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW14Izpit01Traininglab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int izpit4as, izpitMin, pristignal4as, pristignalMin;
        izpit4as = Integer.parseInt(br.readLine());
        izpitMin = Integer.parseInt(br.readLine());
        pristignal4as = Integer.parseInt(br.readLine());
        pristignalMin = Integer.parseInt(br.readLine());

        int izpitMins, pristignalMins;
        izpitMins = (izpit4as * 60) + izpitMin;
        pristignalMins = (pristignal4as * 60) + pristignalMin;

        if (izpitMins < pristignalMins) {
            System.out.println("Late");
        } else if (izpitMins >= pristignalMins && izpitMins - pristignalMins <= 30) {
            System.out.println("On time ");
        } else if (izpitMins - pristignalMins > 30) {
            System.out.println("Early");
        }
        if ((izpitMins - pristignalMins) < 60 && (izpitMins - pristignalMins) >= 10) {
            System.out.println((izpitMins - pristignalMins) + " minutes before the start");
        }
        if ((izpitMins - pristignalMins) > 0) {
            int timeDiffH = (izpitMins - pristignalMins) / 60;
            int timeDiffm = (izpitMins - pristignalMins) % 60;
            if (timeDiffm <= 9 && timeDiffH < 1) {
                System.out.println(timeDiffm + " minutes before the start");

            } else if (timeDiffm <= 9 && timeDiffH > 0) {
                System.out.println(timeDiffH + ":0" + timeDiffm + " hours before the start");

            } else if (timeDiffm > 9 && timeDiffH > 0) {
                System.out.println(timeDiffH + ":" + timeDiffm + " hours before the start");
            }
        }
        if ((izpitMins - pristignalMins) < 0 && (izpitMins - pristignalMins) > -10) {
            System.out.println("0" + (pristignalMins - izpitMins) + " minutes after the start");
        } else if ((izpitMins - pristignalMins) <= -10 && (izpitMins - pristignalMins) > -60) {
            System.out.println((pristignalMins - izpitMins) + " minutes after the start");
        } else if ((izpitMins - pristignalMins) <= -60) {
            int timeDiffH = (pristignalMins - izpitMins) / 60;
            int timeDiffm = (pristignalMins - izpitMins) % 60;
            System.out.println(timeDiffH + ":" + timeDiffm + " hours after the start");
        }

    }
}

