/* Link - https://www.geeksforgeeks.org/problems/alternative-sorting1311/1 */

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // Your code goes here
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length-1;
        for(int i=0;i<=n/2;i++){
           list.add(arr[n-i]);
          if (i != n - i) {     
                list.add(arr[i]);  
            }
        }
        return list;
    }
}