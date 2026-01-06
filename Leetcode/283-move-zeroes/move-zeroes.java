class Solution {
    public void moveZeroes(int[] nums) {
        int z=0,i=0;
        while(i<nums.length){
           if(nums[i]!=0)nums[z++]=nums[i];
           i++;
        }
        while(z<nums.length){
            nums[z++]=0;
        }
    }
}