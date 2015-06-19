package edu.clemson.ece.leetcode.SpiralMatrixII;

public class SpiralMatrixII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrixII sm = new SpiralMatrixII();
		int n = 2;
		int[][] m = sm.generateMatrix(n);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(m[i][j]+" "); 
			}
			System.out.println();
		}
	}

	public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        if(0==n) return m;
        if(1==n){
            m[0][0] = 1;
            return m;
        }
        int i = 0;
        int j = 0;
        int d = 0; // direction 0=right, 1=down, 2=left, 3=up
        int o = 1;
        while(0==m[i][j]){
            m[i][j] = o++;
            switch(d){
                case 0: 
                    j++; break;
                case 1:
                    i++; break;
                case 2:
                    j--; break;
                case 3:
                    i--; break;
            }
            if( (i+j==n-1) || ((i==j)&&(i>(n-1)/2)) || (i-j==1)&&(i<=(n-1)/2)&&(j<=(n-1)/2)) d = (d+1)%4;
        }
        return m;
    }
	
}
