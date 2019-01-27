package chapter5;
import java.util.*;
//import java.io.*;
public class Furniture 
{
	Scanner sc = new Scanner(System.in);
	
	public void Chair()
	{
		System.out.println("Any Specifications");
		int height,width;
		char Decision=sc.next().charAt(0);
		if(Decision=='Y' | Decision=='y')
		{
			System.out.println("Enter Width and height in inches");
			height=sc.nextInt();
			width=sc.nextInt();			
		}
		else
		{
			height=40;
			width=18;
		}
		System.out.println("The height and width"+height+"and "+width);
		
		
	}
	public void Bookshelf()
	{
		System.out.println("Any Specifications");
		int heightofshelf,widthofshelf;
		char Decision=sc.next().charAt(0);
		if(Decision=='Y' | Decision=='y')
		{
			System.out.println("Enter Width and height in inches");
			heightofshelf=sc.nextInt();
			widthofshelf=sc.nextInt();			
		}
		else
		{
			heightofshelf=96;
			widthofshelf=48;
		}
		System.out.println("The height and width"+heightofshelf+"and "+widthofshelf);

	}
public static void main(String args[])
{
Furniture F=new Furniture();
System.out.println("1.Chair or 2.BookShelf");
Scanner u=new Scanner(System.in);
int mm=u.nextInt();
switch(mm)
{
case 1:
	F.Chair();
    break;
case 2:
	F.Bookshelf();
	break;
}
}
}
