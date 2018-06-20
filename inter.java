import java.io.*;
import java.util.*;
class inter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
for(int i=n+1;i<a;i++)
{
if(i%2!=0)
{
System.out.print(i+" ");
}
}
}
}

