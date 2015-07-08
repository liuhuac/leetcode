package edu.clemson.ece.leetcode.ConstructBinaryTreeFromPreorderAndInorderTraversal;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder, int prel, int prer, int[] inorder, int inl, int inr) {
        if(prel>prer) return null;
        if(prel==prer) return new TreeNode(preorder[prel]);
        TreeNode root = new TreeNode(preorder[prel]);
        int index = 0;
        for(int i=inl; i<=inr; i++){
            if(inorder[i]==preorder[prel]){
                index = i;
                break;
            }
        }
        /*if(index==inl){
            root.right = buildTree(preorder, prel+index-inl+1, prer, inorder, index+1, inr);
        } else if(index==inr){
            root.left = buildTree(preorder, prel+1, prel+index-inl, inorder, inl, index-1);
        } else {
            root.left = buildTree(preorder, prel+1, prel+index-inl, inorder, inl, index-1);
            root.right = buildTree(preorder, prel+index-inl+1, prer, inorder, index+1, inr);
        }*/
        root.left = buildTree(preorder, prel+1, prel+index-inl, inorder, inl, index-1);
        root.right = buildTree(preorder, prel+index-inl+1, prer, inorder, index+1, inr);
        return root;
    }
}
