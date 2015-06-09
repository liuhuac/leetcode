package edu.clemson.ece.leetcode.PalindromeNumber;

public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(1001));
	}

	public boolean isPalindrome(int x) {
        int order = 0;
        if(x<0){
            return false;
        }
        int tmp = x;
        while(tmp!=0){
            tmp = tmp/10;
            order++;
        }
        for(int i=0; i<order/2; i++){
        	/*int test1 = x/(int)Math.pow(10,(order-i-1));
        	int test2 = (x/(int)Math.pow(10,i))%10;*/
            if((x/(int)Math.pow(10,(order-i-1)))%10 != (x/(int)Math.pow(10,i))%10){
                return false;
            }
        }
        return true;
    }
}
