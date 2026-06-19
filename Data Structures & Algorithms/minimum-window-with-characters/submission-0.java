class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int need = map.size(); int have = 0;

        int[] resArr = {-1, -1}; int resLen = Integer.MAX_VALUE;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) && window.get(c) == map.get(c)) {
                have++;
            }

            while (have == need) {
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    resArr = new int[]{l, r};
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);

                if (map.containsKey(leftChar) &&
                    window.get(leftChar) < map.get(leftChar)) {
                    have--;
                }

                l++;
            }
        }

        if (resLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(resArr[0], resArr[1] + 1);
    }
}