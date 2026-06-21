class Solution {
    public int findMin(int[] nums) {
        int max = Integer.MAX_VALUE, l =0, r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(nums[l] <= nums[mid]){
                max = Math.min(max, nums[l]);
                l = mid+1;
            }else{
                max = Math.min(max, nums[mid]);
                r = mid-1;
            }
        }
        return max;
    }
}
