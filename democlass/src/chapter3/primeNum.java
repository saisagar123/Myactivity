package chapter3;

import java.util.Scanner;

public class primeNum
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
	int m=sc.nextInt();
    int n,b,i;
	
	System.out.println("Enter the no ");
	
	for(b=2;b<=m;b++)
	{
	
 	 i=2;
 	while(b%i!=0)
  	{
  		i++;
  	}
  	
 	if(i==b)
  	{
		System.out.println(b) ;
		}
		
  }
}
}
