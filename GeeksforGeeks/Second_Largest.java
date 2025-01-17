/* Link - https://www.geeksforgeeks.org/problems/second-largest3735/1 */

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here\
        if (arr == null || arr.length < 2) {
            return -1; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
