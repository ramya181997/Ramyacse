import java.io.*;
import java.util.*;
class ramu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=5;i<30;i++)
        {
        while(i%a==0)
        {
            System.out.print(i+" ");

break;
        }
        }
    }
}
