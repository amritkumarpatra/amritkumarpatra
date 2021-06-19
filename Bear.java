import java.util.*;
import java.lang.*;
import java.io.*;


class Bear
{
    public static void solve(int test , BufferedReader reader)throws Exception
    {
        int n = Integer.parseInt(reader.readLine());
        String arr[] = reader.readLine().split(" ");
        for(int i=0;i<(n-1);i++){
            if(arr[i].charAt(0)=='c'&&arr[i+1].charAt(0)=='c')
            {
                System.out.println("NO");
                return;
            }
        }
        if(arr[n-1].charAt(0)=='m'){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while(t-->0){
            solve(t,reader);
        }
    }
}
