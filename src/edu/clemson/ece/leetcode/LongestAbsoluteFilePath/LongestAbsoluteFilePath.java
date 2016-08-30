package edu.clemson.ece.leetcode.LongestAbsoluteFilePath;

public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); /* dummy node */
        int res = 0;
        for(String s : input.split("\n")){
            int level = s.lastIndexOf('\t')+2; /* root level counting from 1 */
            while(level<stack.size()) stack.pop();
            int len = stack.peek()+(s.length()-s.lastIndexOf('\t')); /* include "/" */
            stack.push(len);
            /* minus 1 because the dummy node leads to counting a "/" in the begining */
            if(s.contains(".") && res<len-1) res = len-1; 
        }
        return res;
    }
    
    /* can not distinguish a file path, 
 *        e.g., input "a" is not a file path, should return 0
 *               however the following answer returns 1 */
    public int lengthLongestPathWrongAnswer(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); /* root folder with length 0 */
        int res = 0;
        int level = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='\t'){
                level++;
            } else if(input.charAt(i)=='\n'){
                if(res<stack.peek()) res = stack.peek();
                level = 0;
            } else {
                if(i==0 || input.charAt(i-1)=='\t' || input.charAt(i-1)=='\n'){
                    while(level<stack.size()) stack.pop();
                    if(level==0){
                        stack.push(0);
                    } else {
                        stack.push(stack.peek()+1); /* +1 is slash */
                    }
                }
                stack.push(stack.pop()+1);
            }
        }
        /* need to compare because string ends withou \t */
        return res>stack.peek() ? res : stack.peek(); /* -1 remove the last slash */
    }
}
