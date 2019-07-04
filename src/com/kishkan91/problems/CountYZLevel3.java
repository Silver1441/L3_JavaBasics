package com.kishkan91.problems;

public class CountYZLevel3 {
    //String-3:
    //Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
    //the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
    //is at the end of a word if there is not an alphabetic letter immediately following it. (Note:
    //Character.isLetter(char) tests if a char is an alphabetic letter.)
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
