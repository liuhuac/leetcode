package edu.clemson.ece.leetcode.CompareVersionNumbers;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareVersionNumbers cvn = new CompareVersionNumbers();
		String s1 = "1";
		String s2 = "0";
		System.out.println(cvn.compareVersion(s1,s2));
	}

	public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int length = Math.max(s1.length, s2.length);
        for(int i=0; i<length; i++){
            int n1 = i<s1.length ? Integer.valueOf(s1[i]) : 0;
            int n2 = i<s2.length ? Integer.valueOf(s2[i]) : 0;
            if(n1 < n2){
                return -1;
            } else if(n1 > n2){
                return 1;
            }
        }
        return 0;
    }
}
