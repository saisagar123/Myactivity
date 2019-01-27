package chapter3;

import java.util.Scanner;

public class vowelCon 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	switch(c)
	{
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	System.out.println("Vowel");
	break;
	default:
	System.out.println("Consonent");
	break;	
	}
}
}
