package edu.clemson.ece.leetcode.UniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
    
    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> tree = new ArrayList<TreeNode>();
        if(start>end) {
            tree.add(null);
            return tree;
        }
        for(int i=start; i<=end; i++){
            List<TreeNode> ltrees = generateTrees(start, i-1);
            List<TreeNode> rtrees = generateTrees(i+1, end);
            for(TreeNode ltree : ltrees){
                for(TreeNode rtree : rtrees){
                    TreeNode tn = new TreeNode(i);
                    tn.left = ltree;
                    tn.right = rtree;
                    tree.add(tn);
                }
            }
        }
        return tree;
    }
}
