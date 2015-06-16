package edu.clemson.ece.leetcode.ConvertSortedArrayToBinarySearchTree;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length-1);
    }
    
    public TreeNode buildBST(int[] nums, int l, int r){
        if(0 == nums.length){
            return null;
        }
        if(l==r){
            return new TreeNode(nums[l]);
        }
        if(l==r-1){
            TreeNode tn = new TreeNode(nums[l]);
            tn.right = new TreeNode(nums[r]);
            return tn;
        }
        int mid = l + (r - l)/2;
        TreeNode tn = new TreeNode(nums[mid]);
        tn.left = buildBST(nums, l, mid - 1);
        tn.right = buildBST(nums, mid + 1, r);
        return tn;
    }
}
