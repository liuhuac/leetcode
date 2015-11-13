package edu.clemson.ece.leetcode.FindMedianFromDataStream;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class MedianFinder {
	    
	    private Queue<Integer> max = new PriorityQueue<>();
	    private Queue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());

	    // Adds a number into the data structure.
	    public void addNum(int num) {
	        max.offer(num);
	        min.offer(max.poll());
	        if(max.size()<min.size()) max.offer(min.poll());
	    }

	    // Returns the median of current data stream
	    public double findMedian() {
	        if(max.size()==min.size()) return ((double)max.peek()+(double)min.peek())/2;
	        else return (double)max.peek();
	    }
	};

	// Your MedianFinder object will be instantiated and called as such:
	// MedianFinder mf = new MedianFinder();
	// mf.addNum(1);
	// mf.findMedian();
}
