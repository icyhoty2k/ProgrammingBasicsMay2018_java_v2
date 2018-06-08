package Lesson4ComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW13PointInTheFigure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h, x, y;
        boolean inSide, outSide, onBorder;
        inSide = outSide = onBorder = false;
        h = Integer.parseInt(br.readLine());
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        boolean insideHorizontalRect = (x > 0 && x < 3 * h && y > 0 && y < h);
        boolean insideVerticalRect = (x > h && x < 2 * h && y > 0 && y < 4 * h);
        boolean outsideHorizontalRect = (x < 0 || x > 3 * h || y < 0 || y > h);
        boolean outsideVerticalRect = (x < h || x > 2 * h || y < 0 && y > 4 * h);
        if (insideHorizontalRect || insideVerticalRect) {
            System.out.println("inside");
        } else if (outsideHorizontalRect && outsideVerticalRect) {
            System.out.println("outside");
        } else {
            System.out.println("border");
        }

    }
}
