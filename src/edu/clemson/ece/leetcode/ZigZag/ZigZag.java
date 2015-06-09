package edu.clemson.ece.leetcode.ZigZag;

public class ZigZag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZigZag zz = new ZigZag();
		System.out.println(zz.convert("A", 2));
	}
	
	public String convert(String s, int numRows) {
        String[] strList = new String[numRows];
        int select = 0;
        if(numRows==1){
            return s;
        }
        for(int i=0; i<numRows; i++){
            strList[i] = "";
        }
        for(int i=0; i<s.length(); i++){
            select = i%(2*numRows-2);
            if(select>numRows-1){
                select = 2*numRows -2 - select;
            }
            strList[select] += s.charAt(i);
        }
        String result = "";
        for(int i=0; i<numRows; i++){
            result += strList[i];
        }
        return result;
    }

}
