package com.kishkan91.problems;

public class CountYZLevel3 {
    //String-3
    public int countYZ(String str) {
        int strLength = str.length();
        StringBuilder strEnd = new StringBuilder();

        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch) && i != 0) {
                char chEnd = str.charAt(i - 1);
                if (Character.isLetter(chEnd)) {
                    strEnd.append(chEnd);
                }
            }
        }

        char ch = str.charAt(strLength - 1);
        strEnd = strEnd.append(ch);
        str = strEnd.toString();
        strLength = str.length();
        StringBuilder strFormatted = new StringBuilder();

        for (int i = 0; i < strLength; i++) {
            ch = str.charAt(i);
            if (ch == 'z' || ch == 'y' || ch == 'Z' || ch == 'Y') {
                strFormatted = strFormatted.append(ch);
            }
        }

        str = strFormatted.toString();
        strLength = str.length();
        return strLength;
    }
}
