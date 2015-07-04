package edu.clemson.ece.leetcode.KthSmallestElementInaBST;

public class TestReferenceFunArgument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		fun1(i);
		System.out.println(i);
		
		int[] j = new int[]{0};
		fun2(j);
		System.out.println(j[0]);
		
		Integer k = 0;
		fun3(k);
		System.out.println(k.intValue());
	}
	public static void fun1(int n){
		n++;
	}
	public static void fun2(int[] n){
		n[0]++;
	}
	public static void fun3(Integer n){
		//Java is pass by value, not by reference. Changing the reference inside a method won't be 
		// reflected into the passed-in reference in the calling method.
		//Integer is immutable. There's no such method like Integer#set(i). You could otherwise just make use of it.
		//
		n = n + 1;
		// Integer i = 0;
		// i = i + 1;
		// is seen by the compiler (after the autoboxing) as:
			// Integer i = Integer.valueOf(0);
			// i = Integer.valueOf(i.intValue() + 1);  
	}
}
