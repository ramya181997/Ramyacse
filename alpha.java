import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
char c;
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
if((c>='a'&&c<='z')||(c>='A'&&c<='B'))
{
System.out.println("it is an alphabet");
}

else
{
System.out.println("it is not an alphabet");
}
}
}
