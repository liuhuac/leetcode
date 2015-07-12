package edu.clemson.ece.leetcode.RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        String cur = "";
        restoreIpAddresses(ans, cur, s, 0, 0);
        return ans;
    }
    public void restoreIpAddresses(List<String> ans, String cur, String s, int start, int k){
        if(3==k){
            String str = s.substring(start);
            if(start<s.length()){
                if(isValid(str)){
                    ans.add(new String(cur + str));
                }
            }
            return;
        }
        if(start<s.length()) restoreIpAddresses(ans, cur+s.charAt(start)+".", s, start+1, k+1);
        if(start+1<s.length()) {
            String str = ""+s.charAt(start)+s.charAt(start+1);
            if(isValid(str)) restoreIpAddresses(ans, cur+str+".", s, start+2, k+1);
        }
        if(start+2<s.length()) {
            String str = ""+s.charAt(start)+s.charAt(start+1)+s.charAt(start+2);
            if(isValid(str)) restoreIpAddresses(ans, cur+str+".", s, start+3, k+1);
        }
    }
    public boolean isValid(String str) {
        int n = str.length();
        if(3<n) return false;
        if(1==n) return true;
        if('0'==str.charAt(0)) return false;
        if(3==n) {
            if(Integer.valueOf(str)>255) return false;
        }
        return true;
    }
}
