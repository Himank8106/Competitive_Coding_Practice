/* Link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/ */

class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num>0)
        {
        if((num & 1)==1)
        num--;
        else
        num/=2;
        c++;
        }
        return c;
    }
}



/*
        int count = 0;
        while(num!=0){
            if(num%2==0){
                num /= 2;
                count++;
            }
            else{
                num -= 1;
                count++;
            }
        }
        return count;
*/
