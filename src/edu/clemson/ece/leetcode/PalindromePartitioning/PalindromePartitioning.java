package edu.clemson.ece.leetcode.PalindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<String>> partition(String s) {
        List<List<String>> ans =  new ArrayList<>();
        if(s.length()==0){
            List<String> list = new ArrayList<>();
            ans.add(list);
            return ans;
        }
        for(int i=0; i<s.length(); i++){
            String head = s.substring(0,i+1);
            String tail = s.substring(i+1);
            if(isPalindrome(head, i)){
                for(List<String> list : partition(tail)){
                    list.add(0,head);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s, int end){
        int l = 0;
        int r = end;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)) return false;
        }
        return true;
    }
}
