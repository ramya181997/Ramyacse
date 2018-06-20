import java.io.*;
import java.util.*;
class palin
{
public static void main(String args[])
{int rev=0,m,temp;
System.out.print("Enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
temp=num;
while(num!=0)
{m=num%10;
rev=rev*10+m;
num=num/10;
}
if(temp==rev)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
