import java.util.*;
import java.lang.*;
import java.io.*;

class Sticks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    String str = br.readLine();
		    String ip[] = str.split(" ");
		    int arr[] = new int[ip.length];
		    int val=0,max = Integer.MIN_VALUE;
		    for(int i=0;i<ip.length;i++){
		        val = Integer.parseInt(ip[i]);
		        if(val > max){
		            max = val;
		        }
		        arr[i] = val;
		    }
		    int array[] = new int[max+1];
		    for(int i=0;i<arr.length;i++){
		        array[arr[i]]++;
		    }
		    //System.out.println(Arrays.toString(array));
		    int val1 = 0,val2 = 0; 
		    for(int i=array.length-1;i>=0;i--){
		        if(array[i] >=4 && val1 == 0){
		            val1 = i;
		            val2 = i;
		            break;
		        } else if(array[i]>=4 && val1 != 0){
		            val2 = i;
		            break;
		        } else if(array[i]>=2 && val1 == 0){
		            val1 = i;
		        } else if(array[i]>=2 && val1 != 0){
		            val2 = i;
		            break;
		        }
		    }
		    if(val1 == 0 || val2 == 0){
		        System.out.println(-1);
		    } else {
		        System.out.println(val1*val2);
		    }
		    
		}
		
		br.close();
		
	}
}
