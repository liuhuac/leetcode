package edu.clemson.ece.leetcode.MaximumProductOfWordLengths;

public class MaximumProductOfWordLengths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProduct(String[] words) {
        int[] bitMap = new int[words.length];
        for(int i=0; i<words.length; i++){
            for(char c : words[i].toCharArray()){
                bitMap[i] |= 1<<(c-'a');
            }
        }
        int ans = 0;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(((bitMap[i]&bitMap[j])==0) && words[i].length()*words[j].length()>ans){
                    ans = words[i].length()*words[j].length();
                }
            }
        }
        return ans;
    }
}
