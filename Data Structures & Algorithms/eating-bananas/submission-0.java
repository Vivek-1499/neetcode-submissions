class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int num: piles){
            max = Math.max(max, num);
        }

        int l =1, r=max;
        while(l<=r){
            int mid = l + (r - l) / 2;
            int hourTaken = calculateHours(piles, mid);
            if(hourTaken > h)l = mid+1;
            else r = mid-1;
        } 
        return l;
    }
    private int calculateHours(int[] nums, int hour){
        int timeTaken = 0;
        for(int num: nums){
            timeTaken += (num + hour -1) / hour ;
        }
        return timeTaken;
    }
}
