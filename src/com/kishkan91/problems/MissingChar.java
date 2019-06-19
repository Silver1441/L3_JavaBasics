package com.kishkan91.problems;

public class MissingChar {
    //Warmup-1
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        str=sb.toString();
        return str;
    }
}
