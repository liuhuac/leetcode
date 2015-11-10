package edu.clemson.ece.leetcode.SerializeAndDeserializeBinaryTree;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "#,";
        String str = root.val + ",";
        str += serialize(root.left);
        str += serialize(root.right);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return deserialize(nodes);
    }
    
    public TreeNode deserialize(Deque<String> nodes){
        String str = nodes.remove();
        if(str.equals("#")) return null;
        TreeNode tn = new TreeNode(Integer.valueOf(str));
        tn.left = deserialize(nodes);
        tn.right = deserialize(nodes);
        return tn;
    }
}
