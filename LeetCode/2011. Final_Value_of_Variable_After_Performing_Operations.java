/* Link - https://leetcode.com/problems/final-value-of-variable-after-performing-operations/ */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for(String s : operations){
            if(s.charAt(1) == '+')
                val++;
            else val--;
        }
        return val;
    }
}
