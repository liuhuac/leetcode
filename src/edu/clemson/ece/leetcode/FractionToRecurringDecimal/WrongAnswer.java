package edu.clemson.ece.leetcode.FractionToRecurringDecimal;

import java.util.HashMap;
import java.util.Map;

public class WrongAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongAnswer wa = new WrongAnswer();
		System.out.println(wa.fractionToDecimal(-1, -2147483648));
	}
	public String fractionToDecimal(int numerator, int denominator) {
        if(0==numerator) return "0";
        String sign = "";
        if(0<numerator&&0>denominator||0>numerator&&0<denominator) {
            sign = "-";
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        String res = sign + Integer.toString(numerator/denominator);
        int remainder = numerator%denominator;
        if(0==remainder) return res;
        res += ".";
        Map<Integer,Integer> map = new HashMap<>();
        int pos = 1;
        while(!map.containsKey(remainder)){
            if(0==remainder) return res;
            map.put(remainder, pos);
            remainder *= 10;
            res += Integer.toString(remainder/denominator);
            remainder = remainder%denominator;
            pos++;
        }
        pos = res.indexOf('.') + map.get(remainder);
        res = res.substring(0, pos) + "(" + res.substring(pos) + ")";
        return res;
    }
}
