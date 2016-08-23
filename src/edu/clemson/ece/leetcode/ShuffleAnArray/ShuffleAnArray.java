package edu.clemson.ece.leetcode.ShuffleAnArray

public class ShuffleAnArray {
    
    private int[] origin;

    public Solution(int[] nums) {
        origin = new int[nums.length];
        for(int i=0; i<nums.length; i++) origin[i] = nums[i];
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return Arrays.copyOf(origin, origin.length);
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random rd = new Random();
        int[] ans = new int[origin.length];
        for(int i=0; i<origin.length; i++){
            int pos = rd.nextInt(i+1);
            if(pos==i){
                ans[pos] = origin[i];
            } else {
                ans[i] = ans[pos];
                ans[pos] = origin[i];
            }
        }
        return ans;
    }
}

/**
 *  * Your Solution object will be instantiated and called as such:
 *   * Solution obj = new Solution(nums);
 *    * int[] param_1 = obj.reset();
 *     * int[] param_2 = obj.shuffle();
 *      */
