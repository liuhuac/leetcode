package edu.clemson.ece.leetcode.FractionToRecurringDecimal;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionToRecurringDecimal f2d = new FractionToRecurringDecimal();
		f2d.fractionToDecimal(0, 3);
	}

	public String fractionToDecimal(int numerator, int denominator) {
        boolean sign = (numerator<0 && denominator>0) || (numerator>0 && denominator<0);
        Map<Long,Integer> previousRemains = new HashMap<>();
        long numeratorL = Math.abs((long)numerator);
        long denominatorL = Math.abs((long)denominator);
        long quotion = numeratorL / denominatorL;
        long remains = numeratorL % denominatorL;
        StringBuilder sb = new StringBuilder();
        sb.append(quotion);
        
        if(remains!=0) sb.append(".");
        
        int pos = 0;
        while(remains!=0){
            numeratorL = remains * 10;
            quotion = numeratorL / denominatorL;
            remains = numeratorL % denominatorL;
            if(!previousRemains.containsKey(numeratorL)){
                sb.append(quotion);
                previousRemains.put(numeratorL,pos++);
            } else {
                int begin = sb.indexOf(".") + 1 + previousRemains.get(numeratorL);
                sb.insert(begin, '(');
                sb.append(")");
                break;
            }
        }
        if(sign) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
