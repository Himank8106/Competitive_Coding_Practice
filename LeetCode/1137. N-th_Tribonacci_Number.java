/* Link - https://leetcode.com/problems/n-th-tribonacci-number/ */

class Solution {
    public int tribonacci(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return helper(n, memo);
    }
    
    private int helper(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = helper(n - 1, memo) + helper(n - 2, memo) + helper(n - 3, memo);
        }
        
        memo.put(n, result);
        return result;
    }
}
