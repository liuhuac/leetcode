package edu.clemson.ece.leetcode.LongestCommonPrefix;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] strs = {"aaa","aa","aaa"};
		System.out.println(lcp.longestCommonPrefix(strs));
	}
	
	public String longestCommonPrefix(String[] strs) {
        if(0==strs.length){
            return "";
        }
        if(1==strs.length){
            return strs[0];
        }
        int prefix = strs[0].length();
        int tmp = 0;
        for(int i=1; i<strs.length; i++){
            if(0==strs[i-1].length() || 0==strs[i].length()){
                return "";
            }
            tmp = 0;
            for(int j=0; j<prefix && j<strs[i].length(); j++){
                if(strs[i-1].charAt(j) != strs[i].charAt(j)){     
                    break;
                }
                tmp++;
            }
            if(tmp<prefix){
            	prefix = tmp;
            }
        }
        return strs[0].substring(0,prefix);
    }

}
