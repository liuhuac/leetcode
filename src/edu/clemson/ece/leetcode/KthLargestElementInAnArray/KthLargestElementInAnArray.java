package edu.clemson.ece.leetcode.KthLargestElementInAnArray;

public class KthLargestElementInAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthLargestElementInAnArray ka = new KthLargestElementInAnArray();
		int[] nums = new int[]{5,2,4,1,3,6,0};
		int k = 2;
		System.out.print(ka.findKthLargest(nums, k));
	}
	public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length-1;
        int pos = -1;
        while(k!=pos){
            if(pos<k){
                pos = findKthLargest(nums, pos+1, hi);
            } else {
                pos = findKthLargest(nums, lo, pos-1);
            }
        }
        return nums[pos];
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
    public int findKthLargest(int[] nums, int lo, int hi) {
        int pivot = nums[lo];
        int i = lo + 1;
        int j = hi;
        while(i<=j){
            while(nums[i]<=pivot) if(++i>hi) break;
            while(nums[j]>pivot) if(--j<lo+1) break;
            if(i<j) swap(nums, i++, j--);
        }
        swap(nums, lo, j);
        return j;
    }
}
