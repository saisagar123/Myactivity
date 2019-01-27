package chapter04;
import java.util.*;

import chapter5.LibraryManage;

public class EmployeeBookMain 
{
	Scanner sc=new Scanner(System.in);
    List<EmployeeBook> book = new ArrayList<EmployeeBook>();//Array list object is created
    String Eid;
    String Ename;
    String Dept;
    String Designation;
    String DOB;
    String DOJ;
    String MS;
    String DOM;

	public void menubox()
	{
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			enterData();
			
		case 2:
			displayData();
			break;
		
		case 3:
			System.out.println("exit");
			//exitMenu();
			break;
		default:
			break;
		}
	}
	public void enterData()
	{
		System.out.println("enter");
		int x=1;
        do
        {
            System.out.println("enter the choice as 1 for continue");
            int choice=sc.nextInt();
            if (choice==1)
            
            {
                System.out.println("enter employee ID");
                Eid=sc.next();
                  System.out.println("enter employee name");
                Ename=sc.next();
                  System.out.println("enter Department");
                Dept=sc.next();
                System.out.println("enter Designation");
                Designation=sc.next();
                System.out.println("enter DoB");
                DOB=sc.next();
                System.out.println("enter DoJ");
                DOJ=sc.next();
                System.out.println("enter MARITAL STATUS");
                MS=sc.next();
                if(MS.equals("M")){
                	DOM=sc.next();
                }
                else {DOM="NIL";}
                  EmployeeBook s=new EmployeeBook(Eid,Ename,Dept,Designation,DOB,DOJ,MS,DOM);
                  book.add(s);
            }
          x--;
        }while(x >=0);
        
		
	}
	public void displayData()
	{
		String tempid;
		System.out.println("Display Data");
		
		System.out.println("give any id");
		
		tempid=sc.next();
		for(EmployeeBook bk:book)//ENHANCED FOR LOOP
		{
			if(bk.get_Eid().equals(tempid))
			{
				System.out.println(bk.get_Dept());
				System.out.println(bk.get_Ename());
				System.out.println(bk.get_Designation());
				System.out.println(bk.get_DOB());
				System.out.println(bk.get_DOJ());
				System.out.println(bk.get_MS());
				System.out.println(bk.get_DOM());

			}
		}
			
	}

public static void main(String args[])
{
	System.out.println("1.Enter Data");
	System.out.println("2.Display Data");
	System.out.println("3.Exit");
	EmployeeBookMain obj1=new EmployeeBookMain();
	obj1.menubox();
	
}
}
