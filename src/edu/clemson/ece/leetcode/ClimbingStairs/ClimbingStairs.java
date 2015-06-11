package edu.clemson.ece.leetcode.ClimbingStairs;

public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs cs = new ClimbingStairs();
		System.out.println(cs.climbStairs(44));
	}

	public int climbStairs(int n) {
        if(1>n) return 0;
        if(1==n) return 1;
        if(2==n) return 2;
        
        int[] ways = new int[n+1];
        ways[0] = 0;
        ways[1] = 1;
        ways[2] = 2;
        for(int i=3; i<=n; i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }
}
