/**
 *  * // This is the interface that allows for creating nested lists.
 *   * // You should not implement it, or speculate about its implementation
 *    * public interface NestedInteger {
 *     *     // Constructor initializes an empty nested list.
 *      *     public NestedInteger();
 *       *
 *        *     // Constructor initializes a single integer.
 *         *     public NestedInteger(int value);
 *          *
 *           *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *            *     public boolean isInteger();
 *             *
 *              *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *               *     // Return null if this NestedInteger holds a nested list
 *                *     public Integer getInteger();
 *                 *
 *                  *     // Set this NestedInteger to hold a single integer.
 *                   *     public void setInteger(int value);
 *                    *
 *                     *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *                      *     public void add(NestedInteger ni);
 *                       *
 *                        *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *                         *     // Return null if this NestedInteger holds a single integer
 *                          *     public List<NestedInteger> getList();
 *                           * }
 *                            */
package edu.clemson.ece.leetcode.MiniParser
public class MiniParser {
	public NestedInteger deserialize(String s) {
		Stack<NestedInteger> stack = new Stack<>();
		int sign = 1;
		int number = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='['){
				stack.push(new NestedInteger());
			} else if (s.charAt(i)==','){
				if(s.charAt(i-1)!=']'){
					stack.peek().add(new NestedInteger(sign*number));
					sign = 1;
					number = 0;
				}
			} else if (s.charAt(i)==']'){
				if (s.charAt(i-1)>='0' && s.charAt(i-1)<='9'){
					stack.peek().add(new NestedInteger(sign*number));
					sign = 1;
					number = 0;
				}
				NestedInteger tmp = stack.pop();
				if(!stack.isEmpty()){
					stack.peek().add(tmp);
				} else { // last ']', return
					return tmp;
				}
			} else if (s.charAt(i)=='-'){
				sign = -1;
			} else {
				number = 10*number + (int)(s.charAt(i)-'0');
			}
		}
		return new NestedInteger(sign*number); // program does not ended in for-loop, means no ']' in string
	}
}
