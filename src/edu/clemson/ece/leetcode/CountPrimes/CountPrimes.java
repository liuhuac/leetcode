package edu.clemson.ece.leetcode.CountPrimes;

public class CountPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes cp = new CountPrimes();
		System.out.println(cp.countPrimes(3));
	}

	public int countPrimes(int n) {
        if(0==n||1==n){
            return 0;
        }
        boolean [] array = new boolean[n];
        array[0] = array[1] = true;
        for(int i=2; i<=n/2; i++){
            for(int j=2; i*j<n; j++){
                array[i*j] = true;
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(false==array[i]){
                count++;
            }
        }
        return count;
    }
}
