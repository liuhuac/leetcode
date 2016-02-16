package edu.clemson.ece.leetcode.AdditiveNumber;

public class AdditiveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for(int i=1; i<=(len-1)/2; i++){
            if(num.charAt(0) == '0' && i>=2) break;
            for(int j=i+1; (len-j)>=i && (len-j)>=(j-i); j++){
                if(num.charAt(i) == '0' && j-i>=2) break;
                
                long num1 = Long.valueOf(num.substring(0,i));
                long num2 = Long.valueOf(num.substring(i,j));
                
                if(isAdditiveNumber(num.substring(j),num1,num2)) return true;
            }
        }
        return false;
    }
    
    public boolean isAdditiveNumber(String num, long num1, long num2) {
        if(num.equals("")) return true;
        String sub = ((Long)(num1+num2)).toString();
        if(!num.startsWith(sub)) return false;
        return isAdditiveNumber(num.substring(sub.length()),num2,num1+num2);
    }
}
