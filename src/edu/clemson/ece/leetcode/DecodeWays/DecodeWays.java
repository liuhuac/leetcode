package edu.clemson.ece.leetcode.DecodeWays;

public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeWays dw = new DecodeWays();
		System.out.print(dw.numDecodings("111111")-dw.numDecodings("11111"));
	}
	public int numDecodings(String s) {
        int n = s.length();
        if(0==n) return 0;
        if('0'==s.charAt(0)) return 0;
        if(1==n) return 1;
        int prepre = 1;
        int pre = 1;
        for(int i=1; i<n; i++){
            int x = 0;
            int y = 0;
            if('0'==s.charAt(i-1)){
                if('0'==s.charAt(i)){
                    return 0;
                } else {
                    x = 0;
                    y = 1;
                }
            } else {
                if('0'==s.charAt(i)){
                    if('2'<s.charAt(i-1)) return 0;
                    x = 1;
                    y = 0;
                } else {
                    x = Integer.valueOf(s.substring(i-1,i) + s.charAt(i))<=26 ? 1 : 0;
                    y = 1;
                }
            }
            
            int cur = prepre * x + pre * y;
            prepre = pre;
            pre = cur;
        }
        return pre;
    }
}
