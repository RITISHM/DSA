class Solution {
    public void rotate(int[][] nums) {
        for (int i=0;i<nums.length;i++){
            int top=i;
            while (top !=nums.length){
                int temp=nums[i][top];
                nums[i][top]=nums[top][i];
                nums[top++][i]=temp;
            }
        }
        for (int i=0;i<nums.length;i++ ){
            for (int j=0;j<nums.length/2;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[i][nums.length-1-j];
                nums[i][nums.length-1-j]=temp;
            }
        }
    }
}