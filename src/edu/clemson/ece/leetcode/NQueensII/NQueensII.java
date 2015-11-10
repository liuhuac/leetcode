package edu.clemson.ece.leetcode.NQueensII;

import java.util.HashSet;
import java.util.Set;

public class NQueensII {

	Set<Integer> col = new HashSet<>();
    Set<Integer> diag1 = new HashSet<>();
    Set<Integer> diag2 = new HashSet<>();
    int ans = 0;
    int n = 0;
    public int totalNQueens(int n) {
        this.n = n;
        helper(0);
        return ans;
    }
    public void helper(int row){
        if(row==n) {
            ans++;
        } else {
            for(int i=0; i<n; i++){
                if(col.contains(i) || diag1.contains(row-i) || diag2.contains(row+i)) continue;
                col.add(i);
                diag1.add(row-i);
                diag2.add(row+i);
                helper(row+1);
                col.remove(i);
                diag1.remove(row-i);
                diag2.remove(row+i);
            }
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
