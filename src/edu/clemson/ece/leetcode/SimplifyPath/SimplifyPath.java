package edu.clemson.ece.leetcode.SimplifyPath;

import java.util.Stack;

public class SimplifyPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplifyPath sp = new SimplifyPath();
		System.out.print(sp.simplifyPath("/.."));
	}
	public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<parts.length; i++){
            // 1. use str.equals() 2. don't forget "continue;" 3. check if stack empty
            // 4. read split() definition
            if(parts[i].equals("..") && !stack.isEmpty()) stack.pop();
            if(parts[i].equals(".") || parts[i].equals("") || parts[i].equals("..")) continue;
            stack.push(parts[i]);
        }
        String results = "";
        while(!stack.isEmpty()){
            results = "/" + stack.pop() + results;
        }
        return results.isEmpty() ? "/" : results;
    }
}
