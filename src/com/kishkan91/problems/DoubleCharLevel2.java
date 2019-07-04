package com.kishkan91.problems;

public class DoubleCharLevel2 {
    //String-2: Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str) {
        StringBuilder strResult = new StringBuilder();
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            strResult.append(ch);
            strResult.append(ch);
        }

        str = strResult.toString();
        return str;
    }
}
