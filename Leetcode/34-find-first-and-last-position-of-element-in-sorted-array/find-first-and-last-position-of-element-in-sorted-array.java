class Solution {
    public int[] searchRange(int[] nums, int key) {
        int last =-1;
        int first=-1;
        int left =0;
        int right =nums.length-1;
        while (left<=right){
            int med=left+(right-left)/2;
            if (nums[med]==key){
                last=med;
            }
            if(nums[med]<=key){
                left=med+1;
            }
            else{
                right=med-1;
            }
        }

        left =0;
        right =nums.length-1;

         while (left<=right){
            int med=left+(right-left)/2;
            if (nums[med]==key){
                first=med;
            }
            if(nums[med]>=key){
                right=med-1;
            }
            else {
                left=med+1;
                
            }
            }
            int[] ans = new int[2];

            ans[0] = first;
            ans[1] = last;
            return ans;
    
}}