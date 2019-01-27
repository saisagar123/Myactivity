package chapter2;
import java.util.*;
public class Distance
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter intial velocity,accelaration,time");
	int u=sc.nextInt();
	int a=sc.nextInt();
	int t=sc.nextInt();
	float dis=u*t+(a*t*t)/2;
	System.out.println("distance ="+dis+"meters");
}
}
