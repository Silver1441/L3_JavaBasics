package com.kishkan91.problems;

public class Close10 {
    //Warmup-1
    public int close10(int a, int b) {
        int aToTenDif = Math.abs(10-a);
        int bToTenDif = Math.abs(10-b);

        if (aToTenDif>bToTenDif) {
            return b;
        }

        else if (aToTenDif<bToTenDif) {
            return a;
        }

        else {
            return 0;
        }
    }
}
