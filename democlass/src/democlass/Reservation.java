package democlass;
public class Reservation
{
public int TicketId;
public Reservation(int tid)
{
	TicketId=tid;
}
public int ShowTicket()
{
return TicketId;
}
public static void main(String args[])
{
	Reservation Rnew=new Reservation(10001);
	int x=Rnew.ShowTicket();
	System.out.println(x);
}
}
