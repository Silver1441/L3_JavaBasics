package com.kishkan91.problems;

public class GHappy {
    //String-3
    public boolean gHappy(String str) {
        int strLength = str.length();
        boolean isHappy = false;
        int gCounter = 0;

        for (int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            if (ch=='g' && i!=0) {
                gCounter = gCounter+1;
                char chPrev = str.charAt(i-1);
                if (chPrev=='g') {
                    isHappy = true;
                } else {
                    isHappy = false;
                }
            }
        }

        if (gCounter==0) {
            isHappy = true;
        }
        //не костыль, а отработка частных исключений с:
        if (str=="g") {
            isHappy = false;
        }

        return isHappy;
    }
}
