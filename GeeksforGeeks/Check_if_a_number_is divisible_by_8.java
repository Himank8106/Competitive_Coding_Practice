/* Link - https://www.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-83957/1 */

class Solution{
    int DivisibleByEight(String s){
        //code here
        int n = s.length(), num = 0;
        for (int i = n < 4 ? 0 : n - 3; i < n; i++)
            num = (num * 10) + (s.charAt(i) - '0');
        return num % 8 == 0 ? 1 : -1;
    }
}
