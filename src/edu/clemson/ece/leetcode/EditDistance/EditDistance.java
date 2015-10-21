package edu.clemson.ece.leetcode.EditDistance;

public class EditDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m==0) return n;
        if(n==0) return m;
        int[][] dist = new int[m+1][n+1];
        for(int i=0; i<=m; i++) dist[i][0] = i;
        for(int j=0; j<=n; j++) dist[0][j] = j;
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                int step = word1.charAt(i-1)==word2.charAt(j-1) ? 0 : 1;
                dist[i][j] = Math.min(Math.min(dist[i-1][j]+1,dist[i-1][j-1]+step),dist[i][j-1]+1);
            }
        }
        
        return dist[m][n];
    }
}
