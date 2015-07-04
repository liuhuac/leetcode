package edu.clemson.ece.leetcode.SurroundedRegions;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    int i;
    int j;
    Point(int i, int j){
        this.i = i;
        this.j = j;
    }
}

public class SurroundedRegions {
	public static char[][] str2char(String[] strs){
		int row = strs.length;
		int col = strs[0].length();
		char[][] board = new char[row][col];
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				board[i][j] = strs[i].charAt(j);
			}
		}
		return board;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ["XOOOOOOOOOOOOOOOOOOO","OXOOOOXOOOOOOOOOOOXX","OOOOOOOOXOOOOOOOOOOX","OOXOOOOOOOOOOOOOOOXO","OOOOOXOOOOXOOOOOXOOX","XOOOXOOOOOXOXOXOXOXO","OOOOXOOXOOOOOXOOXOOO","XOOOXXXOXOOOOXXOXOOO","OOOOOXXXXOOOOXOOXOOO","XOOOOXOOOOOOXXOOXOOX","OOOOOOOOOOXOOXOOOXOX","OOOOXOXOOXXOOOOOXOOO","XXOOOOOXOOOOOOOOOOOO","OXOXOOOXOXOOOXOXOXOO","OOXOOOOOOOXOOOOOXOXO","XXOOOOOOOOXOXXOOOXOO","OOXOOOOOOOXOOXOXOXOO","OOOXOOOOOXXXOOXOOOXO","OOOOOOOOOOOOOOOOOOOO","XOOOOXOOOXXOOXOXOXOO"]
		String[] strs = new String[]{"XOOOOOOOOOOOOOOOOOOO","OXOOOOXOOOOOOOOOOOXX","OOOOOOOOXOOOOOOOOOOX","OOXOOOOOOOOOOOOOOOXO","OOOOOXOOOOXOOOOOXOOX","XOOOXOOOOOXOXOXOXOXO","OOOOXOOXOOOOOXOOXOOO","XOOOXXXOXOOOOXXOXOOO","OOOOOXXXXOOOOXOOXOOO","XOOOOXOOOOOOXXOOXOOX","OOOOOOOOOOXOOXOOOXOX","OOOOXOXOOXXOOOOOXOOO","XXOOOOOXOOOOOOOOOOOO","OXOXOOOXOXOOOXOXOXOO","OOXOOOOOOOXOOOOOXOXO","XXOOOOOOOOXOXXOOOXOO","OOXOOOOOOOXOOXOXOXOO","OOOXOOOOOXXXOOXOOOXO","OOOOOOOOOOOOOOOOOOOO","XOOOOXOOOXXOOXOXOXOO"};
		char[][] board = str2char(strs);
		
		SurroundedRegions sr = new SurroundedRegions();
		sr.solve(board);
	}

	public void solve(char[][] board) {
        if(0==board.length) return;
        for(int i=0; i<board.length; i++){
            if('O'==board[i][0]) spread(board, i, 0);
            if('O'==board[i][board[0].length-1]) spread(board, i, board[0].length-1);
        }
        for(int j=0; j<board[0].length; j++){
            if('O'==board[0][j]) spread(board, 0, j);
            if('O'==board[board.length-1][j]) spread(board, board.length-1, j);
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if('O'==board[i][j]) board[i][j] = 'X';
                if('Y'==board[i][j]) board[i][j] = 'O';
            }
        }
    }
    public void spread(char[][] board, int i, int j){
        Point p = new Point(i,j);
        Queue<Point> q = new LinkedList<Point>();
        q.add(p);
        board[i][j] = 'Y'; // mark before recursive
        while(!q.isEmpty()){
            Point point = q.remove();
            int x = point.i;
            int y = point.j;            
            if(x>0&&'O'==board[x-1][y]) {board[x-1][y] = 'Y';q.add(new Point(x-1,y));}
            if(x<board.length-1&&'O'==board[x+1][y]) {board[x+1][y] = 'Y';q.add(new Point(x+1,y));}
            if(y>0&&'O'==board[x][y-1]) {board[x][y-1] = 'Y';q.add(new Point(x,y-1));}
            if(y<board[0].length-1&&'O'==board[x][y+1]) {board[x][y+1] = 'Y';q.add(new Point(x,y+1));}
        }
    }
}
