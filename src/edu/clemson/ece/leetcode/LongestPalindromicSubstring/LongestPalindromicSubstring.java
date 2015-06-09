package edu.clemson.ece.leetcode.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestPalindromicSubstring sol = new LongestPalindromicSubstring();
		String s = "ccd";
		System.out.println(sol.longestPalindrome(s));
	}

	public String longestPalindrome(String s) {
        int scan = 0;
        int p = 0;
        int res_left = 0;
        int res_right = 0;
        int max = 0;
        while(scan<s.length()){
            p = 0;
            while(scan-p>=0 && scan+p<=s.length()-1){
                if(s.charAt(scan-p)!=s.charAt(scan+p)){
                    break;
                }
                p++;
            }
            if(max<=2*p-1){
                max = 2*p-1;
                res_left = scan - (p - 1);
                res_right = scan + (p - 1);
            }
            p=0;
            while(scan-p>=0 && scan+p+1<=s.length()-1){
                if(s.charAt(scan-p)!=s.charAt(scan+p+1)){
                    break;
                }
                p++;
            }
            if(max<=2*p){
                max = 2*p;
                res_left = scan - (p - 1);
                res_right = scan + p;
            }
            scan++;
        }
        return s.substring(res_left,res_right+1);
    }
}
