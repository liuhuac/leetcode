package edu.clemson.ece.leetcode.CountOfRangeSum;

public class CountOfRangeSum {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if(nums.length==0) return 0;
        long[] sums = new long[nums.length+1];
        sums[0] = 0;
        for(int i=0; i<nums.length; i++) sums[i+1] = sums[i] + nums[i];
        return countRangeSum(sums, 0, nums.length, lower, upper);
    }
    
    public int countRangeSum(long[] sums, int left, int right, int lower, int upper){
        if(left==right) return 0;
        int mid = left + (right-left)/2;
        int count = countRangeSum(sums, left, mid, lower, upper);
        count += countRangeSum(sums, mid+1, right, lower, upper);
        /* count and merge*/
        /* i for left, j1 and j2 for right, t1 and t2 for merge to tmp array, */
        int t1 = 0, t2 = mid+1;
        int j1 = mid+1, j2 = mid+1;
        long[] tmp = new long[right-left+1];
        for(int i=left; i<=mid; i++){
            while(j1<=right && (sums[j1]-sums[i])<lower) j1++;
            while(j2<=right && (sums[j2]-sums[i])<=upper) j2++;
            count += (j2-j1);
            /* merge */
            while(t2<=right && sums[t2]<=sums[i]) tmp[t1++]=sums[t2++];
            tmp[t1++] = sums[i];
        }
        /* copy sorted tmp to sums */
        /* j<t1 only copy part of tmp */
        for(int i=left, j=0; j<t1; i++, j++) sums[i] = tmp[j];
        
        return count;
    }
}
