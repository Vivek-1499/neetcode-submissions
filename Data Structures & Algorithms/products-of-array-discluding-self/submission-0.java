class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = 1; suff[n -1] = 1;

        for(int i=1; i<n; i++){
            pref[i] = nums[i-1] * pref[i-1];
            suff[n-i-1] = nums[n - i] * suff[n - i];
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = suff[i] * pref[i];
        }
        return res;
    }
}  
