import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{int rev=0,m;
System.out.print("Enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

while(num>0)
{m=num%10;
rev=rev*10+m;
num=num/10;
}
System.out.println(rev);
}
}
