import java.util.*;
import java.lang.*;
import java.io.*;

class Two_Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	try{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			long res;
			if (c % 2 == 0) {
				res = (long) (Math.max(a, b) / Math.min(a, b));
			} else {
				res = (long) (Math.max(a * 2, b) / Math.min(a * 2, b));
			}
			System.out.println(res);
		}
		scanner.close();
	
	}
	catch(Exception e){
	    return;
	}
}
}
