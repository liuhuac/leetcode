package edu.clemson.ece.leetcode.KthSmallestElementInASortedMatrix;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(matrix.length, new Comparator<int[]>(){
                @Override
                public int compare(int[] arr1, int[] arr2){
                    return matrix[arr1[0]][arr1[1]] - matrix[arr2[0]][arr2[1]];
                }
            });
        for(int i=0; i<matrix.length; i++) pq.offer(new int[]{0,i});
        for(int i=0; i<k-1; i++){
            int[] arr = pq.poll();
            if(arr[0]==matrix.length-1) continue;
            pq.offer(new int[]{arr[0]+1, arr[1]});
        }
        int[] arr = pq.poll();
        return matrix[arr[0]][arr[1]];
    }
}
