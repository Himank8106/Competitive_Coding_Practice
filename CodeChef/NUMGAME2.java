/* Link - https://www.codechef.com/problems/NUMGAME2 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    if(n%4==1){
		        System.out.println("ALICE");
		    }
		    else{
		        System.out.println("BOB");
		    }
		}

	}
}
