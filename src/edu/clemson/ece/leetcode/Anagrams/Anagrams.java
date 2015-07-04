package edu.clemson.ece.leetcode.Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams ag = new Anagrams();
		String[] strs = new String[]{"",""};
		ag.anagrams(strs);
	}
	public List<String> anagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<strs.length; i++){
            String str1 = strs[i];
            str1.replace("\\s+","");
            char[] chars1 = str1.toCharArray();
            Arrays.sort(chars1);
            String sstr1 = String.copyValueOf(chars1);
            List<String> l = null;
            if(!hm.containsKey(sstr1)){
                l = new ArrayList<>();
            } else {
                l = hm.get(sstr1);
            }
            l.add(str1);
            hm.put(sstr1,l);
        }
        for(Map.Entry<String, List<String>> entry: hm.entrySet()){
            List<String> value = entry.getValue();
            if(value.size()>1){
                list.addAll(value);
            }
        }
        return list;
    }
}
