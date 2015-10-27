package edu.clemson.ece.leetcode.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int max = 0;
        for(int n : nums){
            int k = n;
            int count = 0;
            while(set.contains(k)){
                set.remove(k);
                count++;
                k++;
            }
            k = n - 1;
            while(set.contains(k)){
                set.remove(k);
                count++;
                k--;
            }
            if(count>max) max = count;
        }
        return max;
    }
}
