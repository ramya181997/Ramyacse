import java.io.*;
import java.util.*;
class eve
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=sc.nextInt();
for(int i=a+1;i<n;i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
}
