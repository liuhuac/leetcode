package edu.clemson.ece.leetcode.LargestNumber;

import java.util.Arrays;

public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,2};
		LargestNumber ln = new LargestNumber();
		System.out.print(ln.largestNumber(nums));
	}
	public String largestNumber(int[] nums) {
        if(0==nums.length) return "";
        if(1==nums.length) return Integer.toString(nums[0]);
        StrNum[] strnum = new StrNum[nums.length];
        for(int i=0; i<nums.length; i++){
            strnum[i] = new StrNum(nums[i]);
        }
        Arrays.sort(strnum);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strnum.length; i++){
            sb.append(strnum[strnum.length-1-i].str);
        }
        return strnum[strnum.length-1].str.equals("0") ? "0" : sb.toString();
    }
}

class StrNum implements Comparable<StrNum> {
    String str;
    public StrNum(int n){
        str = Integer.toString(n);
    }
    @Override
    public int compareTo(StrNum str2){
        String s1 = str + str2.str;
        String s2 = str2.str + str;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)>s2.charAt(i)) return 1;
            if(s1.charAt(i)<s2.charAt(i)) return -1;
        }
        return 0;
    }
}