package edu.clemson.ece.leetcode.BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(null!=root) stack.push(root);
        boolean direction = true;
        while(!stack.isEmpty()){
            Stack<TreeNode> next = new Stack<>();
            List<Integer> row = new ArrayList<>(); 
            while(!stack.isEmpty()){
                TreeNode tn = stack.pop();
                row.add(tn.val);
                if(direction){
                    if(null!=tn.left) next.push(tn.left);
                    if(null!=tn.right) next.push(tn.right);
                } else {
                    if(null!=tn.right) next.push(tn.right);
                    if(null!=tn.left) next.push(tn.left);
                }
            }
            ans.add(row);
            stack = next;
            direction = !direction;
        }
        return ans;
    }
}
