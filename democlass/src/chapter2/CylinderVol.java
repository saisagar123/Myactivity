package chapter2;
import java.util.*;
public class CylinderVol
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius and height of cylinder");
	int r=sc.nextInt();
	int h=sc.nextInt();
	float pi=22/7;
	float vol=pi*r*r*h;
	System.out.println("volume"+vol);
}
}
