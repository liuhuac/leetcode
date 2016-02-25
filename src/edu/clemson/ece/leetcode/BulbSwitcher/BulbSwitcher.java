package edu.clemson.ece.leetcode.BulbSwitcher;

public class BulbSwitcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* For individual bulb, its final state depends on 
	 * how many times it got toggled, and it equals the 
	 * number of its distinct factors. If the number is 
	 * even, the bulb is off, otherwise it's on. We know 
	 * all numbers factors are even number unless it's 
	 * a square number. So the problem is equivalent to 
	 * count the square numbers no larger than n */
	
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}
