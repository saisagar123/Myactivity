package chapter6;

import java.util.Scanner;

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class NewAxis
{
   void productCheck(int age) throws InvalidProductException{
	if(age<20 || age>59){
		throw new InvalidProductException("age Restriction");
	}
   }
   
    public static void main(String args[])
    {
    	NewAxis obj = new NewAxis();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter name contact and age");
    	String Ename=sc.nextLine();
    	String contact=sc.nextLine();
    	int age=sc.nextInt();
        try
        {
            obj.productCheck(age);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("name:"+Ename);
        System.out.println("contact:"+contact);
        System.out.println("age"+age);


    }
}

