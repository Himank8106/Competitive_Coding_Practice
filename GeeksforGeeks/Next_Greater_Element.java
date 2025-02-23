/* Link - https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1 */

class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>() ; 
        for(int i = 0; i<arr.length-1 ; i++){
            int size = list.size() ; 
            for(int j = i ; j<arr.length  ; j++){
                if(arr[i] < arr[j]){
                    list.add(arr[j]) ; 
                    break  ; 
                }
            }
            if(size == list.size()){
                list.add(-1) ; 
            }
        }
        list.add(-1) ; 
        return list ; 
    }
}
