package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hardwaremain 
{
public static void main(String[] arg)
    
    {
         List<Hardware> book1 = new ArrayList<Hardware>();

         String Auth_name;
         int Price;
         String title;
         String hard_cat;
         String Publish;
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
                 System.out.println("enter hardware catogary");
                 hard_cat=sc1.next();
                 System.out.println("enter Publisher");
                 Publish=sc1.next();
                 System.out.println("enter no of pages");
                 no_pages=sc1.nextInt();
                   Hardware s=new Hardware(Auth_name,Price,title,hard_cat,Publish,no_pages);
                   book1.add(s);
             }
           x--;
         }while(x >=0);
         
         for(Hardware su:book1)
         {
             System.out.println(su.getM_name());
             System.out.println(su.getM_Price());
 System.out.println(su.getM_title());
 System.out.println(su.getM_hard_cat());
 System.out.println(su.getM_Publish());
 System.out.println(su.getM_no_pages());



 

         }
         
           
    }
}
