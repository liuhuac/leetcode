package edu.clemson.ece.leetcode.GenerateParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses gp = new GenerateParentheses();
		System.out.println(gp.generateParenthesis(4).toString());
	}

	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if(1==i){
                res.add("()");
            } else {
                Set<String> set = new HashSet<String>();
                List<String> tmp = new ArrayList<String>();
                for(String s : res){
                    for(int j=0; j<=s.length(); j++){
                        set.add(s.substring(0,j)+"()"+s.substring(j));
                    }
                }
                tmp.addAll(set);
                res = tmp;
            }
        }
        return res;
    }
	
}
