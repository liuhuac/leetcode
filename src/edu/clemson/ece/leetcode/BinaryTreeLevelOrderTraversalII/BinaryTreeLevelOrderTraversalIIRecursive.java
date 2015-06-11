package edu.clemson.ece.leetcode.BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIIRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        traverse(list, 0, root);
        return list;
    }
    
    public void traverse(List<List<Integer>> list, int level, TreeNode node){
        if(null==node){
            return;
        }
        if(list.size()-1<level) list.add(0,new ArrayList<Integer>());
        list.get(list.size()-1-level).add(node.val);
        traverse(list, level+1, node.left);
        traverse(list, level+1, node.right);
    }
    
}
