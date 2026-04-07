class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int max_area = 0;
        int left = 0, right = heights.length - 1;
        while(left<right){
            area = getHeight(left, right, heights) * (right-left);
            if(area > max_area){
                max_area = area;
            }
            if(heights[left]<heights[right]){
                left ++;
            } else right--;
        }

    return max_area;
    }
    private int getHeight(int left, int right, int[] heights){
        int height = 0;
        if(heights[left] <= heights[right]){
            height = heights[left];
        } else {
            height = heights[right];
        }
        return height;
    }
}
