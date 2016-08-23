package edu.clemson.ece.leetcode.FirstUniqueCharacterInAString

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] frq = new int[26];
        for(int i=0; i<s.length(); i++) frq[s.charAt(i)-'a']++;
        for(int i=0; i<s.length(); i++){
            if(frq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
