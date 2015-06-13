package edu.clemson.ece.leetcode.PopulatingNextRightPointersInEachNode;

public class PopulatingNextRightPointersInEachNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void connect(TreeLinkNode root) {
        if(null==root) return;
        connect(root.left);
        connect(root.right);
        TreeLinkNode l = root.left;
        TreeLinkNode r = root.right;
        while(null!=l){
            l.next = r;
            l = l.right;
            r = r.left;
        }
        
    }
}
