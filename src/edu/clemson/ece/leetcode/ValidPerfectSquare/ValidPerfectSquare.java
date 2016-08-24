package edu.clemson.ece.leetcode.ValidPerfectSquare;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long curSquare = 0; // long here is important
        int i = 0;
        while(num>curSquare){
            curSquare += (2*i++) + 1;
        }
        return curSquare==num;
    }
}
