/* Link - https://www.geeksforgeeks.org/problems/key-pair5616/1 */

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            
            if(sum==target){
                return true;
            }else if(sum<target){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
