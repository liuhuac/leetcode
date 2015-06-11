package edu.clemson.ece.leetcode.CountAndSay;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay tle = new CountAndSay();
		System.out.println(tle.countAndSay(30));
	}

	public String countAndSay(int n) {
        if(1==n) return "1";
        return read(countAndSay(n-1));
    }
    
    public String read(String s){
        char c = s.charAt(0);
        int n = 0;
        String result = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=c){
                result += Integer.toString(n) + c;
                c = s.charAt(i);
                n = 1;
            } else {
                n++;
            }
        }
        result += Integer.toString(n) + c;
        
        return result;
    }
}
