/* Link - https://www.codechef.com/problems/SHUFFLIN */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int i= 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            int e = 0, o = 0, res = 0;
            for(int i = 0; i<n; i+=2){
                if(arr[i] % 2 == 0) res++;
                else o++;
            }
            for(int i = 1; i<n; i+=2){
                if(arr[i] % 2 == 1) res++;
                else e++;
            }
            res += 2*Math.min(e, o);
            System.out.println(res);
        }
	}
}
