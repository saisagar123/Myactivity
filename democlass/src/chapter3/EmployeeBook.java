package chapter3;

import java.util.Scanner;

public class EmployeeBook
{
	public void menuBox()
	{
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			enterData();
			break;
		case 2:
			displayData();
			break;
		/*case 3:
			System.out.println("3.Display data");
			break;*/
		case 3:
			System.out.println("exit");
			exitMenu();
			break;
		default:
			break;
		}
	}
	public void enterData()
	{
		System.out.println("enter");
	}
	public void displayData()
	{
		System.out.println("display");
			
	}
	public void exitMenu()
	{
		System.out.println("exit");
			
	}
	public static void main(String args[])
	{
	System.out.println("1.Enter Data");
	//System.out.println("2.Update Data");
	System.out.println("2.Display Data");
	System.out.println("3.Exit");
	EmployeeBook book=new EmployeeBook();
	book.menuBox();
		
	}
}
