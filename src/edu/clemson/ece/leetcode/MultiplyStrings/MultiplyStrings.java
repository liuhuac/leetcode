package edu.clemson.ece.leetcode.MultiplyStrings;

public class MultiplyStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyStrings ms = new MultiplyStrings();
		System.out.print(ms.multiply("9", "99"));
	}
	public String multiply(String num1, String num2) {
        int sign = 1;
        if('-'==num1.charAt(0)){
            sign *= -1;
            num1 = num1.substring(1);
        }
        if('-'==num2.charAt(0)){
            sign *= -1;
            num2 = num2.substring(1);
        }
        if(num1.equals("0")||num2.equals("0")) return "0";
        String res = "";
        for(int i=0; i<num2.length(); i++){
            int c2 = (int)(num2.charAt(i)-'0');
            int carry = 0;
            String cur = "";
            res += "0";
            int len = Math.max(num1.length(), res.length());
            for(int j=0; j<len; j++){
                int c1 = num1.length()-j-1 < 0 ? 0 : (int)(num1.charAt(num1.length()-j-1)-'0');
                int r = res.length()-j-1 < 0 ? 0 : (int)(res.charAt(res.length()-j-1)-'0');
                int value = c1 * c2 + carry + r;
                carry = value / 10;
                cur = Integer.toString(value%10) + cur;
            }
            if(0!=carry) cur = Integer.toString(carry) + cur;
            res = cur;
        }
        return sign==1 ? res : "-" + res;
    }
}
