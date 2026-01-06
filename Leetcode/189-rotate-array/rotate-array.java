class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if (k==0)return;
        int j=nums.length-k-1;
        for (int i=0;i<(nums.length-k)/2;i++){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j--]=temp;
        }
        j=nums.length-1;
        int m=nums.length-k;
        for (int i=0;i<k/2;i++){
            int temp=nums[m];
            nums[m++]=nums[j];
            nums[j--]=temp;
        }
        j=nums.length-1;
        for(int i=0;i<(nums.length)/2;i++){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j--]=temp;   
        }
    }
}