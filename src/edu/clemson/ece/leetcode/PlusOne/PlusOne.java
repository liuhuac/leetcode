package edu.clemson.ece.leetcode.PlusOne;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i=digits.length-1; i>=0; i--){
            int tmp = digits[i];
            if(digits.length-1==i){
                digits[i] = (tmp + 1) % 10;
                carry = (tmp + 1) / 10;
            } else {
                digits[i] = (tmp + carry) % 10;
                carry = (tmp + carry) / 10;
            }
            if(0==carry) break;
        }
        if(1==carry){
            int[] list = new int[digits.length+1];
            list[0] = 1;
            for(int i=0; i<digits.length; i++){
                list[1+i] = digits[i];
            }
            return list;
        }
        return digits;
    }
}
