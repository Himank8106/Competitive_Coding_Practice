/* Link - https://www.codechef.com/problems/NUMCOMP */

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
			// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0;i<T;i++) {
		  int a = sc.nextInt();
		   int b = sc.nextInt();
		  int N = sc.nextInt();
		    if(N%2==0){
		        a= Math.abs(a);
		        b = Math.abs(b);
		    }
		    if(a>b) {
		        System.out.println(1);
		    } else if(a<b) {
		        System.out.println(2);
		    } else {
		        System.out.println(0);
		    }
		}
	}
}
