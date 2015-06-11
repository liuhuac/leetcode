package edu.clemson.ece.leetcode.BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalIIQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(null==root){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> tmp = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode tn = q.remove();
                tmp.add(tn.val);
                if(null!=tn.left) q.add(tn.left);
                if(null!=tn.right) q.add(tn.right);
            }
            list.add(0,tmp);
        }
        return list;
    }
	
}
