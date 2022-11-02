class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1_len,nums2_len;
        double median=0.00;
        nums1_len=nums1.length;
        nums2_len=nums2.length;
        int cl = nums1_len + nums2_len;
        int[] c = new int[cl];
        for (int i = 0; i < nums1_len; i = i + 1) {
            c[i] = nums1[i];
        }
        for(int i=0;i<nums2_len;i++){
            c[nums1_len+i]=nums2[i];
        }
        Arrays.sort(c);
        nums1_len=c.length;
        if(nums1_len %2 ==0)
            median= (c[nums1_len/2]+c[(nums1_len/2)-1])/2.0;
        else
            median=c[(nums1_len)/2];
        return median;
    }
}