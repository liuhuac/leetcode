package edu.clemson.ece.leetcode.BasicCalculatorII;

public class BasicCalculatorII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculatorII bc = new BasicCalculatorII();
		bc.calculate("0-2147483647");
	}
	public int calculate(String s) {
        int res = 0;
        int curnum = 0;
        int prenum = 0;
        char sign = '+';
        for(int i=0; i<s.length(); i++){
            while(i<s.length()&&Character.isDigit(s.charAt(i))){
                curnum = curnum*10+(int)(s.charAt(i)-'0');
                i++;
            }
            if(i>=s.length()-1 || (!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i))) { // attention i>=s.length()-1
                if(sign=='+') {
                    res += prenum;
                    prenum = curnum;
                } else if(sign=='-') {
                    res += prenum;
                    prenum = -curnum;
                } else if(sign=='*') {
                    prenum *= curnum;
                } else if(sign=='/') {
                    prenum /= curnum;
                }
                if(i<s.length()) sign = s.charAt(i); // attention
                curnum = 0;
            }
        }
        return res+prenum; // attention
    }
}
