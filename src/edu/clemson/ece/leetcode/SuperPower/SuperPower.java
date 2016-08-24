package edu.clemson.ece.leetcode.SuperPower;

public class SuperPower {
    int k = 1337;
    public int superPow(int a, int[] b) {
        int res = 1;
        for(int i=0; i<b.length; i++) res = powmod(res,10) * powmod(a,b[i]) % k;
        return res;
    }
    int powmod(int a, int b) { /* Calculate (a^b % k) */
        a %= k;
        b %= k;
        int res = 1;
        for(int i=0; i<b; i++) res = (res * a) % k;
        return res;
    }
}
