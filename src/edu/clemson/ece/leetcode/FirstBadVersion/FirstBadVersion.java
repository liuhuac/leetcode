package edu.clemson.ece.leetcode.FirstBadVersion;

public class FirstBadVersion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int res = 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)){
                right = mid - 1;
                res = mid;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
