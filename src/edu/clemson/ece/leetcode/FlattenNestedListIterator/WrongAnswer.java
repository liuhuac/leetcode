package edu.clemson.ece.leetcode.FlattenNestedListIterator;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public class NestedIterator implements Iterator<Integer> {

	    Stack<List<NestedInteger>> stack = new Stack<>();
	    
	    public NestedIterator(List<NestedInteger> nestedList) {
	        if(!nestedList.isEmpty() && nestedList.get(0)!=null) stack.push(nestedList);
	    }

	    @Override
	    public Integer next() {
	        if(!hasNext()) return null;
	        List<NestedInteger> topList = stack.pop();
	        while(!topList.get(0).isInteger()){
	            NestedInteger cur = topList.get(0);
	            topList.remove(0);
	            if(!topList.isEmpty()) stack.push(topList);
	            topList = cur.getList();
	        }
	        NestedInteger res = topList.get(0);
	        topList.remove(0);
	        if(!topList.isEmpty()) stack.push(topList);
	        return res.getInteger();
	    }

	    @Override
	    public boolean hasNext() {
	        if(!stack.isEmpty() && !stack.peek().isEmpty()){
	            return true;
	        } else {
	            return false;
	        }
	    }
	}
}
