package MiscTrainingJudge;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Training02PictureInTheWall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int holeW = Integer.parseInt(sc.nextLine());
        int holeH = Integer.parseInt(sc.nextLine());
        int picSize = Integer.parseInt(sc.nextLine());
        int picsCount = Integer.parseInt(sc.nextLine());
        int holeSize=holeH*holeW;
        int picsTotalArea=picSize*picSize*picsCount;
        if (holeSize >=picsTotalArea){
            System.out.println("The pictures fit in the hole. Hole area is "+(holeSize-picsTotalArea)+" bigger than pictures area.");
        }else{
            System.out.println("The pictures don't fit in the hole. Picture area is "+(picsTotalArea-holeSize)+" bigger than hole area.");
        }



    }

}

