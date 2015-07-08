package edu.clemson.ece.leetcode.CountCompleteTreeNodes;

public class TimeLimitExceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countNodes(TreeNode root) {
        if(null==root) return 0;
        int leftHight = hight(root, true);
        int rightHight = hight(root, false);
        if(leftHight==rightHight){
            return (int)Math.pow(2,leftHight) - 1; // return (1<<leftHight) - 1;
        } else {
            int rightleftHight = hight(root.right, true);
            if(rightleftHight==rightHight-1){
                return (int)Math.pow(2,rightHight-1) + countNodes(root.left); // return (1<<(rightHight-1)) + countNodes(root.left);
            } else {
                return (int)Math.pow(2,leftHight-1) + countNodes(root.right); // return (1<<(leftHight-1)) + countNodes(root.right);
            }
        }
    }
    public int hight(TreeNode root, boolean isLeft){
        int depth = 0;
        while(null!=root){
            depth++;
            root = isLeft ? root.left : root.right;
        }
        return depth;
    }
}
