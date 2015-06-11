package edu.clemson.ece.leetcode.LengthOfLastWord;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public int lengthOfLastWord(String s) {
        
        int r;
        for(r=s.length()-1; r>=0; r--){
            if(' '==s.charAt(r)) {
                continue;
            } else {
                break;
            }
        }
        
        if(-1==r) return 0;
        if(0==r) return 1;
        
        int l;
        for(l=r-1; l>=0; l--){
            if(' '==s.charAt(l)) break;
        }
        
        return r - l;
    }
}
