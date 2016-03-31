package Jabulile;


	public class WorkingCustomer extends TestCustomers implements Worker
	{
	private int hoursOfWork;
	public void setHoursOfWork(int hrs)
	{
	hoursOfWork = hrs;
	}
	public int getHoursOfWork()
	{
	return hoursOfWork;
	}
	public void work()
	{
	work();
	System.out.println("I have " + hoursOfWork +
	" hours worked!");
	}
	}

