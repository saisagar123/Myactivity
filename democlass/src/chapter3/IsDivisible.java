package chapter3;
import java.util.*;
public class IsDivisible
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a%b!=0)
	{
		System.out.println("not Divisible");
	}
	else if(b==0)
	{
		System.out.println("B is Zero");
	}
	else
	{
		System.out.println(a/b);
	}
}
}
