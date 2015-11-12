package edu.clemson.ece.leetcode.InterleavingString;

public class TimeLimitExceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
		String s2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
		String s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
		
		TimeLimitExceeded tle = new TimeLimitExceeded();
		if(tle.isInterleave(s1, s2, s3)){
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()==0) return s3.equals(s2);
        if(s2.length()==0) return s3.equals(s1);
        if(s1.length()+s2.length()!=s3.length()) return false;
        
        if(s3.charAt(0)!=s1.charAt(0) && s3.charAt(0)!=s2.charAt(0)) return false;
        if(s3.charAt(0)==s1.charAt(0) && s3.charAt(0)==s2.charAt(0)) 
            return isInterleave(s1.substring(1),s2,s3.substring(1)) || isInterleave(s1,s2.substring(1),s3.substring(1));
        if(s3.charAt(0)==s1.charAt(0)) return isInterleave(s1.substring(1),s2,s3.substring(1));
        if(s3.charAt(0)==s2.charAt(0)) return isInterleave(s1,s2.substring(1),s3.substring(1));
        
        return false;
    }
}
