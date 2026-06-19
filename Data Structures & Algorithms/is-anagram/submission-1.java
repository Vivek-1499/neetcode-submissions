class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char c: s.toCharArray()){
        //     map.put(c, map.getOrDefault(c, 0)+1);
        // }

        // for(char c: t.toCharArray()){
        //     map.put(c, map.getOrDefault(c, 0)-1);
        // }
        // for(int cnt: map.values()){
        //     if(cnt >=1)return false;
        // }
        // return true;


        int[] charr = new int[26];
        for(char c: s.toCharArray()){
            charr[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            charr[c - 'a']--;
        }
        for(int num: charr){
            if(num >=1) return false;
        }
        return true;
    }
}
