class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,z=0;
        while (i<nums.length){
            if (nums [i]==0)i++;
            else {
                int temp=nums[i];
                nums[i]=nums [z];
                nums [z]=temp;
                z++;i++;
            }
        }
    }
}