package edu.clemson.ece.leetcode.NumberOfIslands;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numIslands(char[][] grid) {
        int rows = grid.length;
        if(rows==0) return 0;
        int cols = grid[0].length;
        int num = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1'){
                    num++;
                    spread(grid, i, j);
                }
            }
        }
        return num;
    }
    
    public void spread(char[][] grid, int i, int j){
        grid[i][j] = '0';
        if(i!=0 && grid[i-1][j]=='1') spread(grid, i-1, j);
        if(j!=0 && grid[i][j-1]=='1') spread(grid, i, j-1);
        if(i!=grid.length-1 && grid[i+1][j]=='1') spread(grid, i+1, j);
        if(j!=grid[0].length-1 && grid[i][j+1]=='1') spread(grid, i, j+1);
    }
}
