package com.kishkan91.problems;

import static java.lang.Math.abs;

public class Close10 {
    //Warmup-1:
    //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the
    //event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    public int close10(int a, int b) {
        int aToTenDif = abs(10 - a);
        int bToTenDif = abs(10 - b);

        if (aToTenDif > bToTenDif) {
            return b;
        } else if (aToTenDif < bToTenDif) {
            return a;
        } else {
            return 0;
        }
    }
}
