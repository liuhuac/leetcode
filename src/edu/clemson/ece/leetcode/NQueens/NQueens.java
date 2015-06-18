package edu.clemson.ece.leetcode.NQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String[]> solveNQueens(int n) {
        int[] pos = new int[n];
        for(int i=0; i<n; i++) pos[i] = i;
        
        List<String[]> list = new ArrayList<String[]>();
        int times = factorial(n);
        for(int i=0; i<times-1; i++){
            if(isSolution(pos)) list.add(solutionToStringArray(pos));
            pos = nextPer(pos);
        }
        
        return list;
    }
    
    public boolean isSolution(int[] pos){
        int n = pos.length;
        for(int i=0; i<n; i++){
            for(int k=1; k<n; k++){
                if( Math.abs(pos[(n+i-k)%n]-pos[i])<k || Math.abs(pos[(i+k)%n]-pos[i])<k){
                    return false;
                }
            }
        }
        return true;
    }
    
    public int[] nextPer(int[] pos){
        int n = pos.length;
        int comp = pos[pos.length-1];
        int l = n - 2;
        int r = 0;
        while(0<l){
            if(pos[l]<comp){
                r = l;
                while(n>++r){
                    if(pos[r]<pos[l]){
                        pos = swap(pos, l, r);
                        break;
                    }
                }
                break;
            }
            comp = pos[l--];
        }
        return quicksort(pos, l+1, n-1);
    }
    
    public int[] swap(int[] pos, int l, int r){
        int tmp = pos[l];
        pos[l] = pos[r];
        pos[r] = tmp;
        return pos;
    }
    
    public int[] quicksort(int[] pos, int l, int r){
        
    }
    
    public int factorial(int n){
        if(0==n) return 1;
        if(1==n) return 1;
        return n*factorial(n-1);
    }
    
    public String[] solutionToStringArray(int[] pos){
        int n = pos.length;
        String[] sList = new String[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(pos[i]==j){
                    sList[i] += "Q";
                } else {
                    sList[i] += ".";
                }
            }
        }
        return sList;
    }
}
