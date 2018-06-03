package Tests;

/**
 * @author icyhoty2k
 */


public class BooleansTests {
    public static void main(String[] args) {
        boolean tr, tr2, fe, fe2;
        tr = tr2 = true;
        fe = fe2 = false;

        int count, countAnd, countXor;
        count = countAnd = countXor = 0;
        boolean fetr = (fe || tr);
        boolean fefe = (fe || fe);
        boolean trtr = (tr || tr);
        boolean trfe = (tr || fe);
        boolean fetr2 = (fe && tr);
        boolean fefe2 = (fe && fe);
        boolean trtr2 = (tr && tr);
        boolean trfe2 = (tr && fe);
        boolean fetr3 = (fe ^ tr);
        boolean fefe3 = (fe ^ fe);
        boolean trtr3 = (tr ^ tr);
        boolean trfe3 = (tr ^ fe);
        System.out.println("OR expression(||):");
        System.out.print("1.False,True=" + (fe || tr));
        if (fetr) {
            count += 1;
        }
        ;
        System.out.print(" 2.False,False=" + (fe || fe));
        if (fefe) {
            count += 1;
        }
        System.out.print(" 3.True,True=" + (tr || tr));
        if (trtr) {
            count += 1;
        }
        System.out.print(" 4.True,False=" + (tr || fe));
        if (trfe) {
            count += 1;
        }

        System.out.println(" ------->TRUE is " + count + " times out of 4");

        System.out.println("AND expression(&&):");
        System.out.print("1.False,True=" + (fe && tr));
        if (fetr2) {
            countAnd += 1;
        }
        ;
        System.out.print(" 2.False,False=" + (fe && fe));
        if (fefe2) {
            countAnd += 1;
        }
        System.out.print(" 3.True,True=" + (tr && tr));
        if (trtr2) {
            countAnd += 1;
        }
        System.out.print(" 4.True,False=" + (tr && fe));
        if (trfe2) {
            countAnd += 1;
        }

        System.out.println(" ------->TRUE is " + countAnd + " times out of 4");


        System.out.println("XOR expression(^):");
        System.out.print("1.False,True=" + (fe ^ tr));
        if (fetr3) {
            countXor += 1;
        }
        ;
        System.out.print(" 2.False,False=" + (fe ^ fe));
        if (fefe3) {
            countXor += 1;
        }
        System.out.print(" 3.True,True=" + (tr ^ tr));
        if (trtr3) {
            countXor += 1;
        }
        System.out.print(" 4.True,False=" + (tr ^ fe));
        if (trfe3) {
            countXor += 1;
        }

        System.out.println(" ------->TRUE is " + countXor + " times out of 4");
        System.out.println("NOT(!) : BOOLEAN EXPRESSION --- > just makes the oposite ---> 1=0 , 0=1");

    }
}
