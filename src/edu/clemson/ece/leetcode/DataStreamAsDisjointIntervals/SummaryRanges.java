package edu.clemson.ece.leetcode.SummaryRanges;

/**
 *  * Definition for an interval.
 *   * public class Interval {
 *    *     int start;
 *     *     int end;
 *      *     Interval() { start = 0; end = 0; }
 *       *     Interval(int s, int e) { start = s; end = e; }
 *        * }
 *         */
public class SummaryRanges {
    
    TreeMap<Integer, Interval> treeMap = null;

    /** Initialize your data structure here. */
    public SummaryRanges() {
        treeMap = new TreeMap<>();
    }
    
    public void addNum(int val) {
        if(treeMap.containsKey(val)) return;
        Integer l = treeMap.floorKey(val);
        Integer h = treeMap.ceilingKey(val);
        if(l!=null && h!=null && treeMap.get(l).end==val-1 && h==val+1){
            treeMap.get(l).end = treeMap.get(h).end;
            treeMap.remove(h);
        } else if(h!=null && h==val+1){
            treeMap.put(val,new Interval(val,treeMap.get(h).end));
            treeMap.remove(h);
        } else if(l!=null && treeMap.get(l).end>=val-1){
            treeMap.get(l).end = Math.max(treeMap.get(l).end, val);
        } else {
            treeMap.put(val, new Interval(val, val));
        }
    }
    
    public List<Interval> getIntervals() {
        return new ArrayList<>(treeMap.values());
    }
}

/**
 *  * Your SummaryRanges object will be instantiated and called as such:
 *   * SummaryRanges obj = new SummaryRanges();
 *    * obj.addNum(val);
 *     * List<Interval> param_2 = obj.getIntervals();
 *      */
