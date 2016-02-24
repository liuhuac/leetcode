package edu.clemson.ece.leetcode.SuperUglyNumber;

public class SuperUglyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ans = new int[n];
        ans[0] = 1;
        int[] index = new int[primes.length];
        
        for(int i=1; i<n; i++){
            ans[i] = Integer.MAX_VALUE;
            for(int j=0; j<primes.length; j++){
                if(ans[i]>primes[j]*ans[index[j]]){
                    ans[i] = primes[j]*ans[index[j]];
                }
            }
            for(int j=0; j<primes.length; j++){
                if(ans[i]==primes[j]*ans[index[j]]){
                    index[j]++;
                }
            }
        }
        
        return ans[n-1];
    }
	
}
