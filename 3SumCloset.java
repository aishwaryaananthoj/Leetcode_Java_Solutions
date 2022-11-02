class Solution {
    public int threeSumClosest(int[] nums, int target) {
          List<List<Integer>> output=new LinkedList();
        Arrays.sort(nums);
        int result=0;
        int min=1111111111;//Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=nums.length-1;
                int sum=0;
                
                while(low<high){
                    sum=nums[low]+nums[high]+nums[i];
                    if(Math.abs(sum-target)<min){
                        min= Math.abs(sum-target);
                        result=sum;
                    }
                    else if(sum>target){
                        high--;
                    }
                    else
                        low++;
                }
            }
        }
       return result; 
    }
}