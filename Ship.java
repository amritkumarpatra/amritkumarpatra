import java.util.*;
import java.lang.*;
import java.io.*;

class Ship
{
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
 
        for(int i=2;i*i<=n;++i)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		try
		{
    		Scanner scn=new Scanner(System.in);
    		int t=scn.nextInt();
    		while(t>0)
    		{
    		    String str=scn.next();
    		    
    		    if(str.charAt(0)=='b' || str.charAt(0)=='B')
    		    {
    		        System.out.println("BattleShip");
    		    }
    		    else if(str.charAt(0)=='c' || str.charAt(0)=='C')
    		    {
    		        System.out.println("Cruiser");
    		    }
    		    else if(str.charAt(0)=='d' || str.charAt(0)=='D')
    		    {
    		        System.out.println("Destroyer");
    		    }
    		    else if(str.charAt(0)=='f' || str.charAt(0)=='F')
    		    {
    		        System.out.println("Frigate");
    		    }

    		    
    		    --t;
    		}
		}
		catch(Exception e)
		{
		    return ;
		}
		
	}
}
