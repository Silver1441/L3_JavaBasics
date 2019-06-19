package com.kishkan91.problems;

public class PosNeg {
    //Warmup-1
    public boolean posNeg(int a, int b, boolean negative) {
        if(a>0&b<0&negative==false | a<0&b>0&negative==false | a<0&b<0&negative==true) {
            return true;
        }
        else {
            return false;
        }
    }
}
