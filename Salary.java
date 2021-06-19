import java.util.Scanner;
class Salary{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int bas=sc.nextInt();
            float grs,hra,da;
            if(bas<1500)
            {
                hra=0.1f*bas;
                da=0.9f*bas;
            }
            else{
                hra=500;
                da=0.98f*bas;
            }
            grs=bas+hra+da;
            System.out.println(grs);
        }
    }
}
