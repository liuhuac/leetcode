package edu.clemson.ece.leetcode.WordSearch;

public class WordSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(exist(board, word, i, j, used)) return true;
            }
        }
        return false;
    }
	
    public boolean exist(char[][] board, String word, int i, int j, boolean[][] used) {
        if(i>=board.length || i<0 || j>=board[0].length || j<0) return false;
        if(used[i][j]) return false;
        if(word.charAt(0)==board[i][j]){
            if(1==word.length()) return true;
            used[i][j] = true;
            String sub = word.substring(1);
            if(exist(board, sub, i-1, j, used)
                || exist(board, sub, i+1, j, used)
                || exist(board, sub, i, j-1, used)
                || exist(board, sub, i, j+1, used)){
                return true;    
            }
            used[i][j] = false;
        }
        return false;
    }
}
