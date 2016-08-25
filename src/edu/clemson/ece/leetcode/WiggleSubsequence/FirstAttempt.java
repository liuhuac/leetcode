package edu.clemson.ece.leetcode.WiggleSubsequence;

public class FirstAttempt {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return nums.length;
        
        /* current value */
        int cur = nums[0];
        int start = 0;
        while(++start<nums.length && nums[start]==nums[0]);
        
        if(start==nums.length) return 1;
        
        /* looking for higher (1) or lower (-1) value*/
        int sign = cur>nums[start] ? 1 : -1; 
        
        int res = 2;
        cur = nums[start];
        
        for(int i=start+1; i<nums.length; i++){
            if(sign==1){
                if(nums[i]>cur){
                    cur = nums[i];
                    sign = -sign;
                    res++;
                } else if (nums[i]<cur){
                    cur = nums[i];
                }
            } else {
                if(nums[i]>cur){
                    cur = nums[i];
                } else if (nums[i]<cur){
                    cur = nums[i];
                    sign = -sign;
                    res++;
                }
            }
        }
        return res;
    }
}
