package com.kishkan91.problems;

public class EveryNth {
    //Warmup-1
    public String everyNth(String str, int n) {
        String resultStr=""+str.charAt(0);
        for (int x=n; x<str.length(); x=x+n) {
            resultStr = resultStr+str.charAt(x);
        }
        return resultStr;
    }

}
