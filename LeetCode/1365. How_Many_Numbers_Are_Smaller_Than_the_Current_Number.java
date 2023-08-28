/* Link - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/ */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] bucket = new int[102];
        for(int i=0; i<nums.length; i++)
            bucket[nums[i]+1]++;

        for(int i=1; i<102; i++) 
            bucket[i] += bucket[i-1];
        
        for(int i=0; i<nums.length; i++)
            nums[i] = bucket[nums[i]];
        
        return nums;
    }
}

/* 
        int count = 0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;
            count = 0;
        }
        return ans;
*/
