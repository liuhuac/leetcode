package edu.clemson.ece.leetcode.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(Arrays.asList(2));
		triangle.add(Arrays.asList(3,4));
		triangle.add(Arrays.asList(5,6,7));
		triangle.add(Arrays.asList(4,1,8,3));
		Triangle t = new Triangle();
		System.out.print(t.minimumTotal(triangle));
	}
	public int minimumTotal(List<List<Integer>> triangle) {
        int r = triangle.size();
        int[] path = new int[r];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(0==path[0]){
            sum = pathSum(triangle, path);
            if(min>sum) min = sum;
            next(path);
        }
        return min;
    }
    public int pathSum(List<List<Integer>> triangle, int[] path){
        int sum = 0;
        for(int i=0; i<path.length; i++) sum += triangle.get(i).get(path[i]);
        return sum;
    }
    public void next(int[] path){
        int end = path.length-1;
        int last = path[end];
        if(last==path.length-1){
            path[0] = -1;
            return;
        }
        int pre = path[end-1];
        while(last==pre+1&&end>1){
            last = path[end--];
            pre = path[end-1];
        }
        while(end<path.length) path[end++]=pre+1;
    }
}
