package edu.clemson.ece.leetcode.CountOfSmallerNumbersAfterSelf;

import java.util.Arrays;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

	/**
	 * @param args
	 */
	class Node {
        int val;
        int cnt;
        int dup;
        Node left, right;
        Node(int x, int c, int d){
            val = x;
            cnt = c;
            dup = d;
            left = right = null;
        }
    }
    public Node insert(int i, int[] nums, Node root, Integer[] ans, int preSum) {
        if(root==null){
            root = new Node(nums[i], 0, 1);
            ans[i] = preSum;
        } else if (root.val==nums[i]){
            root.dup++;
            ans[i] = preSum+root.cnt;
        } else if (root.val<nums[i]){
            root.right = insert(i, nums, root.right, ans, preSum+root.cnt+root.dup);
        } else if (root.val>nums[i]){
            root.cnt++;
            root.left = insert(i, nums, root.left, ans, preSum);
        }
        return root;
    }
    public List<Integer> countSmaller(int[] nums) {
        Integer[] ans = new Integer[nums.length];
        Node root = null;
        for(int i=nums.length-1; i>=0; i--){
            root = insert(i, nums, root, ans, 0);
        }
        return Arrays.asList(ans);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
