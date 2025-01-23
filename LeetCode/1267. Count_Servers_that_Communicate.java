/* Link - https://leetcode.com/problems/count-servers-that-communicate/ */

class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] rowCnt=new int[m]; 
        int[] colCnt=new int[n];

        // Count servers in each row and column
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){                   
                    rowCnt[i]++;
                    colCnt[j]++;                    
                }
            }
        }

        int cnt=0;
        // Count communicating servers
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){                   
                    if(rowCnt[i]>1 || colCnt[j]>1){
                        cnt++;
                    }                 
                }
            }
        }

        return cnt;
    }
}
