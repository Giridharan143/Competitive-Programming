/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;  // Starter 112
import java.io.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class FAIRSHARE
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner inp = new Scanner(System.in);
	int invamount = 0;
	int test = inp.nextInt();
	while(test-- > 0){
	    int total = inp.nextInt();
	    int members = (inp.nextInt()+1);
	    double invamt = total/members;
	    	    if(invamt%1>0.5){
	    invamount = (int) Math.ceil(invamt); // imp concept
	    }
	    if(invamt%1<=0.5){
	    invamount = (int) Math.floor(invamt);
	    }
	    int pay = total-(invamount*(members-1));
	    System.out.println(pay); 
	}
 }
} 
