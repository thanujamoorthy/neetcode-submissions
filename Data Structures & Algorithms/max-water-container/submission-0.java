class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int right = heights.length-1;
        int left = 0;
        while(left<right){

            int width =right-left;
            int maxAreaTemp = width * Math.min(heights[left], heights[right]);
            maxArea = Math.max(maxArea, maxAreaTemp);
            if(heights[left]<heights[right]) left++;
            else right --; 
        }
        return maxArea;
    }
}
