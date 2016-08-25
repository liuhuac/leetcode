package edu.clemson.ece.leetcode.GuessNumberHigherOrLower;

//Forward declaration of guess API.
//@param num, your guess
//@return -1 if my number is lower, 1 if my number is higher, otherwise return 0


class GuessNumberHigherOrLower {
	int guess(int num){
		int target = 6;
		if(num>target) return 1;
		if(num<target) return -1;
		if(num==target) return 0;
	}
public:
	static void main(int[] args){
		GuessNumberHigherOrLower test = new GuessNumberHigherOrLower();
		test.guessNumber(10);
	}
 int guessNumber(int n) {
     int lo = 1;
     int hi = n;
     int mid = 0;
     while(lo<hi){
         mid = lo + (hi-lo)/2;
         int result = guess(mid);
         if(result==1){
             hi = mid;
         } else if(result==-1){
             lo = mid;
         } else {
             break;
         }
     }
     return mid;
 }
};