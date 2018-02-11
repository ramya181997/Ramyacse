import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
int c;
Scanner sc=new Scanner(System.in);
c=sc.nextInt();
if(c℅4==0&& c℅100==0&& c℅400==0)
{
System.out.println("it is a leap year");
}
if(c℅4==0||c℅100==0)
{
System.out.println("it is a leap year");
}

else
{
System.out.println("it is not a leap year");
}
}
}


