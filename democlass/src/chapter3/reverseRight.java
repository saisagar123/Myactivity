package chapter3;

public class reverseRight
{
	public  void print()
	{
		int k=1;
	for (int i=0; i<5; i++)
    {
        for (int j=5; j>i; j--)
        {    
            System.out.print("*");
        
        }
        System.out.println("");
    }
	}
	
	public static void main(String args[])
	{
		reverseRight er=new reverseRight();
		er.print();
	}
}
