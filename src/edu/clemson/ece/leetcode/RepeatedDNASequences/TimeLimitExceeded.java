package edu.clemson.ece.leetcode.RepeatedDNASequences;

import java.util.ArrayList;
import java.util.List;

public class TimeLimitExceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<s.length()-10; i++){
            for(int j=i+10; j<s.length()-10; j++){
                if(isRepeat(s,i,j)){
                    ans.add(s.substring(i,i+11));
                }
            }
        }
        return ans;
    }
    public boolean isRepeat(String s, int i, int j){
        for(int k=0; k<10; k++){
            if(s.charAt(i+k)!=s.charAt(j+k)) return false;
        }
        return true;
    }
}
