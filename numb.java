import java.io.*;
import java.util.*;
class numb
{
    public static void main(String args[])
    {int sum=0;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
        }
        for(int i=0;i<K;i++)
        {
             sum=sum+a[i];
        
        }
        System.out.print(sum);
    }
}
