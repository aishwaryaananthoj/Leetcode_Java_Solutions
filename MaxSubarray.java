class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=Integer.MIN_VALUE;
        int max_here=0;
        if(nums.length==1)
            return nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            max_here+=nums[i];
    
            if(max_so_far<max_here)
                max_so_far=max_here;
            if(max_here<0)
                max_here=0;
        }
        return max_so_far;
    }
}