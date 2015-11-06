package edu.clemson.ece.leetcode.MaxPointsOnALine;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		double test = (3-3)/4;
		double test1 = 0/(double)-4;
		
		Point[] points = new Point[3];
		points[0] = new Point(2,3);
		points[1] = new Point(3,3);
		points[2] = new Point(-5,3);
		
		/*Point[] points = new Point[9];
		points[0] = new Point(84,250);
		points[1] = new Point(0,0);
		points[2] = new Point(1,0);
		points[3] = new Point(0,-70);
		points[4] = new Point(0,-70);
		points[5] = new Point(1,-1);
		points[6] = new Point(21,10);
		points[7] = new Point(42,90);
		points[8] = new Point(-42,-230);*/
		
		/*points[0].x = 84; points[0].y = 250;
		points[1].x = 0; points[1].y = 0;
		points[2].x = 1; points[2].y = 0;
		points[3].x = 0; points[3].y = -70;
		points[4].x = 0; points[4].y = -70;
		points[5].x = 1; points[5].y = -1;
		points[6].x = 21; points[6].y = 10;
		points[7].x = 42; points[7].y = 90;
		points[8].x = -42; points[8].y = -230;*/

		MaxPointsOnALine mp = new MaxPointsOnALine();
		mp.maxPoints(points);

	}
	public int maxPoints(Point[] points) {
        if(points.length==0) return 0;
        int ans = 1;
        Map<Double,Integer> m = new HashMap<>();
        for(int i=0; i<points.length; i++){
            m.clear();
            int overlap = 0;
            for(int j=i+1; j<points.length; j++){
                double slope = 0;
                if(points[i].x==points[j].x){
                    if(points[i].y==points[j].y){ // points overlap
                        overlap++;
                        continue;
                    } else {
                        slope = Double.MAX_VALUE;
                    }
                } else {
                    if(points[i].y==points[j].y){
                        slope = 0; // avoid -0.0 slope 
                    } else {
                        slope = (double)(points[j].y-points[i].y)/(points[j].x-points[i].x);// cast
                    }
                }
                if(m.containsKey(slope)){
                    m.put(slope,m.get(slope)+1);
                } else {
                    m.put(slope,1);
                }
            }
            int max = 0;
            for (Map.Entry<Double,Integer> entry : m.entrySet()){
                if(entry.getValue()>max) max = entry.getValue();
            }
            if(max+overlap+1>ans) ans = max+overlap+1;// 1 is itself
        }
        return ans;
    }
}
