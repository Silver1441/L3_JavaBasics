package com.kishkan91.problems;

public class DoubleChar_Level2 {
    //String-2
    public String doubleChar(String str) {
        StringBuffer strResult = new StringBuffer();
        int strLength = str.length();

        for (int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            strResult = strResult.append(ch);
            strResult = strResult.append(ch);
        }

        str = strResult.toString();
        return str;
    }
}
