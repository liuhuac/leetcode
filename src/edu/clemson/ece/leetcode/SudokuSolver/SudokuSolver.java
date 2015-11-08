package edu.clemson.ece.leetcode.SudokuSolver;

public class SudokuSolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void solveSudoku(char[][] board) {
        if(board==null||board.length!=9||board[0].length!=9) return;
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    for(char c='1'; c<='9'; c++){
                        if(isValid(i,j,board,c)){
                            board[i][j] = c;
                            if(solve(board)){
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true; // attention
    }
    public boolean isValid(int i, int j, char[][] board, char c){
        for(int k=0; k<9; k++){
            if(board[i][k]==c || board[k][j]==c) return false;
        }
        int iStart = i/3*3;
        int jStart = j/3*3;
        for(int m=iStart; m<iStart+3; m++){
            for(int n=jStart; n<jStart+3; n++){
                if(board[m][n]==c) return false;
            }
        }
        return true;
    }
}
