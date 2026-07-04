class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;

        int left=0;
        int right=height.length-1;
        while(left<=right){
                int h=Math.min(height[left],height[right]);
                int w=right-left;
                max=Math.max(max,w*h);
                if(height[left]<height[right])
                    left++;
                else
                    right--;
        }
        return max;
    }
}