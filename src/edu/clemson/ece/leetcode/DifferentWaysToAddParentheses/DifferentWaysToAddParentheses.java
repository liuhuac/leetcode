package edu.clemson.ece.leetcode.DifferentWaysToAddParentheses;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ans = new ArrayList<Integer>();
        if(input.length()==0) return ans;
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c=='+' || c=='-' || c=='*'){
                String a = input.substring(0,i);
                String b = input.substring(i+1);
                List<Integer> parta = diffWaysToCompute(a);
                List<Integer> partb = diffWaysToCompute(b);
                for(int na : parta){
                    for(int nb : partb){
                        int res = 0;
                        switch(c){
                            case '+' : res = na + nb; break;
                            case '-' : res = na - nb; break;
                            case '*' : res = na * nb; break;
                        }
                        ans.add(res);
                    }
                }
            }
        }
        if(ans.size()==0) ans.add(Integer.valueOf(input));
        return ans;
    }
}
