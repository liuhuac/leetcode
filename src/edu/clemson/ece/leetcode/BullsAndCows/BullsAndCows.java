package edu.clemson.ece.leetcode.BullsAndCows;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        String remains = "";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<secret.length(); i++){
            char c = secret.charAt(i);
            if(c==guess.charAt(i)){
                bulls++;
                continue;
            }
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
            remains += guess.charAt(i);
        }
        for(int i=0; i<remains.length(); i++){
            char c = remains.charAt(i);
            if(map.containsKey(c)){
                int n = map.get(c);
                if(n==1){
                    map.remove(c);
                } else {
                    map.put(c,--n);
                }
                cows++;
            }
        }
        return bulls+"A"+cows+"B";
    }
}
