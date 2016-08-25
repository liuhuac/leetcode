package edu.clemson.ece.leetcode.WiggleSubsequence;

public class WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2) return nums.length;
        
        int start = 0;
        while(++start<nums.length && nums[start]==nums[0]);
        
        if(start==nums.length) return 1;
        
        /* looking for higher (1) or lower (-1) value*/
        int sign = nums[0]>nums[start] ? 1 : -1; 
        
        int res = 2;
        
        for(int i=start+1; i<nums.length; i++){
            if(sign==1 && nums[i]>nums[i-1] || sign==-1 && nums[i]<nums[i-1]){
                sign = -sign;
                res++;
            }
        }
        return res;
    }
    /* test others' answer */
    /* Wrong answer! It does not consider sequence like 1,1,1,1... */
    public int wiggleMaxLength1(int[] nums){
        
        if (nums.length <= 1) return nums.length;
        int count = 1;
        boolean big = (nums[0] < nums[1]);
        for (int i=1;i<nums.length;i++){
            if((big && nums[i] > nums[i-1]) || (!big && nums[i] < nums[i-1])){
                count ++;
                big = !big;
            }
        }
        return count;
    }
}
