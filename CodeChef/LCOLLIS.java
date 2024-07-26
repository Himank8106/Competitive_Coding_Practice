/* Link - https://www.codechef.com/problems/LCOLLIS */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0){
    	    int n=sc.nextInt();
    	    int m=sc.nextInt();
            String s[]=new String [n];
            for (int i=0; i<n; i++){
                s[i]=sc.next();
            }
            int ans=0;
            for(int i=0; i<m; i++){
                int c=0;
                for(int j=0; j<n; j++){
                    if(s[j].charAt(i)=='1'){
                        c++;
                    }
                }
                if(c>1)
                ans+=(c*(c-1))/2;
            }
            System.out.println(ans);
	    }
	}
}
	
	
