/* Link - https://leetcode.com/problems/reverse-integer/ */

class Solution {
    public int reverse(int x) {
        long rev=0,rem;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        return 0;
        else
        return (int)rev;
    }
}