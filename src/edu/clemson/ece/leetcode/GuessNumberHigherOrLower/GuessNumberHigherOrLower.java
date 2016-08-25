package edu.clemson.ece.leetcode.GuessNumberHigherOrLower;

/* The guess API is defined in the parent class GuessGame.
 * @param num, your guess
 * @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
 * int guess(int num); */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
         int lo = 1;
         int hi = n;
         /* int mid = lo + (hi-lo)/2; */
         while(lo<hi){
             int mid = lo + (hi-lo)/2;
             int result = guess(mid);
             if(result==-1){
                 hi = mid;
             } else if(result==1){
                 lo = mid+1;
             } else {
                 return mid;
             }
         }
         return lo;
        }
}
