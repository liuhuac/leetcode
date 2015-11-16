package edu.clemson.ece.leetcode.ExpressionAddOperators;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionAddOperators eao = new ExpressionAddOperators();
		eao.addOperators("105", 5);
	}

	public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        if(num==null || num.length()==0) return ans;
        addOperators(ans, "", num, (long)target, 0);
        return ans;
    }
    public void addOperators(List<String> ans, String trace, String str, long target, long pre) {
        if(str.length()==0 && target==0) ans.add(trace);
        for(int i=1; i<=str.length(); i++){
            if(i!=1 && str.charAt(0)=='0') break; // attention
            long cur = Long.valueOf(str.substring(0,i));
            if(trace.length()==0){
                addOperators(ans, trace+cur, str.substring(i), target-cur, cur);
            } else {
                addOperators(ans, trace+"+"+cur, str.substring(i), target-cur, cur);
                addOperators(ans, trace+"-"+cur, str.substring(i), target+cur, -cur);
                addOperators(ans, trace+"*"+cur, str.substring(i), target+pre-pre*cur, pre*cur);
            }
        }
    }
}
