package edu.clemson.ece.leetcode.ClimbingStairs;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeLimitExceeded cs = new TimeLimitExceeded();
		System.out.println(cs.climbStairs(44)); // 1134903170
	}

	public int climbStairs(int n) {
        return ways(n);
    }
    
    public int ways(int n){
        if(1>n) return 0;
        if(1==n) return 1;
        if(2==n) return 2;
        return ways(n-1)+ways(n-2);
    }
}
