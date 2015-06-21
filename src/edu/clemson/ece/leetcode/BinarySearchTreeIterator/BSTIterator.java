package edu.clemson.ece.leetcode.BinarySearchTreeIterator;

import java.util.Stack;

public class BSTIterator {

	/**
	 * @param args
	 */
	
	public Stack<TreeNode> st;
    
	/**
	 * Your BSTIterator will be called like this:
	 * BSTIterator i = new BSTIterator(root);
	 * while (i.hasNext()) v[f()] = i.next();
	 */
	
    public BSTIterator(TreeNode root) {
        st = new Stack<TreeNode>(); 
        TreeNode scan = root;
        while(null!=scan){
            st.push(scan);
            scan = scan.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tn = st.pop();
        TreeNode scan = tn.right;
        while(null!=scan){
            st.push(scan);
            scan = scan.left;
        }
        return tn.val;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
