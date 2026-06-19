class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i=0; i<=heights.length; i++){
            int currHeight = i == heights.length ? 0 : heights[i];
            while(!st.isEmpty() && currHeight < heights[st.peek()]){
                  int idx = st.pop();
                  int pse = st.isEmpty() ? -1 : st.peek(), nse = i;
                  max = Math.max(max, heights[idx] * (nse - pse - 1));
            }
            st.push(i);
        }
        return max;
    }
}
