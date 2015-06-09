package edu.clemson.ece.leetcode.String2Integer;

public class String2Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String2Integer s2i = new String2Integer();
		System.out.println(s2i.myAtoi("abc"));
	}

	public int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        int i = 0;
        char c = ' ';
        boolean started = false;
        int result = 0;
        int sign = 1;
        while(i<str.length()){
            c=str.charAt(i);
            if(c==' ' && !started){
            	i++;
                continue;
            }
            if(c=='+' && !started) {
                sign = 1;
            } else if(c=='-' && !started) {
                sign = -1;
            } else if(c<'0'||c>'9'){
                break;
            } else {
                if(result>Integer.MAX_VALUE/10){
                    if(sign==1){
                        return Integer.MAX_VALUE;
                    }
                    if(sign==-1){
                        return Integer.MIN_VALUE;
                    }
                } else if(result==Integer.MAX_VALUE/10 && (c-'0')>7){
                    if(sign==1){
                        return Integer.MAX_VALUE;
                    }
                    if(sign==-1){
                        return Integer.MIN_VALUE;
                    }
                }
                result = result * 10 + (c - '0');
            }
            started = true;
            i++;
        }
        return result*sign;
    }
}
