package edu.clemson.ece.leetcode.MergeSortedArray;

public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int scan = m + n - 1;
        int s1 = m - 1;
        int s2 = n - 1;
        while(scan>=0){
            if(s1<0){
                nums1[scan--] = nums2[s2--];
            } else if(s2<0){
                nums1[scan--] = nums1[s1--];
            } else {
                if(nums1[s1]>nums2[s2]){
                    nums1[scan--] = nums1[s1--];
                } else {
                    nums1[scan--] = nums2[s2--];
                }
            }
        }
    }
}
