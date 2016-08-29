package edu.clemson.ece.leetcode.FindTheDifference;

public FindTheDifference Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(int i=0; i<s.length(); i++){
            res ^= s.charAt(i);
            res ^= t.charAt(i);
        }
        res ^= t.charAt(t.length()-1);
        return res;
    }
    
    public char findTheDifference1(String s, String t) {
        int[] freq = new int[26];
        freq[t.charAt(t.length()-1)-'a']--;
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        char res = 'a';
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                res = (char)('a' + i);
            }
        }
        return res;
    }
}
