package edu.clemson.ece.leetcode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return myInorderTraversal(list, root);
    }
	
    public List<Integer> myInorderTraversal(List<Integer> list, TreeNode root){
        if(null==root) return list;
        list = myInorderTraversal(list, root.left);
        list.add(root.val);
        list = myInorderTraversal(list, root.right);
        return list;
    }
}
