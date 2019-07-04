package com.kishkan91.problems;

public class MakeBricksLevel2 {
    //Logic-2:
    //We want to make a row of bricks that is goal inches long.
    // We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    // Return true if it is possible to make the goal by choosing from the given bricks.
    public boolean makeBricks(int small, int big, int goal) {
        while (small>9) {
            small -= 5;
            big++;
        }

        int xFive = goal / 5;

        return (big >= xFive && small >= goal%5 ||
                small>=5 && big+1 >= xFive && small-5 >= goal%5);
    }
}
