package chapter2;

import java.util.Scanner;

public class CensiusFarhen
{
public static void main(String args[])
{
	System.out.println("Enter censius");
	Scanner sc=new Scanner(System.in);
	float c=sc.nextFloat();
	float fa=c*(9/5)+32;
	System.out.println("Farenheit = "+fa);

}
}
