import java.io.*;
import java.util.*;
class prim
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int flag=0,m=0;
m=a/2;
if(a==0||a==1)
{
System.out.print("no");
}
else
{
for(int i=2;i<=m;i++)
{
	if(a%i==0)
	{
System.out.print("no");
flag=1;
break;
	}
}
	if(flag==0)
	{
		System.out.print("yes");
	}
}
}
}
	
