package edu.clemson.ece.leetcode.IntegerToEnglishWords;

public class IntegerToEnglishWords {

	/**
	 * @param args
	 */
	String[] thousands = new String[]{"", "Thousand", "Million", "Billion"};
    String[] lessthan20 = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public String numberToWords(int num) {
        if(0==num) return "Zero";
        String ans = "";
        int i = 0;
        while(0!=num){
            if(0!=num%1000){
                ans = helper(num%1000) + thousands[i] + " " + ans;
            }
            i++;
            num /= 1000;
        }
        return ans.trim();
    }
    
    public String helper(int num){
        if (num == 0)
            return "";
        else if (num < 20)
            return lessthan20[num] + " ";
        else if (num < 100)
            return tens[num/10] + " " + helper(num%10);
        else
            return lessthan20[num/100] + " Hundred " + helper(num%100);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerToEnglishWords test = new IntegerToEnglishWords();
		test.numberToWords(1000);
	}

}
