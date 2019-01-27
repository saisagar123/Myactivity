package democlass;
import java.util.*;
public class Grocery
{
int weight;
public void weightNow()
{
	System.out.println("enter weight");
	Scanner sc= new Scanner(System.in);
	int wt=sc.nextInt();
	weight=wt;
}
public void checkWeight()
{
	System.out.println("the weight now"+"   "+weight);
}
public static void main(String args[])
{
	Grocery gr=new Grocery();
	gr.weightNow();
	gr.checkWeight();
}
}
