package chapter6;
import java.util.*;

class DivisionOper
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
      try{
         int num1=sc.nextInt();
         int num2=sc.nextInt();
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
   }
}