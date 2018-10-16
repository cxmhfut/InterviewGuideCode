package chapter8;

import org.junit.Test;

public class Chapter8TestCase {

    @Test
    public void testPrintMatrix(){
        int m[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        PrintMatrix.spiralOrderPrint(m);
    }

    @Test
    public void testPrintMatrix2(){
        int m[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        PrintMatrix.spiralOrderPrint(m);
        System.out.println();
        System.out.println(PrintMatrix.getSpiralOrderPrintArray(m).toString());
    }
}
