class Solution {
    public int maxArea(int[] heights) {
        // int res = 0;
        // for(int i=0; i<heights.length-1; i++){
        //     for(int j=i+1; j<heights.length; j++){
        //         int len = Math.min(heights[i], heights[j]) * (j-i);
        //         res = Math.max(res, len);
        //     }
        // }
        // return res;

        int res = 0;
        int l = 0, r = heights.length-1;
        while(l < r){
            int len = Math.min(heights[l], heights[r]);
            int sum = len * (r - l);
            res = Math.max(res, sum);

            if(heights[l] < heights[r]) l++;
            else r--;
        }
        return res;
    }
}
