package edu.clemson.ece.leetcode.PermutationSequence;

public class PermutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getPermutation(int n, int k) {
        if(1==n) return "1";
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[n];
        for(int i=n-1; i>0; i--){
            int xth;
            if(0==k%factorial(i)){
                xth = k/factorial(i);
                k = factorial(i);
            } else {
                xth = 1 + k/factorial(i);
                k %= factorial(i);
            }
            int x = 0;
            for(int j=0; j<n; j++){
                if(!used[j]) x++;
                if(x==xth){
                    x = j;
                    used[j] = true;
                    break;
                }
            }
            sb.append(1+x);
        }
        for(int j=0; j<n; j++){
            if(!used[j]) sb.append(1+j);
        }
        return sb.toString();
    }
    public int factorial(int n){
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }
}
