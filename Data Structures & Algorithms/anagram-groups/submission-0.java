class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res= new LinkedList<>();

        // Map<String, List<String>> map = new HashMap<>();

        // for(String s: strs){
        //     char[] charr = s.toCharArray();

        //     Arrays.sort(charr);
        //     String sorted = new String(charr);

        //     if(!map.containsKey(sorted)){
        //         map.put(sorted, new LinkedList<>());
        //     }
        //     map.get(sorted).add(s);
        // }
        // res.addAll(map.values());

        // return res;

        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){
            int[] charr = new int[26];
            for(char c: s.toCharArray()){
                charr[c - 'a']++;
            }

            String newKey = Arrays.toString(charr);
            res.putIfAbsent(newKey, new ArrayList<>());

            res.get(newKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
