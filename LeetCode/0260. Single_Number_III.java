/* Link - https://leetcode.com/problems/single-number-iii/ */

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor  =0;
        for(int num: nums){
            xor ^= num;
        }
        int lowestBit = xor & (-xor);
        int[] result = new int[2];
        for(int num: nums){
            if((lowestBit & num) == 0){
                result[0] ^= num;
            }
            else{
                result[1] ^= num;
            }
        }
        return result;
    }
}