package com.kishkan91.problems;

public class CountYZ_Level3 {
    //String-3
    public int countYZ(String str) {
        int strLength = str.length();
        StringBuffer strEnd = new StringBuffer();

        for (int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)==false && i!=0) {
                char chEnd = str.charAt(i-1);
                if (Character.isLetter(chEnd)) {
                    strEnd = strEnd.append(chEnd);
                }
            }
        }

        char ch = str.charAt(strLength-1);
        strEnd = strEnd.append(ch);
        str = strEnd.toString();
        strLength = str.length();
        StringBuffer strFormated = new StringBuffer();

        for (int i=0; i<strLength; i++) {
            ch = str.charAt(i);
            if (ch == 'z' || ch == 'y' || ch == 'Z' || ch == 'Y') {
                strFormated = strFormated.append(ch);
            }
        }

        str = strFormated.toString();
        strLength = str.length();
        return strLength;
    }
}
