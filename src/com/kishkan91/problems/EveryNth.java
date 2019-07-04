package com.kishkan91.problems;

public class EveryNth {
    //Warmup-1:
    //Given a non-empty string and an int N, return the string made starting with char 0, and
    //then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or
    //more.
    public String everyNth(String str, int n) {
        StringBuilder resultStr = new StringBuilder();
        resultStr.append(str.charAt(0));

        for (int x = n; x < str.length(); x = x + n) {
            resultStr.append(str.charAt(x));
        }
        return resultStr.toString();
    }
}
