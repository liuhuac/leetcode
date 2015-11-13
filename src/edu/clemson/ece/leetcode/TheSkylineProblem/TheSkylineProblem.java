package edu.clemson.ece.leetcode.TheSkylineProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TheSkylineProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> ans = new ArrayList<>();
        List<int[]> height = new ArrayList<>();
        for(int[] b : buildings){
            height.add(new int[]{b[0],b[2]});
            height.add(new int[]{b[1],-b[2]});
        }
        Collections.sort(height,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]==b[0]) return b[1]-a[1];
                else return a[0]-b[0];
            }
        });
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        pq.offer(0);
        int curHeight = 0;
        int preHeight = 0;
        for(int[] h : height){
            if(h[1]>0){
                pq.offer(h[1]);
            } else {
                pq.remove(-h[1]);
            }
            curHeight = pq.peek();
            if(curHeight!=preHeight){
                ans.add(new int[]{h[0],curHeight});
                preHeight = curHeight;
            }
        }
        return ans;
    }
}
