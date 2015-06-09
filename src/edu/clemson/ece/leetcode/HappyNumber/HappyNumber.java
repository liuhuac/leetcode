package edu.clemson.ece.leetcode.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(n);
        while(1!=(n=replace(n))){
            if(!s.add(n)){
                return false;
            }
        }
        return true;
    }
    
    public int replace(int n) {
        if(10>n){
            return n*n;
        }
        return replace(n/10)+replace(n%10);
    }
}
