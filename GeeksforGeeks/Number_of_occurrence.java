/* Link - https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1 */

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int c =0;
        for (int i = 0; i < arr.length;i++){
            if(arr[i]==target){
                c++;
            }
        }
        return c;
    }
}
