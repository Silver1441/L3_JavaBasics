package com.kishkan91.problems;

public class GHappyLevel3 {
    //String-3 :
    //We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
    //immediately to its left or right. Return true if all the g's in the given string are happy.
    public boolean gHappy(String str) {
        int strLength = str.length();
        boolean isHappy = false;
        int gCounter = 0;

        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            if (ch == 'g' && i != 0) {
                gCounter++;
                if (str.charAt(i - 1) == 'g') {
                    isHappy = true;
                } else {
                    isHappy = false;
                }
            }
        }

        if (gCounter == 0) {
            isHappy = true;
        }

        if (str.equals("g")) {
            isHappy = false;
        }

        return isHappy;
    }
}
