package edu.clemson.ece.leetcode.PathSumII;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        if(null!=root) pathSum(ans, cur, root, sum);
        return ans;
    }
    public void pathSum(List<List<Integer>> ans, List<Integer> cur, TreeNode root, int sum) {
        if(null==root.left&&null==root.right){
            if(root.val==sum) {
                cur.add(root.val);
                ans.add(new ArrayList<Integer>(cur));
                cur.remove(cur.size()-1);
            }
            return;
        }
        cur.add(root.val);
        if(null!=root.left) pathSum(ans, cur, root.left, sum-root.val);
        if(null!=root.right) pathSum(ans, cur, root.right, sum-root.val);
        cur.remove(cur.size()-1);
    }
}
