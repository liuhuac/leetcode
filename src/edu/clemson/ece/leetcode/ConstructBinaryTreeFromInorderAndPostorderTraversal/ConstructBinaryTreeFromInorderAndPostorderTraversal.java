package edu.clemson.ece.leetcode.ConstructBinaryTreeFromInorderAndPostorderTraversal;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    public TreeNode buildTree(int[] inorder, int inl, int inr, int[] postorder, int postl, int postr) {
        if(inl>inr) return null;
        if(inl==inr) return new TreeNode(inorder[inl]);
        TreeNode tn = new TreeNode(postorder[postr]);
        int index = 0;
        for(int i=inl; i<=inr; i++){
            if(inorder[i]==postorder[postr]){
                index = i;
                break;
            }
        }
        tn.left = buildTree(inorder, inl, index-1, postorder, postl, postl+index-inl-1);
        tn.right = buildTree(inorder, index+1, inr, postorder, postl+index-inl, postr-1);
        return tn;
    }
}
