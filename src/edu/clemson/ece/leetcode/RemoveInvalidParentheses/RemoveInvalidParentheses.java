package edu.clemson.ece.leetcode.RemoveInvalidParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RemoveInvalidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        if(s==null) return ans; // attention, remove s.length()==0, Input "", Output [""], not []
        Queue<String> q = new LinkedList<>();
        q.add(s);
        Set<String> tested = new HashSet<>();
        tested.add(s);
        boolean found = false;
        while(!q.isEmpty()){
            String str = q.remove();
            if(isValid(str)){
                ans.add(str);
                found = true;
            }
            if(found) continue; // attention, avoid adding q once found the first
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c!='('&&c!=')') continue;
                String newstr = str.substring(0,i)+str.substring(i+1);
                if(!tested.contains(newstr)) {
                    q.add(newstr);
                    tested.add(newstr);
                }
            }
        }
        return ans;
    }
    public boolean isValid(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(') {
                count++;
            } else if(c==')'){
                count--;
            }
            if(count<0) return false;
        }
        return count==0;
    }
}
