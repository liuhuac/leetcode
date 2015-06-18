package edu.clemson.ece.leetcode.BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(null==root) return list;
        if(null!=root.left)
            list.addAll(postorderTraversal(root.left));
        if(null!=root.right)
            list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }

}
