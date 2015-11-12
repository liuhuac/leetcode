package edu.clemson.ece.leetcode.InterleavingString;

public class InterleavingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
		String s2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
		String s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
		
		InterleavingString tle = new InterleavingString();
		if(tle.isInterleave(s1, s2, s3)){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length()!=s1.length()+s2.length()) return false;
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        for(int i=0; i<=s1.length(); i++){
            for(int j=0; j<=s2.length(); j++){
                if(i==0&&j==0){
                    dp[i][j] = true;
                } else if(i==0){
                    dp[i][j] = dp[i][j-1] && s3.charAt(i+j-1)==s2.charAt(j-1);
                } else if(j==0){
                    dp[i][j] = dp[i-1][j] && s3.charAt(i+j-1)==s1.charAt(i-1);
                } else {
                    dp[i][j] = dp[i-1][j]&&s3.charAt(i+j-1)==s1.charAt(i-1) || dp[i][j-1] && s3.charAt(i+j-1)==s2.charAt(j-1);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
