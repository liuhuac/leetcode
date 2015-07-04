package edu.clemson.ece.leetcode.Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TimeLimitExceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeLimitExceeded ag = new TimeLimitExceeded();
		String[] strs = new String[]{"",""};
		ag.anagrams(strs);
	}
	public List<String> anagrams(String[] strs) {
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<strs.length-1; i++){
            String str1 = strs[i];
            //str1 = str1.replaceAll("\\s+","");
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);
            String sstr1 = String.copyValueOf(chars1);
            set.add(sstr1);
            boolean flag = false;
            for(int j=i+1; j<strs.length; j++){
                String str2 = strs[j];
                //str2 = str2.replaceAll("\\s+","");
                char[] chars2 = str2.toCharArray();
                Arrays.sort(chars2);
                String sstr2 = String.copyValueOf(chars2);
                //if(sstr1.equals(sstr2)){
                if(!set.add(sstr2)){
                    if(!flag){
                        flag = true;
                        list.add(str1);
                        list.add(str2);
                    } else {
                        list.add(str2);
                    }
                }
            }
        }
        return list;
    }
}
