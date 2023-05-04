class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSoFar=Integer.MIN_VALUE, sumSoFar=0,maxAvgSoFar=0;
        for(int end=0;end<nums.length;end++){
            sumSoFar+=nums[end];
            if(end>=k-1){
                maxAvgSoFar=sumSoFar/k;
                maxSoFar=Math.max(maxAvgSoFar,maxSoFar );
                sumSoFar-=nums[end-k+1];
            }
        }
        return maxSoFar;
    }
}