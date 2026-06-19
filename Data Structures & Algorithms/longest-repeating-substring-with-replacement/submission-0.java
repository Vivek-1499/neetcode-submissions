class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int maxLen = 0, maxCount = 0, l = 0;
        for(int r=0; r<s.length(); r++){
            int idx = s.charAt(r) - 'A';
            arr[idx]++;
            maxCount = Math.max(maxCount, arr[idx]);

            while((r-l+1) - maxCount > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, (r-l+1));
        }

        return maxLen;

        
    }
}
