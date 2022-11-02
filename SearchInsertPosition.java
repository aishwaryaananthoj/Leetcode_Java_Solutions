class Solution {
    public int searchInsert(int[] nums, int target) {
        int position=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target ){
                position=i;
                break;
            }
            else if (nums[i]>target){
                position=i;
                break;}
            else if(i==nums.length-1) position=nums.length;
        }
        return position;
    }
    
}