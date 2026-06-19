class Solution {
    public int trap(int[] height) {
        // int[] pre = pref(height);
        // int[] suf = suff(height);
        // int res = 0;

        // for(int i=0; i<height.length; i++){
        //     int min = Math.min(pre[i], suf[i]);
        //     if(min > height[i]) res += min - height[i];
        // }

        // return res;


        int l = 0, r = height.length - 1, leftMax = height[l], rightMax = height[r];
        int res = 0;
        while(l < r){
            if(leftMax <= rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
            
        }
        return res;

    }

    // private int[] pref(int[] height){
    //     int[] pre = new int[height.length];
    //     pre[0] = height[0];

    //     for(int i=1; i<height.length; i++){
    //         pre[i] = Math.max(pre[i-1], height[i]);
    //     }

    //     return pre;
    // }
    // private int[] suff(int[] height){
    //     int[] suf = new int[height.length];
    //     suf[height.length-1] = height[height.length - 1];

    //     for(int i=height.length-2; i>= 0; i--){
    //         suf[i] = Math.max(suf[i+1], height[i]);
    //     }
    //     return suf;
    // }
}
