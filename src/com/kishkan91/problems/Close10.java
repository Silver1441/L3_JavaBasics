package com.kishkan91.problems;

import static java.lang.Math.abs;

public class Close10 {
    //Warmup-1
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
