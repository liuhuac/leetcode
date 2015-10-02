package edu.clemson.ece.leetcode.BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(null==root) return res;
        
        res.addAll(binaryTreePaths(root.left));
        res.addAll(binaryTreePaths(root.right));
        
        List<String> ans = new ArrayList<>();
        if(res.isEmpty()) {
            ans.add(Integer.toString(root.val));
        } else {
            for(String s : res){
                ans.add(root.val+"->"+s);
            }
        }
        
        return ans;
        
    }
}
