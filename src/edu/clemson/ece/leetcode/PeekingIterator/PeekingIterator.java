package edu.clemson.ece.leetcode.PeekingIterator;

import java.util.Iterator;

//Java Iterator interface reference:
//https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
 Iterator<Integer> iter;
 Integer peek;
 boolean hasNext;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
	    if(iterator.hasNext()){
	        peek = iterator.next();
	        hasNext = true;
	    } else {
	        hasNext = false;
	    }
	}

 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
     if(hasNext){
         return peek;
     } else {
         return null;
     }
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(hasNext){
	        int res  = peek;
	        if(iter.hasNext()){
	            peek = iter.next();
	        } else {
	            hasNext = false;
	        }
	        return res;
	    } else {
	        return null;
	    }
	}

	@Override
	public boolean hasNext() {
	    return hasNext;
	}
}
