package edu.clemson.ece.leetcode.MinStack;

import java.util.ArrayList;
import java.util.List;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	List<Integer> stack = new ArrayList<Integer>();
    List<Integer> min = new ArrayList<Integer>();
    
    public void push(int x) {
        if(stack.isEmpty()){
            min.add(x);
        } else {
            int i=0;
            for(; i<min.size(); i++){
                if(min.get(i)>x){
                    break;
                }
            }
            min.add(i, x);
        }
        stack.add(x);
    }

    public void pop() {
        if(!stack.isEmpty()){
            int x = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            for(int i=0; i<min.size(); i++){
                if(min.get(i)==x){
                    min.remove(i);
                    break;
                }
            }
        }
    }

    public int top() {
        if(stack.isEmpty()){
            return 0;
        } else {
            return stack.get(stack.size()-1);
        }
    }

    public int getMin() {
        if(stack.isEmpty()){
            return 0;
        } else {
            return min.get(0);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(3, 6);
		System.out.println(l.toString());*/
		
		TimeLimitExceeded ms = new TimeLimitExceeded();
		ms.push(-10000);
		ms.push(-10001);
		ms.push(-9998);
		ms.push(-9997);
		ms.push(-9996);
	}

}
