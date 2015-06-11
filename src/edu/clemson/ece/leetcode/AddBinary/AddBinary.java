package edu.clemson.ece.leetcode.AddBinary;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBinary ab  = new AddBinary();
		System.out.println(ab.addBinary("1", "1"));
	}

	public String addBinary(String a, String b) {
        if(0==a.length() && 0==b.length()) return null;
        if(0==a.length()) return b;
        if(0==b.length()) return a;
        
        int length = Math.max(a.length(),b.length());
        int carry = 0;
        String sum = "";
        
        for(int i=0; i<length; i++){
            int va = i<a.length() ? Character.getNumericValue(a.charAt(a.length()-1-i)) : 0;
            int vb = i<b.length() ? Character.getNumericValue(b.charAt(b.length()-1-i)) : 0;
            if(0==va+vb+carry){
                carry = 0;
                sum = "0" + sum;
            } else if(1==va+vb+carry){
                carry = 0;
                sum = "1" + sum;
            } else if(2==va+vb+carry){
                carry = 1;
                sum = "0" + sum;
            } else if(3==va+vb+carry){
                carry = 1;
                sum = "1" + sum;
            }
        }
        if(1==carry) sum = "1" + sum;
        
        return sum;
    }
}
