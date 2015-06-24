package edu.clemson.ece.leetcode.GasStation;

public class GasStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int total = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            total += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if(tank<0){
                start = i + 1;
                tank = 0;
            }
        }
        if(total>=0){
            return start%gas.length;
        } else {
            return -1;
        }
    }

}
