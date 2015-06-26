package edu.clemson.ece.leetcode.BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> l = new ArrayList<Integer>();
        if(null==root) return l;
        q.add(root);
        int size = q.size();
        int i = 1;
        while(!q.isEmpty()){
            TreeNode n = q.remove();
            if(null!=n.left) q.add(n.left);
            if(null!=n.right) q.add(n.right);
            if(i==size){
                l.add(n.val);
                size = q.size();
                i = 0;
            }
            i++;
        }
        return l;
    }
}
