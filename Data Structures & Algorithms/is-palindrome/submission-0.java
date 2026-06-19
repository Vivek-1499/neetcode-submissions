class Solution {
    public boolean isPalindrome(String s) {
        
        String newS = s.replaceAll("[^0-9a-zA-Z]", "").trim().toLowerCase(); // s.replaceAll('^\\W+', "");

        int l = 0, r = newS.length() - 1;

        while(l <= r){
            if(newS.charAt(l) == newS.charAt(r)){
                l++;
                r--;
            }else return false;
        }
        return true;

    }
}
