class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int start=0,end=0,min, countSoFar=0;
        min=Integer.MAX_VALUE;
        for(end=0;end<nums.length;end++){
            countSoFar+=nums[end];

            while(countSoFar>=target){
                min=Math.min(min, end-start+1);
                countSoFar-=nums[start];
                start++;
            }
        }
    return (min != Integer.MAX_VALUE) ? min : 0;
    }
}