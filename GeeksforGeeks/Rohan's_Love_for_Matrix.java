/* Link - https://www.geeksforgeeks.org/problems/rohans-love-for-matrix4723/1 */

class Solution {
    final static int mod = 1000000007;
    static int firstElement(int n) {
        // code here
        if(n==0 || n==1 ){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        
        for(int i=0;i<n-2;i++){
            c = (a+b)%mod;
            a = b%mod;
            b = c%mod;
        }
        
        return c%mod;
    }
}
