class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k +1];

        int r = k-1, l = 0, j = 0;
        while(r<nums.length){
            int max = Integer.MIN_VALUE;
            for(int i=l; i<=r;i++){
                if(nums[i] > max) max = nums[i];
            }
            res[j++] = max;
            max=0;
            r++;
            l++;
        }
        return res;
    }
}
