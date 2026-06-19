class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{') st.push(c);
            else{
                if(st.isEmpty()) return false;
                Character top = st.pop();
                if(c == ')' && top != '(' ||
                    c == ']' && top != '[' ||
                    c == '}' && top != '{') return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
