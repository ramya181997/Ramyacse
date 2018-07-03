import java.io.*;
import java.util.*;
class prii
{
public static void main(String args[])
{int flag;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i<=b;i++)
{flag=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag=1;
break;
}

}
if(flag==0)
{
System.out.println(i);
}
}
}
}

