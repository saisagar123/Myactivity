package democlass;
import java.util.*;
public class Employee
{
public static void main(String args[])
{
System.out.println("1.Enter Data");
System.out.println("2.Update Data");
System.out.println("3.Display Data");
System.out.println("4.Exit");
Scanner sc=new Scanner(System.in);
int option=sc.nextInt();
switch(option)
{
case 1:
	System.out.println("1.Enter data");
	break;
case 2:
	System.out.println("2.Update data");
	break;
case 3:
	System.out.println("3.Display data");
	break;
case 4:
	System.out.println("exit");
	break;
default:
	break;
}
}
}

