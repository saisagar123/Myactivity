package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManageMain 
{
	public static void main(String[] arg)
    
    {
         List<LibraryManage> book = new ArrayList<LibraryManage>();

         String Auth_name;
         int Price;
         String title;
         String soft_ver;
         String soft_name;
         int no_pages;
         int choice;
         Scanner sc1= new Scanner(System.in);
         int x=2;
         do
         {
             System.out.println("enter the choice as 1 for continue");
             choice=sc1.nextInt();
             if (choice==1)
             
             {
                 System.out.println("enter Author name");
                 Auth_name=sc1.next();
                   System.out.println("enter Price");
                 Price=sc1.nextInt();
                   System.out.println("enter Title");
                 title=sc1.next();
                 System.out.println("enter software version");
                 soft_ver=sc1.next();
                 System.out.println("enter soft name");
                 soft_name=sc1.next();
                 System.out.println("enter no of pages");
                 no_pages=sc1.nextInt();
                   LibraryManage s=new LibraryManage(Auth_name,Price,title,soft_ver,soft_name,no_pages);
                   book.add(s);
             }
           x--;
         }while(x >=0);
         
         for(LibraryManage su:book)
         {
             System.out.println(su.getM_name());
             System.out.println(su.getM_Price());
 System.out.println(su.getM_title());
 System.out.println(su.getM_soft_ver());
 System.out.println(su.getM_soft_name());
 System.out.println(su.getM_no_pages());



 

         }
         
           
    }
}
