/* Link - https://leetcode.com/problems/decompress-run-length-encoded-list/ */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i=0; i<nums.length; i+=2){
            size += nums[i];
        }
        int ans[] = new int[size];
        size = 0;
        for(int i=0; i<nums.length; i+=2){
            Arrays.fill(ans, size, size+nums[i], nums[i+1]);
            size += nums[i];
        }
        return ans;
    }
}

/*
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i+=2){
            for(int j=0; j<nums[i]; j++){
                arr.add(nums[i+1]);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
*/
