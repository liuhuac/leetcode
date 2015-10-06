package edu.clemson.ece.leetcode.GameOfLife;

public class GameOfLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void gameOfLife(int[][] board) {
        int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                int live = 0;
                for(int[] d : dir){
                    if(d[0]+i<0 || d[0]+i>board.length-1 || d[1]+j<0 || d[1]+j>board[0].length-1) continue;
                    if(board[d[0]+i][d[1]+j]==1 || board[d[0]+i][d[1]+j]==2) live++;
                }
                if(board[i][j]==1 && (live<2 || live>3)) board[i][j] = 2;
                if(board[i][j]==0 && live==3) board[i][j] = 3;
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] %= 2;
            }
        }
    }
}
