import java.util.*;
class TestClass
{
//main
	public static void main(String args[]) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int test=0;test<t;test++)
		{
      //s takes the string input
			String s=scan.next();
      //n contains the length of the string
			int n=s.length();
			int freq[]=new int[26];
			HashSet<Character> set=new HashSet<Character>();
			for(char c:s.toCharArray())
			{
				set.add(c);
				freq[c-97]++;
			}
			if(set.size()<3)
			{
				System.out.println("Dynamic");
				continue;
			}
			Arrays.sort(freq);
			int flag=0;
			for(int i=26-set.size()+2,j=0;i<26;i++,j++)
			{
				if(j==1)
				{
					if(freq[i]==freq[i-1]+freq[i-3])
						continue;
				}
				if(freq[i]!=freq[i-1]+freq[i-2])
				{
					System.out.println("Not");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Dynamic");
		}
	}
}
