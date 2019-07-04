package com.kishkan91;

import com.kishkan91.problems.*;

public class ProblemSolver {

    void solveProblems() {

        MissingChar w1 = new MissingChar();
        System.out.println("MissingChar:  " + w1.missingChar("kitten", 1));

        Close10 w2 = new Close10();
        System.out.println("Close10:  " + w2.close10(8, 13));

        Or35 w3 = new Or35();
        System.out.println("Or35:  " + w3.or35(13));

        Makes10 w4 = new Makes10();
        System.out.println("Makes10:  " + w4.makes10(12, 10));

        EveryNth w5 = new EveryNth();
        System.out.println("EveryNth:  " + w5.everyNth("Chocolate", 3));

        PosNeg w6 = new PosNeg();
        System.out.println("PosNeg:  " + w6.posNeg(-4, 5, false));

        MakeBricksLevel2 wh7 = new MakeBricksLevel2();
        System.out.println("MakeBricksLevel2:  " + wh7.makeBricks(7, 1, 11));

        DoubleCharLevel2 wh8 = new DoubleCharLevel2();
        System.out.println("DoubleCharLevel2:  " + wh8.doubleChar("Hi-There!"));

        CountYZLevel3 wvh9 = new CountYZLevel3();
        System.out.println("CountYZLevel3:  " + wvh9.countYZ("willz thiz code actually work--one will askz?"));

        GHappyLevel3 wvh10 = new GHappyLevel3();
        System.out.println("GHappyLevel3:  " + wvh10.gHappy("g"));
    }
}