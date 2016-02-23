package edu.clemson.ece.leetcode.SelfCrossing;

public class SelfCrossing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSelfCrossing(int[] x) {
        for(int i=3; i<x.length; i++){
            if(x[i-1]<=x[i-3] && x[i]>=x[i-2]){
                return true;
            } else if (i>=4 && x[i-1]==x[i-3] && x[i]+x[i-4]>=x[i-2]) {
                return true;
            } else if (i>=5 && x[i-2]>=x[i-4] && x[i]+x[i-4]>=x[i-2] && x[i-3]>=x[i-1] && x[i-1]+x[i-5]>=x[i-3]) {
                return true;
            }
        }
        return false;
    }
	
/*               i-2
    case 1 : i-1������
                �����੤>i
                 i-3

                    i-2
    case 2 : i-1 ������������
                 �����T�T>��i-3
                 i  i-4      (i overlapped i-4)

    case 3 :    i-4
               �������� 
               ��i<�੤��
            i-3�� i-5��i-1
               ������������
                i-2

*/

}
