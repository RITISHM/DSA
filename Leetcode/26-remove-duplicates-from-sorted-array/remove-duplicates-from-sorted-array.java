import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==1)return 1;
        int fast=1;
        int slow=0;
        int count =1;
            while (fast<nums.length){
                while (nums[fast]==nums[slow]){
                    fast++;
                    if(fast>=nums.length)return count;
                }
                nums[slow+1]=nums[fast];
                slow++;
                count++;
                fast++;
            }
        return count;
        }
}