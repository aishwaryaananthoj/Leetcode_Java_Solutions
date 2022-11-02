class Solution {
    public int maxArea(int[] height) {
        int start,end,area=0,min, max_area=0;
        start=0;
        end=height.length-1;
        while(start<end){
            min= Math.min(height[start],height[end]);
            area=min * (end-start);
            max_area=Math.max(area, max_area);
            if(height[start]<height[end])
                start++;
            else if(height[start]>height[end])
                end--;
            else{
                start++;
                end--;
            }
            
        }
        
     return max_area;   
    }
}