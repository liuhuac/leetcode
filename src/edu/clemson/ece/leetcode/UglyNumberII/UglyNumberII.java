package edu.clemson.ece.leetcode.UglyNumberII;

public class UglyNumberII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNumberII un = new UglyNumberII();
		un.nthUglyNumber(11);
	}
	public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int two = 2;
        int three = 3;
        int five = 5;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        ugly[0] = 1;
        for(int i=1; i<n; i++){
            ugly[i] = Math.min(Math.min(two,three),five);
            if(ugly[i]==two) two = 2 * ugly[++i2];
            if(ugly[i]==three) three = 3 * ugly[++i3];
            if(ugly[i]==five) five = 5 * ugly[++i5];
        }
        return ugly[n-1];
    }
}
