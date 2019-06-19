package com.kishkan91;

import com.kishkan91.problems.Close10;
import com.kishkan91.problems.Makes10;
import com.kishkan91.problems.MissingChar;
import com.kishkan91.problems.Or35;

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
    }
}
