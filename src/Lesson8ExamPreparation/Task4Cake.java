package Lesson8ExamPreparation;
/**
 * @author icyhoty2k
 */

import java.util.Scanner;

public class Task4Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nH = Integer.parseInt(sc.nextLine());
        int nW = Integer.parseInt(sc.nextLine());
        int piecesSum = nH*nW;
        while(true){
            String command =sc.nextLine();
            if (command.equals("STOP")){

                System.out.println(piecesSum+" pieces are left.");
                break;
            }
            int piecesTake =Integer.parseInt(command);
            if(piecesSum - piecesTake < 0 ){
                int requiredPieces=Math.abs(piecesSum-piecesTake);
                System.out.println("No more cake left! You need "+requiredPieces+" pieces more.");
                break;
            } else{
                piecesSum=piecesSum-piecesTake;
            }



        }


    }

}

