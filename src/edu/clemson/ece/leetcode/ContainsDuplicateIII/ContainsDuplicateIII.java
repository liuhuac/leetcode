package edu.clemson.ece.leetcode.ContainsDuplicateIII;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<1 || t<0) return false; // attention why k<1 ????
        Map<Long,Long> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            long n = (long)nums[i]-Integer.MIN_VALUE;
            long bid = n/((long)t+1); // attention
            if(map.containsKey(bid) ||
                map.containsKey(bid-1) && n-map.get(bid-1)<=t ||
                map.containsKey(bid+1) && map.get(bid+1)-n<=t) 
                    return true;
            if(map.entrySet().size()==k){
                long last = ((long)nums[i-k]-Integer.MIN_VALUE)/((long)t+1); // attention
                map.remove(last);
            }
            map.put(bid,n);
        }
        return false;
    }
}
