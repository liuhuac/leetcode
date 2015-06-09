package edu.clemson.ece.leetcode.ReverseInteger;

public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(-2147483648));

	}

	public int reverse(int x) {
        int n;
        int result = 0;
        int sign = 1;
        if(x<0){
        	if(x<-Integer.MAX_VALUE){
        		return 0;
        	}
            sign = -1;
            x = -x;
        }
        do{
        	if(result>Integer.MAX_VALUE/10){
        		return 0;
        	}
            result = result * 10 + x%10;
            x = x / 10;
        }while((n=x/10)!=0||x!=0);
        return sign*result;
    }
}
