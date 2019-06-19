package com.kishkan91.problems;

public class MakeBricks_Level2 {
    //Logic-2
    public boolean makeBricks(int small, int big, int goal) {
        //некрасиво, но я хочу спать :с
        while (small>9) {
            small = small - 5;
            big = big + 1;
        }

        int xFive = goal / 5;

        if (big >= xFive && small >= goal%5 ||
                small>=5 && big+1 >= xFive && small-5 >= goal%5){
            return true;
        } else {
            return false;
        }
    }
}
