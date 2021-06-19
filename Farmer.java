import java.util.*;
import java.lang.*;
import java.io.*;

class Farmer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long c = sc.nextLong();
            long d = sc.nextLong();
            long l = sc.nextLong();
            long min=0;
            long max = (c+d)*4;
           
            if(c<=2*d)
            {
                min = 4*d;
            }
           
            else
            {
                min = (c-d)*4;
            }
            
            if(l%4==0 && l<=max && l>=min)
            {
                System.out.println("yes");
            }
            
            else
            {
                System.out.println("no");
            }

		}
	}
}
