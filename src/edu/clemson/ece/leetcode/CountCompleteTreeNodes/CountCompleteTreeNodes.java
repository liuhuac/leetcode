package edu.clemson.ece.leetcode.CountCompleteTreeNodes;

public class CountCompleteTreeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countNodes(TreeNode root) {
        if(null==root) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if(left==right){
            return (1<<left) + countNodes(root.right);
        } else {
            return (1<<right) + countNodes(root.left);
        }
    }
    public int depth(TreeNode root){
        int d = 0;
        while(null!=root){
            d++;
            root = root.left;
        }
        return d;
    }
}
