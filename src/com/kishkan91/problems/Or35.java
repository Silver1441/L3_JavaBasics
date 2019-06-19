package com.kishkan91.problems;

public class Or35 {
    //Warmup-1
    public boolean or35(int n) {
        int multThree=n%3;
        int multFive=n%5;

        if (multThree==0 | multFive==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
