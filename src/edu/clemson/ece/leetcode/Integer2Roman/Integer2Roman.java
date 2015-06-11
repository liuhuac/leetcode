package edu.clemson.ece.leetcode.Integer2Roman;

public class Integer2Roman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String intToRoman(int num) {
        String result = "";
        int order = 0;
        while(0!=num){
            result = translate(num%10, order) + result;
            num = num / 10;
            order++;
        }
        return result;
    }
    
    public String translate(int n, int order){
        if(0==n) return "";
        String o = ""; // o for one
        String f = ""; // f for five
        String t = ""; // t for ten
        
        switch(order){
            case 0: o="I"; f="V"; t="X"; break;
            case 1: o="X"; f="L"; t="C"; break;
            case 2: o="C"; f="D"; t="M"; break;
            case 3: o="M"; f=""; t=""; break;
        }
        
        switch(n){
            case 1: return o;
            case 2: return o+o;
            case 3: return o+o+o;
            case 4: return o+f;
            case 5: return f;
            case 6: return f+o;
            case 7: return f+o+o;
            case 8: return f+o+o+o;
            case 9: return o+t;
        }
        
        return "";
    }
}
