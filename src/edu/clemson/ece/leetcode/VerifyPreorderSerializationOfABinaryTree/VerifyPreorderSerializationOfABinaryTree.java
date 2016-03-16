package edu.clemson.ece.leetcode.VerifyPreorderSerializationOfABinaryTree;

public class VerifyPreorderSerializationOfABinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidSerialization(String preorder) {
        int count = 0;
        for(String str : preorder.split(",")){
            if(count<0){
                return false;
            } else {
                if(str.equals("#")){
                    count--;
                } else {
                    count++;
                }
            }
        }
        return count==-1;
    }
}
