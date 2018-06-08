package Lesson4ComplexLogicalProverki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author icyhoty2k
 */


public class HW06PointInRectangleBorder {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        double x1, y1, x2, y2, x, y;
        x1 = Double.parseDouble(scan.readLine());
        y1 = Double.parseDouble(scan.readLine());
        x2 = Double.parseDouble(scan.readLine());
        y2 = Double.parseDouble(scan.readLine());
        x = Double.parseDouble(scan.readLine());
        y = Double.parseDouble(scan.readLine());
        boolean onLeftSide = (x == x1 && y >= y1 && y <= y2);
        boolean onRightSide = (x == x2 && y >= y1 && y <= y2);
        boolean onUpSide = (y == y1) && (x >= x1) && (x <= x2);
        boolean onDownSide = (y == y2) && (x >= x1) && (x <= x2);
        if (onLeftSide || onRightSide || onUpSide || onDownSide) {
            System.out.println("Border");


        } else {
            System.out.println("Inside / Outside");
        }

    }
}
