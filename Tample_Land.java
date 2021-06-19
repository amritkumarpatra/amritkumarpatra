class Tample_Land
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		for(int t=0;t<TestCase;t++)
		{
		    int mid=0;
		    int flag=0;
		    int oops=0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    if(n%2==0)
		    {
		        mid = n/2;
		    }
		    else
		    {
		        mid = (n+1)/2;
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		        if(i<mid)
		       {
		           flag++;
		       }
		       else
		       {
		           flag--;
		       }
		      
		       if(arr[i]!=flag)
		       {
		           oops=1;
		           break;
		       }
		       
		    }
		   if(oops==1)
		   {
		       System.out.println("no");
		   }
		   else
		   {
		       System.out.println("yes");
		   }
		}
	}
}
