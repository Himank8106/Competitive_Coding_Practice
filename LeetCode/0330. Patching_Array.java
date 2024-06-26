/* Link - https://leetcode.com/problems/patching-array/ */

class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int result = 0, i = 0;
        while(miss<=n){
            if(i<nums.length && nums[i]<=miss){
                miss += nums[i];
                i++;
            }
            else{
                miss += miss;
                result++;
            }
        }
        return result;
    }
}
