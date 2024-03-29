/* Link - https://www.interviewbit.com/problems/first-missing-integer/ */

public class Solution {
    public int firstMissingPositive(int[] A) {
        int N = A.length;
        for(int i=0; i<N; i++) {
            while(A[i] > 0 && A[i] <= N && A[i] != i+1) {
                int val = A[i];
                int corre_indx = val - 1;
               
                if(A[i] == A[corre_indx]) break;
               
                int temp = A[i];
                A[i] = A[corre_indx];
                A[corre_indx] = temp;
            }
        }
        for(int i=0; i<N; i++) {
            if(A[i] != i+1) {
                return i+1;
            }
        }
        return N + 1;
    }
}

/* 
public class Solution {
    public int firstMissingPositive(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }
        int min = 1;
        while (set.contains(min)) {
            min++;
        }
        return min;
    }
}
*/
