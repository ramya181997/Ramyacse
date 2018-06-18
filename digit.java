import java.io.*;
import java.util.*;
class digit
{
	public static void main(String args[])
	{
	int count=0,num=548;
	while(num!=0)
	{
		num=num/10;
		++count;
	}
	System.out.println("Number of Digits:"+count);
	}
}
