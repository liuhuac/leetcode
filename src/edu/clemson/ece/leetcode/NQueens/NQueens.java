package edu.clemson.ece.leetcode.NQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	/**
	 * @param args
	 */
	List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++) 
                board[i][j] = '.';
        dfs(board,0);
        return ans;
    }
    public void dfs(char[][] board, int row){
        if(row==board[0].length){
            ans.add(toListString(board));
            return;
        }
        for(int j=0; j<board[0].length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                dfs(board,row+1);
                board[row][j] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col){
        for(int i=0; i<board.length; i++) 
            if( board[row][i]=='Q' ||
                board[i][col]=='Q' ||
                
                row-i>=0&&col-i>=0&&board[row-i][col-i]=='Q' ||
                row+i<board.length&&col+i<board.length&&board[row+i][col+i]=='Q' ||
                
                row-i>=0&&col+i<board.length&&board[row-i][col+i]=='Q' ||
                row+i<board.length&&col-i>=0&&board[row+i][col-i]=='Q')
                    return false;
        return true;
    }
    public List<String> toListString(char[][] board){
        List<String> ls = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String str = "";
            for(int j=0; j<board[0].length; j++) str += board[i][j];
            ls.add(str);
        }
        return ls;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1 = 2%3;
		int test2 = -2%3;
		int test3 = (-2)%3;
		NQueens nq = new NQueens();
		nq.solveNQueens(4);
	}

}
