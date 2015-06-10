package edu.clemson.ece.leetcode.ValidPalindrome;

public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if((lc<='Z'&&lc>='A')||(lc<='z'&&lc>='a')||(lc<='9'&&lc>='0')){
                if((rc<='Z'&&rc>='A')||(rc<='z'&&rc>='a')||(rc<='9'&&rc>='0')){
                    if(!isSame(lc,rc)){
                        return false;
                    }
                    l++;
                    r--;
                    continue;
                } else {
                    r--;
                    continue;
                }
            } else {
                l++;
                continue;
            }
        }
        return true;
    }
    
    public boolean isSame(char lc, char rc){
        if(lc<='z'&&lc>='a'){
            lc = (char)(lc - ('a' - 'A'));
        }
        if(rc<='z'&&rc>='a'){
            rc = (char)(rc - ('a' - 'A'));
        }
        return lc==rc;
    }
}
