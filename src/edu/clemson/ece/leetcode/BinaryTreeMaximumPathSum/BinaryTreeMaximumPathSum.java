package edu.clemson.ece.leetcode.BinaryTreeMaximumPathSum;

public class BinaryTreeMaximumPathSum {

	/**
	 * @param args
	 */
	
public int max = Integer.MIN_VALUE; // attention
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    
    public int helper(TreeNode root) {
        if(root==null) return 0;
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);
        
        max = Math.max(max,root.val+left+right);
        
        return Math.max(left,right)+root.val;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
