package edu.clemson.ece.leetcode.WaterAndJugProblem;

public class WrongAnswer {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x==0||y==0) return x==z||y==z;
        if(y>x){ /* make sure x always greater or equal to y*/
            int tmp = x;
            x = y;
            y = tmp;
        }
        int measurable = x+y;
        while(measurable>0){
            if(measurable==z) return true;
            measurable -= y;
        }
        measurable = -x;
        while(measurable<0) measurable += y;
        while(measurable<x+y){
            if(measurable==z) return true;
            measurable += y;
        }
        return 2*y==z;
    }
}
