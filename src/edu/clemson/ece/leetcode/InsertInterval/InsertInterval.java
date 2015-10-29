package edu.clemson.ece.leetcode.InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> ans = new ArrayList<>();
        int i = 0;
        while(i<intervals.size()&&intervals.get(i).end<newInterval.start) ans.add(intervals.get(i++));
        while(i<intervals.size()&&intervals.get(i).start<=newInterval.end) {
            newInterval = new Interval(Math.min(intervals.get(i).start,newInterval.start), Math.max(intervals.get(i).end,newInterval.end));
            i++;
        }
        ans.add(newInterval);
        while(i<intervals.size()) ans.add(intervals.get(i++));
        return ans;
    }
}
