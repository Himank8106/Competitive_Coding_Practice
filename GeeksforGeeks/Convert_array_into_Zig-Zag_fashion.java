/* Link - https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1 */

class Solution {
    public static void zigZag(int n, int[] arr) {
        // code here
        for(int i=1; i<n; i++){
            if(i%2!=0 && arr[i]<arr[i-1]) swap(arr, i, i-1);
            else if(i%2==0 && arr[i]>arr[i-1]) swap(arr, i-1, i);
        }
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

