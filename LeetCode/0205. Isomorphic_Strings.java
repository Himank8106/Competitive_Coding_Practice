/* Link - https://leetcode.com/problems/isomorphic-strings/ */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200]; 
        int[] indexT = new int[200]; 
        
        for(int i = 0; i < s.length(); i++) {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; 
            }        
            indexS[s.charAt(i)] = i + 1; 
            indexT[t.charAt(i)] = i + 1; 
        }
        
        return true;
    }
}
