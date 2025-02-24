/* Link - https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1 */

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int i=1, count=0, index=0;
        while(i<arr[arr.length-1] && index<arr.length){
            if(i==arr[index]) index++;
            else count++;
            if(count == k) return i;
            i++;
        } 
        return i+k-count;
    }
}
