package edu.clemson.ece.leetcode.VerifyPreorderSerializationOfABinaryTree;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input "2,#,#,6,9,9,#,7,#,#,#" should return false
	}

	public boolean isValidSerialization(String preorder) {
        if(preorder.length()==1 && preorder.charAt(0)=='#') return true;
        int i = preorder.length()-1;
        int sharp = 0;
        int number = 0;
        while(i>=0){
            if(preorder.charAt(i)==','){
                i--;
                continue;
            } else if(preorder.charAt(i)=='#'){
                i--;
                sharp++;
            } else {
                while(i>0 && preorder.charAt(i)!=',') i--;
                if(sharp<2) return false;
                number++;
            }
            i--;
        }
        return (preorder.charAt(0)!='#') && (number+1==sharp);
    }
}
