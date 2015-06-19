package edu.clemson.ece.leetcode.SearchA2DMatrix;

public class SearchA2DMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchA2DMatrix sm = new SearchA2DMatrix();
		int[][] matrix = {{1},{3}};
		int target = 2;
		System.out.print(sm.searchMatrix(matrix, target));
	}

	public boolean searchMatrix(int[][] matrix, int target) {
        if(0==matrix.length) return false;
        if(0==matrix[0].length) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = searchRow(matrix, target, 0, m-1);
        if(-1==row) return false;
        int l = 0;
        int r = n - 1;
        while(l<=r){
            if(l==r&&matrix[row][l]==target) return true;
            if(l==r&&matrix[row][l]!=target) return false;
            int mid = l + (r - l)/2;
            if(matrix[row][mid] > target){
                r = mid - 1;
            } else if(matrix[row][mid] < target){
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
    
    public int searchRow(int[][] matrix, int target, int l, int r) {
        if(matrix[l][0]>target) return -1;
        while(l<=r){
            if(l==r) return l;
            int mid = l + (r - l)/2;
            if(l==mid){
            	if(matrix[r][0]<=target){
            		return r;
            	} else {
            		return l;
            	}
            }
            if(matrix[mid][0] > target){
                r = mid - 1;
            } else if(matrix[mid][0] < target){
                l = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
}
