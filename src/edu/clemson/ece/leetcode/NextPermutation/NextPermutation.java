package edu.clemson.ece.leetcode.NextPermutation;

public class NextPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextPermutation np = new NextPermutation();
		int[] nums = {1,5,1};
		np.nextPermutation(nums);
		for(int e : nums){
			System.out.println(e);
		}
	}

	public void nextPermutation(int[] nums) {
        if(1>=nums.length) return;
        int r = nums.length - 1;
        int l = r - 1;
        int cur = nums[r];
        while(l>=0){
            if(nums[l]<cur){
                int i = l + 1;
                while(i<=r){
                    if(nums[i]<=nums[l]) break;
                    i++;
                }
                nums = swap(nums, l, i-1);
                break;
            }
            cur = nums[l];
            l--;
        }
        nums = quicksort(nums, l+1, r);
    }
    
    public int[] quicksort(int[] nums, int l, int r) {
        if(l==r) return nums;
        int pivot = nums[l+(r-l)/2];
        int begin = l;
        int end = r;
        while(l<=r){
            if(nums[l]<pivot) {l++; continue;}
            if(nums[r]>pivot) {r--; continue;}
            nums = swap(nums, l++, r--);
        }
        if(l<end) nums = quicksort(nums, l, end);
        if(r>begin) nums = quicksort(nums, begin, r);
        return nums;
    }
    
    public int[] swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
        return nums;
    }
}
