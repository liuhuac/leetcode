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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ["XOOOOOOOOOOOOOOOOOOO","OXOOOOXOOOOOOOOOOOXX","OOOOOOOOXOOOOOOOOOOX","OOXOOOOOOOOOOOOOOOXO","OOOOOXOOOOXOOOOOXOOX","XOOOXOOOOOXOXOXOXOXO","OOOOXOOXOOOOOXOOXOOO","XOOOXXXOXOOOOXXOXOOO","OOOOOXXXXOOOOXOOXOOO","XOOOOXOOOOOOXXOOXOOX","OOOOOOOOOOXOOXOOOXOX","OOOOXOXOOXXOOOOOXOOO","XXOOOOOXOOOOOOOOOOOO","OXOXOOOXOXOOOXOXOXOO","OOXOOOOOOOXOOOOOXOXO","XXOOOOOOOOXOXXOOOXOO","OOXOOOOOOOXOOXOXOXOO","OOOXOOOOOXXXOOXOOOXO","OOOOOOOOOOOOOOOOOOOO","XOOOOXOOOXXOOXOXOXOO"]
		Point p = new Point(0,0);
		p.i = 1;
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
        while(!q.isEmpty()){
            Point point = q.remove();
            int x = point.i;
            int y = point.j;
            board[x][y] = 'Y';
            if(x>0&&'O'==board[x-1][y]) q.add(new Point(x-1,y));
            if(x<board.length-1&&'O'==board[x+1][y]) q.add(new Point(x+1,y));
            if(y>0&&'O'==board[x][y-1]) q.add(new Point(x,y-1));
            if(y<board[0].length-1&&'O'==board[x][y+1]) q.add(new Point(x,y+1));
        }
    }
}
