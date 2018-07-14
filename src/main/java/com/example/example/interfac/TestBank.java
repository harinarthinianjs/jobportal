package com.example.example.interfac;
abstract class Bank{
abstract int getRateOfInterest();
}
class WellsFargo extends Bank
{
int getRateOfInterest()
{
	return 7;
}
}
class TD extends Bank
{
int getRateOfInterest()
{
	return 8;
}
}
class TestBank
{
	public static void main( String args[])
	{
		Bank b;
		b=new WellsFargo();
		System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
		b=new TD();
		System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
	   	}
	
	
}