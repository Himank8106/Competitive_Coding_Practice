/* Link - https://www.geeksforgeeks.org/problems/minimum-number-of-steps-to-reach-a-given-number5234/1 */

class Solution {
    static int minSteps(int d) {
        // code here
        for(int i = 1; i < 2 * d; i++){
            
            int ap = (i * (i + 1)) / 2;
            
            if((ap + d) % 2 == 0 && ap >= d) return i;
            
        }
        return 2 * d;
    }
}
