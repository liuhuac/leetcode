package edu.clemson.ece.leetcode.WaterAndJugProblem;

public class WaterAndJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y<z) return false;
        if(x==0||y==0) return x==z||y==z;
        return z%GCD(x,y)==0;
    }
    public int GCD(int a, int b){
        while(b!=0){
            int tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
}
