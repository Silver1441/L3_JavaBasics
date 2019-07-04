package com.kishkan91.problems;

public class EveryNth {
    //Warmup-1
    public String everyNth(String str, int n) {
        StringBuilder resultStr = new StringBuilder();
        resultStr.append(str.charAt(0));

        for (int x = n; x < str.length(); x = x + n) {
            resultStr.append(str.charAt(x));
        }
        return str = resultStr.toString();
    }
}
