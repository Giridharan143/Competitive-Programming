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
		
		Scanner inp = new Scanner(System.in);
		int test = inp.nextInt();
		for(int i=test;i>0;i--){
		    int no = inp.nextInt();
		    String pref = inp.next();
		    //boolean prev=false;
		    for(int j=0;j<no;j++){
		        if(pref.charAt(j)=='1' && j!=no-1)
		            System.out.println("IDK");
		        else if(pref.charAt(j)=='1' && j==no-1)
		            System.out.println("YES");
		        else{
		            for(int k=j;k<no;k++)
		                System.out.println("NO");
		            j=no;  //automatically closes the loop -> Handy!!
		        }
		        
		        
		        
		        //char current = pref.charAt(j); // I got the current number of peop
		        //char last = pref.charAt(pref.length());
		        /*if(j==0 && current=='1'){
		            System.out.println("IDK");
		        }
		        else if(j==0 && current=='0'){
		            System.out.println("NO");
		        }
		        else{
		            char prev = pref.charAt(j-1);
		            if(current=='1'&& prev == '1')
		                System.out.println("YES");
		            else if(current == '0' && prev == '0')
		                System.out.println("NO");
		        }*/
		    }
		}
	}
}
