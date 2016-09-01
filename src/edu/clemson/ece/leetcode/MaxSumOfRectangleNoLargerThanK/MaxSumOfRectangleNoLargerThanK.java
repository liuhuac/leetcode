package edu.clemson.ece.leetcode.MaxSumOfRectangleNoLargerThanK;

public class MaxSumOfRectangleNoLargerThanK {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        
        int max = Integer.MIN_VALUE;
        int left=0, right=0, top=0, bottom=0;
        
        for(int i=0; i<matrix[0].length; i++){
            int[] col = new int[matrix.length];
            for(int j=i; j<matrix[0].length; j++){
                for(int ii=0; ii<matrix.length; ii++) col[ii] += matrix[ii][j];
                int curSum = 0;
                TreeSet<Integer> treeSet = new TreeSet<>();
                treeSet.add(0);
                for(int c : col){
                    curSum += c;
                    Integer index = treeSet.ceiling(curSum-k);
                    if(index!=null) max = Math.max(max, curSum-index);
                    treeSet.add(curSum);
                }
            }
        }
        
        return max;
    }
}
