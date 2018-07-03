import java.io.*;
import java.util.*;
class amstrong1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=sc.nextInt();
int k;
int s=0,m;
for(int i=a;i<=n;i++)
{
s=0;
k=i;
while(k>0)
{
m=k%10;
s=s+(m*m*m);
k=k/10;
}
if(s==i)
{
System.out.println(s);
}
}
}
}


