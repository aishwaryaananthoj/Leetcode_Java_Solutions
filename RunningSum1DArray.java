class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] runningSum= new int[nums.length];
        for(int num=0;num<nums.length;num++){
            sum=sum+nums[num];
            runningSum[num]=sum;
        }

    return runningSum;
    }
}

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
*/