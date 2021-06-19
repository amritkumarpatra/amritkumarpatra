import java.util.*;
import java.lang.*;
import java.io.*;

class Min_Max
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
	    while(t-->00)
		{
		    int N = sc.nextInt();
		    long a[] = new long[N];
		    
		    for(int i = 0; i<N; i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    for(int i = 0; i<N-1; i++)
		    {
		        if(a[0]>a[i+1])
		        {
		            a[0] = a[i+1];
		        }
		    }
		    System.out.println(a[0]*(N-1));
		}
	}
}
