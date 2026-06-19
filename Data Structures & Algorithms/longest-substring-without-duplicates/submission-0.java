class Solution {
    public int lengthOfLongestSubstring(String s) {
        // boolean[] charr= new boolean[126];

        // int l=0, r=0, len = 0, maxLen = 0;
        // while(r < s.length()){
        //     char c = s.charAt(r);
        //     while(charr[c]){
        //         charr[s.charAt(l)] = false;
        //         l++;
        //         len--;
        //     }
        //     charr[c] = true;
        //     len++;
        //     maxLen = Math.max(maxLen, len);
        //     r++;
        // }
        // return maxLen;


        boolean[] charr = new boolean[126];
        int maxLen = 0, l=0;
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            while(charr[c]){
                charr[s.charAt(l)] = false;
                l++;
            }
            charr[c] = true;
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
