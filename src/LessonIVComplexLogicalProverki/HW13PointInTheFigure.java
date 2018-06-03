package LessonIVComplexLogicalProverki;

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
        if (y == 0 && x <= h * 3) {
            boolean onBottomBorder = true;
        } else if (x == 0 && y <= h) {
            boolean onLeftBorder = true;
        } else if (x == h * 3 && y <= h) {
            boolean onRightBorder = true;

        } else if (y == h * 4 && x >= h && x <= 2 * h) {
            boolean onUpperBorder = true;

        }

    }
}
