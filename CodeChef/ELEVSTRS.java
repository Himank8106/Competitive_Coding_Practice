/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ELEVSTRS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    float n=sc.nextInt(), v1=sc.nextInt(), v2=sc.nextInt();
		    System.out.println((n/v1)>((Math.pow(2,0.5)*n)/v2)?"Elevator":"Stairs");
		} 
	}
}
