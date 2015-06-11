package edu.clemson.ece.leetcode.ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	/**
	 * @param args
	 */
	Set<Character> chars = new HashSet<Character>();
    public boolean isValidSudoku(char[][] board) {
        if(null==board) return false;
        if(9!=board.length) return false;
        if(9!=board[0].length) return false;
        
        for(int i=0; i<9; i++){ // check rows
            chars.clear();
            for(int j=0; j<9; j++){
                if('.'!=board[i][j]){
                    if(!chars.add(board[i][j])){
                        return false;
                    }
                }
            }
        }
        
        for(int i=0; i<9; i++){ // check cols
            chars.clear();
            for(int j=0; j<9; j++){
                if('.'!=board[j][i]){
                    if(!chars.add(board[j][i])){
                        return false;
                    }
                }
            }
        }
        
        for(int i=0; i<3; i++){ // check blocks
            for(int j=0; j<3; j++){
                chars.clear();
                for(int p=0; p<3; p++){
                    for(int q=0; q<3; q++){
                        if('.'!=board[i*3+p][j*3+q]){
                            if(!chars.add(board[i*3+p][j*3+q])){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
