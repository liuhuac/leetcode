package edu.clemson.ece.leetcode.LongestPalindromicSubstring;

public class TimelimitExceed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		
		TimelimitExceed sol = new TimelimitExceed();
		System.out.println(sol.longestPalindrome(s));
	}

	public String longestPalindrome(String s) {
        int begin = 0;
        int end = 0;
        int left = 0;
        int right = 0;
        int res_left = 0;
        int res_right = 0;
        int max = 0;
        int tmp = 0;
        while(begin<s.length()){
            end = s.length()-1;
            while(begin<=end){
                if(s.charAt(begin)!=s.charAt(end)){
                    end--;
                    continue;
                }
                if(end-begin<max){
                    break;
                }
                left = begin+1;
                right = end-1;
                tmp = 2;
                while(right>=left){
                    if(right==left){
                        tmp += 1;
                        break;
                    }
                    if(s.charAt(left)==s.charAt(right)){
                        tmp += 2;
                        right--;
                        left++;
                        continue;
                    }
                    break;
                }
                if(right<=left&&tmp>max){
                	max = tmp;
                    res_left = begin;
                    res_right = end;
                    break;
                }
                end--;
            }
            begin++;
        }
        return s.substring(res_left,res_right);
    }
}
