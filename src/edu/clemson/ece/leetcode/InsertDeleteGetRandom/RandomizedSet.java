package edu.clemson.ece.leetcode.InsertDeleteGetRandom;

public class RandomizedSet {
    
    List<Integer> nums = null;
    Map<Integer, Integer> map = null;
    Random rd = null;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        rd = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,nums.size());
        nums.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        if(index!=nums.size()-1){
            int tmp = nums.get(nums.size()-1);
            nums.set(index, tmp);
            map.put(tmp, index);
        }
        map.remove(val);
        nums.remove(nums.size()-1);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return nums.get(rd.nextInt(nums.size()));
    }
}

/**
 *  * Your RandomizedSet object will be instantiated and called as such:
 *  * RandomizedSet obj = new RandomizedSet();
 *  * boolean param_1 = obj.insert(val);
 *  * boolean param_2 = obj.remove(val);
 *  * int param_3 = obj.getRandom();
 *  */
