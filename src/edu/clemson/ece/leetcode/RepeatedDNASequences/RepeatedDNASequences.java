package edu.clemson.ece.leetcode.RepeatedDNASequences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedDNASequences rds = new RepeatedDNASequences();
		rds.findRepeatedDnaSequences("CAAAAAAAAAC");
	}
	public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0; i<s.length()-9; i++){
            int hash = getHash(s, i);
            if(map.containsKey(hash)){
                if(!map.get(hash)){
                    ans.add(s.substring(i, i+10));
                    map.put(hash, true);
                }
            } else {
                map.put(hash, false);
            }
        }
        return ans;
    }
    public int getHash(String s, int k){
        int hash = 0;
        for(int i=k; i<k+10; i++){
            int val = 0;
            if(s.charAt(i)=='A') val = 0;
            if(s.charAt(i)=='C') val = 1;
            if(s.charAt(i)=='G') val = 2;
            if(s.charAt(i)=='T') val = 3;
            hash = 10 * hash + val;
        }
        return hash;
    }
}
