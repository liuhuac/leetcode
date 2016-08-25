package edu.clemson.ece.leetcode.FindKPairsWithSmallestSums;

public class FindKPairsWithSmallestSums {

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<int[]> res = new ArrayList<>();

        if(nums1.length==0 || nums2.length==0 || k==0) return res;

        PriorityQueue<int[]> pq = new PriorityQueue<>(nums1.length, (a,b)->(nums1[a[0]]+nums2[a[1]]-nums1[b[0]]-nums2[b[1]]));

        for(int i=0; i<nums1.length; i++) pq.offer(new int[]{i,0});

        for(int i=0; i<k && !pq.isEmpty(); i++){

            int[] index = pq.poll();

            res.add(new int[]{nums1[index[0]],nums2[index[1]]});

            if(index[1]==nums2.length-1) continue;

            pq.offer(new int[]{index[0], index[1]+1});

        }

        return res;

    }

}
