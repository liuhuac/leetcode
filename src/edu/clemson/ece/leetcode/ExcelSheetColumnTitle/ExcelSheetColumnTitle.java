package edu.clemson.ece.leetcode.ExcelSheetColumnTitle;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String convertToTitle(int n) {
        String result = "";
        while(0!=n){
            char c;
            if(0==n%26){
                c = 'Z';
            } else {
                c = (char)('A' + (n%26 - 1));
            }
            result = c + result;
            n = (n - (int)(c-'A'+1)) / 26;
        }
        return result;
    }

}
