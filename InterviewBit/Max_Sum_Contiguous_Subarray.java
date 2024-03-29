/* Link - https://www.interviewbit.com/problems/max-sum-contiguous-subarray/ */

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<A.size(); i++) {
            sum += A.get(i);
            maxi = Math.max(maxi, sum);
            if(sum < 0) {
                sum = 0;
            }  
        }
        return maxi;
    }
}
