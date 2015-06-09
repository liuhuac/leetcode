package edu.clemson.ece.leetcode.MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {3};
		int[] nums2 = {1,2};
		
		MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
		System.out.println(sol.findMedianSortedArrays(nums1,nums2));

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if((nums1.length+nums2.length)%2==0){
//        	System.out.println(myFinder(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length)/2));
//        	System.out.println(myFinder(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length)/2+1));
            return (double)( myFinder(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length)/2) +
                    myFinder(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length)/2+1) ) / 2;
        } else {
            return myFinder(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length)/2+1);
        }
        
    }
    
    public int myFinder(int[] nums1, int l1, int r1, int[] nums2, int l2, int r2, int k){
        int n1 = r1-l1+1;
        int n2 = r2-l2+1;
        if(n1<=0){
            return nums2[l2+k-1];
        }
        if(n2<=0){
        	return nums1[l1+k-1];
        }
        if(1==k){
        	return nums1[l1+n1/2]<=nums2[l2+n2/2] ? nums1[l1+n1/2] : nums2[l2+n2/2];
        }
//        if(2==k){
//        	return nums1[l1+n1/2]>=nums2[l2+n2/2] ? nums1[l1+n1/2] : nums2[l2+n2/2];
//        }
        if(n1/2 + n2/2 + 1 >= k){
            if(nums1[l1+n1/2]>=nums2[l2+n2/2]){
            	if(1==n1) {
            		return myFinder(nums1, l1, r1-1, nums2, l2, r2, k);
            	}
                return myFinder(nums1, l1, r1-n1/2, nums2, l2, r2, k);
            } else {
            	if(1==n2) {
            		return myFinder(nums1, l1, r1, nums2, l2, r2-1, k);
            	}
                return myFinder(nums1, l1, r1, nums2, l2, r2-n2/2, k);
            }
        } else {
            if(nums1[l1+n1/2]>=nums2[l2+n2/2]){
            	if(1==n2) {
            		return myFinder(nums1, l1, r1, nums2, l2+1, r2, k-1);
            	}
                return myFinder(nums1, l1, r1, nums2, l2+n2/2, r2, k-n2/2);
            } else {
            	if(1==n1) {
            		return myFinder(nums1, l1+1, r1, nums2, l2, r2, k-1);
            	}
                return myFinder(nums1, l1+n1/2, r1, nums2, l2, r2, k-n1/2);
            }
        }
    }
}
