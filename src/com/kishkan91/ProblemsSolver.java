package com.kishkan91;

import com.kishkan91.problems.*;

public class ProblemsSolver {

    void solveProblems() {

        MissingChar w1 = new MissingChar();
        System.out.println(w1.missingChar("kitten", 0));

        Close10 w2 = new Close10();
        System.out.println(w2.close10(8,13));

        Or35 w3 = new Or35();
        System.out.println(w3.or35(15));

        Makes10 w4 = new Makes10();
        System.out.println(w4.makes10(12,-2));

        EveryNth w5 = new EveryNth();
        System.out.println(w5.everyNth("Chocolate", 3));

        PosNeg w6 = new PosNeg();
        System.out.println(w6.posNeg(-4, 5, true));

        MakeBricks_Level2 wh7 = new MakeBricks_Level2();
        System.out.println(wh7.makeBricks(7,1,11));
    }
}
