package Jabulile;

public class PreferredCustomer extends Customer
{
double discountRate;
 PreferredCustomer (int id, double bal, double rate)
{
super(id, rate);
discountRate = rate;
}
public void display()
{
super.display();
System.out.println(" Discount rate is " + discountRate);
}
}
