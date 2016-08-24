package edu.clemson.ece.leetcode.CountNumbersWithUniqueDigits.java

public class CountNumbersWithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {

        int[] factorial = new int[10];

        factorial[0] = 1;

        for(int i=1; i<10; i++) factorial[i] = factorial[i-1]*i;

        int res = 1;

        for(int i=1; i<=n; i++) res += 9*factorial[9]/factorial[10-i];

        return res;

    }

}
