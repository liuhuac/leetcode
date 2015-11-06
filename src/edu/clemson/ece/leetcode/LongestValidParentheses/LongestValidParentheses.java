package edu.clemson.ece.leetcode.LongestValidParentheses;

public class LongestValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestValidParentheses(String s) {
        int num = 0;
        int max = 0;
        int cur = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                num++;
                cur++;
            } else {
                if(num>0){
                    num--;
                    cur++;
                    if(num==0&&max<cur) max =  cur;
                } else {
                    cur = 0;
                }
            }
        }
        num = 0;
        cur = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==')'){
                num++;
                cur++;
            } else {
                if(num>0){
                    num--;
                    cur++;
                    if(num==0&&max<cur) max =  cur;
                } else {
                    cur = 0;
                }
            }
        }
        return max;
    }
}
