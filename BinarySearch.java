class Solution {
    public int search(int[] nums, int target) {
        int start=0, end=nums.length, mid;
        mid= (start+end)/2;
        if(nums.length==0)
            return -1;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(target<=nums[mid]){
            start=0;
            end=mid;
        }
        else if(target>=nums[mid]){
            start=mid+1;
            end=nums.length;
        }
        for(int index=start;index<end;index++){
            if(nums[index]==target){
                return index;
            }
        }
        return -1;
    }
}