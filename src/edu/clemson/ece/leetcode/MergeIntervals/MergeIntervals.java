package edu.clemson.ece.leetcode.MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<2) return intervals;
        
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval a, Interval b){
                return Integer.compare(a.start,b.start);
            }
        });
        
        List<Interval> ans = new ArrayList<>();
        Interval pre = intervals.get(0);
        Interval cur = null;
        for(int i=1; i<intervals.size(); i++){
            cur = intervals.get(i);
            if(isOverlap(pre,cur)){
                pre = merge(pre,cur);
            } else {
                ans.add(pre);
                pre = cur;
            }
        }
        ans.add(pre);
        return ans;
    }
    public boolean isOverlap(Interval pre, Interval cur){
        return (pre.start<=cur.start&&cur.start<=pre.end) || (cur.start<=pre.start&&pre.start<=cur.end);
    }
    public Interval merge(Interval pre, Interval cur){
        return new Interval(Math.min(pre.start,cur.start),Math.max(pre.end,cur.end));
    }
}
