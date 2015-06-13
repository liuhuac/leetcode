package edu.clemson.ece.leetcode.BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return myPreorderTraversal(list, root);
    }
	
    public List<Integer> myPreorderTraversal(List<Integer> list, TreeNode root){
        if(null==root) return list;
        list.add(root.val);
        list = myPreorderTraversal(list, root.left);
        list = myPreorderTraversal(list, root.right);
        return list;
    }
}
